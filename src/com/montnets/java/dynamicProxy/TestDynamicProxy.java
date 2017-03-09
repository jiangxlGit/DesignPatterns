package com.montnets.java.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDynamicProxy {
	
	@Before
	public void befroe(){
		System.out.println("开始登录游戏。。。");
	}
	
	@Test
	public void test01(){
		
		IGamePlayer gp = new GamePlayerImpl("张三");
		InvocationHandler gpHandler = new GamePlayerInvocationHandler(gp);
		
		// 获取真实主题类的ClassLoader，ClassLoader就是用来动态加载class文件到内存当中用的
		ClassLoader classLoader = gp.getClass().getClassLoader();
		
		// 动态产生一个代理者。
		Class<?>[] cls = new Class[] { IGamePlayer.class };
		
		/*
		 * ClassLoader classLoader 		---- 指定被代理对象的类加载器
		 * Class[] cls 					---- 指定被代理对象所实现的接口
		 * InvocationHandler gpHandler 	---- 指定需要调用的InvocationHandler对象
		 */
		IGamePlayer proxyGp = (IGamePlayer) Proxy.newProxyInstance(classLoader,cls, gpHandler);
		
		proxyGp.login("zhangsan", "123456");
		proxyGp.killBoss();
		proxyGp.upGrade();
		
	}
	
	@After
	public void after(){
		System.out.println("加载结束！");
	}
	
	
}