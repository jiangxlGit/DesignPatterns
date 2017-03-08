package com.montnets.java.abstractFactory;

// 矩形
public class RectangleImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("画一个矩形！");
	}

}
