package com.montnets.java.abstractFactory;

// 颜色工厂，继承抽象工厂
public class ColorFactory extends AbstractFactory{

	@Override
	public IShape getShape(String shape) {
		return null;
	}

	@Override
	public IColor getcColor(String color) {
		
		if("红".equals(color)) {
			return new RedImpl();
		} else if ("蓝".equals(color)) {
			return new BuleImpl();
		} 
		
		return null;
	}

}
