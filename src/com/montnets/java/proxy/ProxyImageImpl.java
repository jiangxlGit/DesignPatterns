package com.montnets.java.proxy;

// 图片加载代理类
public class ProxyImageImpl implements IImage {

	private String fileName;
	private RealImageImpl realImage;
	
	public ProxyImageImpl(String fileName){
		this.fileName = fileName;
	}
	
	@Override
	public void display() {
		if (realImage == null) {
			realImage = new RealImageImpl(fileName);
		}
		realImage.display();
	}

}
