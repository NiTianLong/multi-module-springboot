package com.longe.service;

import com.longe.dao.GoodsMapper;
import com.longe.entity.Goods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GoodsService {

    @Autowired
    private GoodsMapper goodsMapper;

    public Goods getGoodsById(){

        return goodsMapper.getGoodsById(1);
    }
}