package com.itheima.service;

import com.itheima.pojo.Items;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 业务层测试类
 */
@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "classpath:spring-service.xml")
public class ServiceTest {

    @Autowired
    private ItemsService itemsService;


    @Test
    public void testFindAll() {
        System.out.println(itemsService.findAll());
    }

    @Test
    public void testInsert() {
        Items items = new Items();
        items.setName("2号技师");
        items.setPic("1888");
        items.setDetail("淡水");
        itemsService.save(items);
    }

}
