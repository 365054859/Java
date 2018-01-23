package com.service;

import java.util.ArrayList;

import org.apache.ibatis.session.ResultHandler;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.entity.Goods;

public class GoodsServiceImpl implements GoodsService{
	@Autowired
	private SqlSessionTemplate sqlSession;
	
	@Override
	public int save(Goods goods) {
		 Goods goods1 = new Goods(13,"aaaa",300);
		 Goods goods2 = new Goods(12,"bbbb",300);
		 sqlSession.insert("com.dao.GoodsMapper.save",goods1);
		 sqlSession.insert("com.dao.GoodsMapper.save",goods2);
		 return 1;
	}

	@Override
	public int delete(Goods goods) {
		Goods goods1 = new Goods(15);
		Goods goods2 = new Goods(15);
		sqlSession.delete("com.dao.GoodsMapper.delete",goods1);
		sqlSession.delete("com.dao.GoodsMapper.delete",goods2);
		
		return 1;
	}

	@Override
	public int update(Goods goods) {
		Goods goods1 = new Goods(14,"Æ»¹û",800);
		sqlSession.update("com.dao.GoodsMapper.update",goods1);
		return 1;
	}

	@Override
	public int selectById(Goods goods) {
		Goods goods1=new Goods(15);
		sqlSession.selectOne("com.dao.GoodsMapper.selectById", goods1);
		return 1;
	}

	@Override
	public ArrayList<Goods> selectAll() {
		ArrayList<Goods> goods = new ArrayList<Goods>();
	    sqlSession.selectList("com.dao.GoodsMapper.selectAll",goods);
		return goods;
	}
	
}
