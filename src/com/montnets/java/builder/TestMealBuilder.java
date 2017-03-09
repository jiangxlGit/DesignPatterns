package com.montnets.java.builder;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

// 点餐测试
public class TestMealBuilder {

	@Before
	public void before(){
		System.out.println("开始点餐。。。");
	}
	
	@Test
	public void test01(){
		
		MealBuilder builder = new MealBuilder();
		Meal meal = builder.getVagBurgerAndCoffee();
		meal.showItems();
	}
	
	@After
	public void after(){
		System.out.println("点餐完成！");
	}
	
}
