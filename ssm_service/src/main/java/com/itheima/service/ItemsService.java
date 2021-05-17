package com.itheima.service;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 商品业务层接口
 */
public interface ItemsService {
    //查询所有商品列表数据
    public List<Items> findAll();

    // 保存商品功能
    int save(Items items);
}
