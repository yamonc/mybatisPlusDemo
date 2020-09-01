package com.mybatisplus.demo;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.mybatisplus.demo.domain.User;
import com.mybatisplus.demo.mapper.UserMapper;
import lombok.val;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author yamon
 * @Date 2020/8/29 9:38
 * @Description
 * @Version 1.0
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SimpleDemoTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println(("----- selectAll method test ------"));
        final List<User> users = userMapper.selectList(null);
        Assert.assertEquals(5, users.size());
        users.forEach(System.out::println);
    }
    @Test
    public void testSave(){
        final User entity = new User();
        entity.setAge(33);
        entity.setEmail("333");
        entity.setName("cym33");
        final int insert = userMapper.insert(entity);
        System.out.println(insert);
        System.out.println(entity);
    }
    @Test
    public void testUpdate(){
        final User user = userMapper.selectById(4);
        user.setName("陈亚萌333");
        userMapper.updateById(user);
    }

    @Test
    public void testVersion(){
        //查询用户信息
        final User user = userMapper.selectById(1L);
        //修改用户信息
        user.setName("yyh");
        user.setEmail("2222@11.com");
        //执行更新操作
        final int i = userMapper.updateById(user);
        System.out.println(i);

    }

    /**
     * 多线程下
     */
    @Test
    public void testVersion2(){
        //线程1
        final User user = userMapper.selectById(1L);
        user.setName("yyh");
        user.setEmail("2222@11.com");
        //模拟另外一个线程执行了插队操作
        final User user2 = userMapper.selectById(1L);
        user2.setName("cym");
        user2.setEmail("111@11.com");
        userMapper.updateById(user2);

        //执行更新操作
         userMapper.updateById(user);

    }

    @Test
    public void testSelectById(){
        final User user = userMapper.selectById(1L);
        System.out.println(user);
    }
    @Test
    public void testSelectByIds(){
        final List<User> users = userMapper.selectBatchIds(Arrays.asList(1, 2, 3));
        users.forEach(System.out::println);
    }

    @Test
    public void testSelectByCondition(){
        final Map<String, Object> objectObjectMap = new HashMap<>();
        //自定义查询的条件
        objectObjectMap.put("name","cym");
        objectObjectMap.put("age","18");
        final List<User> users = userMapper.selectByMap(objectObjectMap);
        users.forEach(System.out::println);
    }
    @Test
    public void testPage(){
        final Page<User> page = new Page<>(2,3);
        final Page<User> userPage = userMapper.selectPage(page, null);
        final List<User> records = userPage.getRecords();
        System.out.println(userPage);
        records.forEach(System.out::println);
    }

    @Test
    public void testDelete(){
        userMapper.deleteBatchIds(Arrays.asList( 1300333257022312451L,1300333257022312452L));
    }

    @Test
    public void testDeleteLogic(){
        final User user = userMapper.selectById(1L);
        System.out.println(user);
    }

}
