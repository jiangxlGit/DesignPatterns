package com.montnets.java.builder;

import java.util.ArrayList;
import java.util.List;

// 点餐
public class Meal {

	public List<IItem> items = new ArrayList<IItem>();
	
	// 添加菜单
	public void addItem(IItem item){
		items.add(item);
	}
	
	// 计算总价
	public double getCost(){
		double sum = 0.0;
		for (IItem iItem : items) {
			sum += iItem.price();
		}
		return sum;
	}
	
	// 打印菜单详情
	public void showItems(){
        for (IItem item : items) {
           System.out.print("菜名 : "+item.name());
           System.out.print(", 包装方式 : "+item.packing().pack());
           System.out.println(", 单价 : "+item.price());
        }		
    }
	
}
