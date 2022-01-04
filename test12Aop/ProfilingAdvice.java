package test12Aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class ProfilingAdvice {

	public Object trace(ProceedingJoinPoint joinPoint) throws Throwable {
		
		String signatureString = joinPoint.getSignature().toShortString();
		System.out.println(signatureString + " 시작");
		long start = System.currentTimeMillis();
		
		Object result = null;
		result = joinPoint.proceed();
		
		long finish = System.currentTimeMillis();
		
		System.out.println(signatureString + " 종료");
		System.out.println(signatureString + " 실행 시간 : " + (finish - start) + "ms");
		return result;

	}
}
