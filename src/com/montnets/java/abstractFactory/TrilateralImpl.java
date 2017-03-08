package com.montnets.java.abstractFactory;

// 三角形
public class TrilateralImpl implements IShape{

	@Override
	public void draw() {
		System.out.println("画一个三角形！");
	}
	
}
