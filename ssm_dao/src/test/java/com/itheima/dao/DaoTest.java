package com.itheima.dao;

import com.itheima.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 持久层测试类
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-mybatis.xml")
public class DaoTest {
    @Autowired
    private ItemsDao itemsDao;

    @Test
    public void testFindAll() {
        System.out.println(itemsDao.findAll());
    }

    @Test
    public void testInsert() {
        Items items = new Items();
        items.setName("1号技师");
        items.setPic("888");
        items.setDetail("呵呵");
        itemsDao.save(items);
    }

}
