package com.montnets.java.abstractFactory;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


// 测试抽象工厂模式
public class TestAbstractFactory {

	@Before
	public void setUp(){
		
		System.out.println("before");
		
	}
	
	@Test
	public void test1(){
		
		AbstractFactory factory = FactoryProducer.getAbstractFactory("形状");
		IShape shape = factory.getShape("圆");
		shape.draw();
		
	}
	
	@Test(expected=ArithmeticException.class)
	public void test2(){
		
		System.out.println("@Test(expected=ArithmeticException.class)");
		throw new ArithmeticException();
		
	}
	
	@Test(timeout=60)
	public void test3(){
		System.out.println("@Test(timeout=60)");
	}
	
	@After
	public void setClear(){
		System.out.println("after");
	}
	
}
/**
 * JUnit4使用Java5中的注解（annotation），以下是JUnit4常用的几个annotation： 
 * 		@Before：初始化方法   对于每一个测试方法都要执行一次（注意与BeforeClass区别，后者是对于所有方法执行一次）
 * 		@After：释放资源  对于每一个测试方法都要执行一次（注意与AfterClass区别，后者是对于所有方法执行一次）
 * 		@Test：测试方法，在这里可以测试期望异常和超时时间 
 * 		@Test(expected=ArithmeticException.class)检查被测方法是否抛出ArithmeticException异常 
 * 		@Ignore：忽略的测试方法 
 * 		@BeforeClass：针对所有测试，只执行一次，且必须为static void 
 * 		@AfterClass：针对所有测试，只执行一次，且必须为static void 
 * 一个JUnit4的单元测试用例执行顺序为： 
 * 		@BeforeClass -> @Before -> @Test -> @After -> @AfterClass; 
 * 每一个测试方法的调用顺序为： 
 * 		@Before -> @Test -> @After; 
 */
