package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor{
	public Object invoke(MethodInvocation invocation) throws Throwable{
		System.out.println("[ȣ����]: LogginAdvice");
		System.out.println(invocation.getMethod()+"�޼ҵ� ȣ����");
		Object object = invocation.proceed();
		System.out.println("[ȣ����: LogginAdvice");
		System.out.println(invocation.getMethod()+"�޼ҵ� ȣ����");
		return null;
	}
}
