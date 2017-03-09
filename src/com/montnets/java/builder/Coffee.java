package com.montnets.java.builder;

// 咖啡
public class Coffee extends ColdDrink{

	@Override
	public String name() {
		return "咖啡";
	}

	@Override
	public double price() {
		return 18.8;
	}

}
