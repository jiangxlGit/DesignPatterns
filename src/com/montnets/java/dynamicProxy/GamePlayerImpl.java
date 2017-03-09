package com.montnets.java.dynamicProxy;


// 游戏接口实现，需要被代理类
public class GamePlayerImpl implements IGamePlayer {

	private String name;
	
	public GamePlayerImpl(String name){
		this.name = name;
	}
	
	@Override
	public void login(String username, String password) {
		 System.out.println("登录名为 "+username+" 进入游戏，" + name + " 登录成功！");
	}

	@Override
	public void killBoss() {
		System.out.println(this.name + " 击杀了Boss！");
	}

	@Override
	public void upGrade() {
		System.out.println(this.name + "升级了！");
	}

}
