package test13Aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class AnnotLogginAspect {

	@Before("execution(public * test13Aop.*.*(..))")
	public String beforeLogging(JoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("calling..." + methodName);
		return methodName;
	}
	
	@AfterReturning(pointcut="execution(public * test13Aop.*.*(..))",returning="ret")
	public void returningLogging(JoinPoint joinPoint, Object ret) {
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("called successfully..." + methodName + "...returns..." + ret);
	}
	
	@AfterThrowing(pointcut="execution(public * test13Aop.*.*(..))", throwing="ex")
	public void throwingLogging(JoinPoint joinPoint, Throwable ex) {
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("exception occured..." + methodName + "throws..." + 
		ex.getClass().getName());
	}
	
	@After("execution(public * test13Aop.*.*(..))")
	public void afterLogging(JoinPoint joinPoint) {
		String methodName=joinPoint.getSignature().getName();
		
		System.out.println("finish call : " + methodName);
	}
}
