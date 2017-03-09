package com.montnets.java.proxy;

// 图片加载原始类
public class RealImageImpl implements IImage{

	private String fileName;
	
	public RealImageImpl(String fileName){
		this.fileName = fileName;
		this.loadFromDisk(fileName);
	}
	
	@Override
	public void display() {
		System.out.println("显示图片"+fileName);
	}

	private void loadFromDisk(String fileName){
		System.out.println("从磁盘加载图片" + fileName);
	}
	
}
