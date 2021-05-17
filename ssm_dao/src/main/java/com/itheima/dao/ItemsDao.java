package com.itheima.dao;

import com.itheima.pojo.Items;

import java.util.List;

/**
 * 商品持久层
 */
public interface ItemsDao {
    //查询所有商品列表数据
    List<Items> findAll();

    // 保存商品功能
    int save(Items items);
}
