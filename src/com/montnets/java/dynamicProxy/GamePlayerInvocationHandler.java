package com.montnets.java.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

// 动态代理处理器类，InvocationHandler是JD提供的动态代理接口，对被代理类的方法进行代理。
public class GamePlayerInvocationHandler implements InvocationHandler {

	// 被代理的对象
	private Object object;

	// //将需要代理的实例通过处理器类的构造方法传递给代理。
	public GamePlayerInvocationHandler(Object object) {
		this.object = object;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		Object result = null;
		if ("login".equalsIgnoreCase(method.getName())) {
			// 这个在主题方法不受任何影响的情况下，在主题方法前后添加新的功能，或者增强主题方法，
			// 从侧面切入从而达到扩展的效果的编程，就是面向切面编程(AOP Aspect Oriented Programming)。
			// AOP并不是新技术，而是相对于面向对象编程的一种新的编程思想。在日志，事务，权限等方面使用较多。
			System.out.println("代理登录游戏！");
			result = method.invoke(this.object, args);
			return result;
		}
		result = method.invoke(this.object, args);
		return result;

	}

}
