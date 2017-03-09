package com.montnets.java.builder;

// 汉堡
public abstract class Burger implements IItem {

	@Override
	public IPacking packing() {
		return new WrapperImpl();
	}

	@Override
	public abstract double price();

}
