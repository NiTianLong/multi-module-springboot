package com.longe.Controller;


import com.longe.entity.Goods;
import com.longe.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GoodsController {

    @Autowired
    private GoodsService goodsService;

    @RequestMapping("index")
    public Goods getGoods(){

        return goodsService.getGoodsById();
    }
}
