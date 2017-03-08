package com.montnets.java.abstractFactory;

// 形状工厂，继承抽象工厂
public class ShapeFactory extends AbstractFactory{

	@Override
	public IShape getShape(String shape) {
		
		if("三角形".equals(shape)) {
			return new TrilateralImpl();
		} else if ("圆".equals(shape)) {
			return new CircleImpl();
		} else if ("矩形".equals(shape)) {
			return new RectangleImpl();
		}
		
		return null;
	}

	@Override
	public IColor getcColor(String color) {
		return null;
	}

}
