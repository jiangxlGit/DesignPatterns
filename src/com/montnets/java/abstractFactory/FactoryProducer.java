package com.montnets.java.abstractFactory;

// 工厂调度类，根据需求调用相应的工厂
public class FactoryProducer {

	private static AbstractFactory factory = null;
	
	public static AbstractFactory getAbstractFactory(String abstractFactory){
		
		if ("形状".equals(abstractFactory)) {
			factory =  new ShapeFactory();
		} else if("颜色".equals(abstractFactory)) {
			factory =  new ColorFactory();
		}
		
		return factory;
		
	}
	
}
