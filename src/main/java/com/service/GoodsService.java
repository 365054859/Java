package com.service;

import java.util.ArrayList;
import java.util.List;

import com.entity.Goods;

public interface GoodsService {
	int save(Goods goods);
	int delete(Goods goods);
	int update(Goods goods);
	int selectById(Goods goods);
	ArrayList<Goods> selectAll();
}
