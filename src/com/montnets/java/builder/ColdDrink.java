package com.montnets.java.builder;

// 冷饮
public abstract class ColdDrink implements IItem {

	@Override
	public IPacking packing() {
		return new BottleImpl();
	}

	@Override
	public abstract double price();

}
