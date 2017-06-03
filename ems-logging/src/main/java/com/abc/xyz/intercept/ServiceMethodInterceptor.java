package com.abc.xyz.intercept;

import org.apache.log4j.Logger;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceMethodInterceptor {

	private static final Logger LOGGER = Logger.getLogger(ServiceMethodInterceptor.class);
	
	@Around("execution(* com.abc.xyz.business.impl.*.*(..))")
	public Object invoke(ProceedingJoinPoint joinPoint) throws Throwable {
        try{
        	if(LOGGER.isInfoEnabled()){
        		LOGGER.info(joinPoint.getSignature().getClass()+" - in class");
        		LOGGER.info(joinPoint.getSignature().getName()+" - execution start");
        		LOGGER.info(joinPoint.getArgs()+" - method argument");
    		}
            Object result = joinPoint.proceed();
            return result;
        } catch(Exception ne){
        	if(LOGGER.isInfoEnabled()){
        		LOGGER.info(joinPoint.getSignature().getName()+" - exception");
        		LOGGER.info(joinPoint.getSignature().getName()+" - threw "+ne.getMessage());
    		}
            throw ne;
        } finally{
        	if(LOGGER.isInfoEnabled()){
        		LOGGER.info(joinPoint.getSignature().getName()+" - execution end");
    		}
        }
    }
	
	@Around("execution(* com.avishek.service.impl.*.create(..))")
	public void validationCheckingBeforeCreate(JoinPoint joinPoint) throws Exception{
		Object obj = joinPoint.getArgs()[0];
		//beanValidator.validate(obj.getClass().cast(obj));
	}
	
	@Around("execution(* com.avishek.service.impl.*.update(..))")
	public void validationCheckingBeforeUpdate(JoinPoint joinPoint) throws Exception{
		Object obj = joinPoint.getArgs()[0];
		//beanValidator.validate(obj.getClass().cast(obj));
	}
}
