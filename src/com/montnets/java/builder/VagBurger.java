package com.montnets.java.builder;

// 蔬菜汉堡
public class VagBurger extends Burger{

	@Override
	public String name() {
		return "蔬菜汉堡";
	}

	@Override
	public double price() {
		return 11.9;
	}

}
