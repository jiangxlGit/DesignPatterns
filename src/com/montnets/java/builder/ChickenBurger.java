package com.montnets.java.builder;

// 鸡肉汉堡
public class ChickenBurger extends Burger{

	@Override
	public String name() {
		return "鸡肉汉堡";
	}

	@Override
	public double price() {
		return 19.9;
	}

}
