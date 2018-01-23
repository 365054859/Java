package com.test;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.entity.Goods;
import com.service.GoodsService;
import com.service.GoodsServiceImpl;

public class GoodsTest {
	private GoodsService goodsServiceImpl;
	@Before
	public void init() {
		FileSystemXmlApplicationContext app = 
				new FileSystemXmlApplicationContext("src/main/resources/applicationContext.xml");
		goodsServiceImpl = app.getBean("goodsServiceImpl",GoodsServiceImpl.class);
	}
	
	@Test
	public void save() {
		int row = goodsServiceImpl.save(null);
		System.out.println(row);
	}
	
	@Test
	public void delete() {
		int row = goodsServiceImpl.delete(null);
		System.out.println(row);
	}
	@Test
	public void update() {
		int row = goodsServiceImpl.update(null);
		System.out.println(row);
	}
	@Test 
	public void selectById() {
		int row = goodsServiceImpl.selectById(null);
		System.out.println(row);
	}
	
	@Test
	public void selectAll() {
		ArrayList<Goods> goods = goodsServiceImpl.selectAll();
		for (Goods goods2 : goods) {
			System.out.println(goods2.getGoodsId());
			System.out.println(goods2.getGoodsName());
			System.out.println(goods2.getGoodsPrice());
		}
	}
}
