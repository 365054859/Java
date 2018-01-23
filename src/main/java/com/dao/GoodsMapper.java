package com.dao;

import com.entity.Goods;

public interface GoodsMapper {
	int save(Goods goods);
	int delete(Goods goods);
	int update(Goods goods);
	int selectById(Goods goods);
}
