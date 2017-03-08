package com.montnets.java.abstractFactory;

/**
 * 
 * @功能概要： 抽象工厂模式<br>
 * @项目名称： 设计模式<br>
 * @初创作者： jiangxl  email：836200494@qq.com <br>
 * @公司名称： ShenZhen Montnets Technology CO.,LTD.<br>
 * @创建时间： 2017-3-8 上午10:33:10<br>
 */

// 抽象工厂类
public abstract class AbstractFactory {

	public abstract IShape getShape(String shape);
	public abstract IColor getcColor(String color);
	
}
