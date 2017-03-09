package com.montnets.java.builder;

// 构建点餐类
public class MealBuilder {

	public Meal getVagBurgerAndCoffee(){
		
		// 创建点餐
		Meal meal = new Meal();
		// 写菜单
		IItem vagBurger = new VagBurger();
		IItem coffee = new Coffee();
		
		// 提交点餐
		meal.addItem(vagBurger);
		meal.addItem(coffee);
		meal.addItem(new Pepsi());
		
		return meal;
		
	}
	
}
