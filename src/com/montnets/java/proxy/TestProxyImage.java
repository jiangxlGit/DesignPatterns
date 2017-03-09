package com.montnets.java.proxy;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// 图片代理类测试
public class TestProxyImage {

	@Before
	public void befroe(){
		System.out.println("开始加载图片。。。");
	}
	
	@Test
	public void test01(){
		
		IImage image = new ProxyImageImpl("test.jpg");
		image.display();
		System.out.println();
		// 这里就不需要从磁盘中加载图片了
		image.display();
		
	}
	
	@After
	public void after(){
		System.out.println("加载结束！");
	}
	
}
