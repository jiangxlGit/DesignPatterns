package com.montnets.java.abstractFactory;

// 红色
public class RedImpl implements IColor {
	
	@Override
	public void fill() {
		System.out.println("喷成红色！");
	}

}
