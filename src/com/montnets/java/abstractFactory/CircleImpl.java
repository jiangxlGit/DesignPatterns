package com.montnets.java.abstractFactory;

// 圆
public class CircleImpl implements IShape {
	
	@Override
	public void draw() {
		System.out.println("画一个圆！");
	}

}
