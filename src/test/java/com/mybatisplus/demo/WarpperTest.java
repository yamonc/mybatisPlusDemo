package com.mybatisplus.demo;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
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
public class WarpperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        //查询name不为空，邮箱不为空,age>=12
        final QueryWrapper<User> userQueryWrapper = new QueryWrapper<>();
        userQueryWrapper.isNotNull("name")
        .isNotNull("email").ge("age",12);
        userMapper.selectList(userQueryWrapper).forEach(System.out::println);
    }
    @Test
    public void testName(){
        final QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("name","cym");
        final val user = userMapper.selectOne(queryWrapper);
        System.out.println(user);
    }

    @Test
    public void test3(){
        final QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.between("age",20,30);
        final val count = userMapper.selectCount(queryWrapper);
        System.out.println(count);
    }

    @Test
    public void test4(){
        final QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.notLike("name","e").likeRight("email","t");
        final List<Map<String, Object>> maps = userMapper.selectMaps(queryWrapper);
        maps.forEach(System.out::println);
    }

    @Test
    public void test5(){
        final QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.inSql("id","select id from user where id<3");
        final List<Object> objects = userMapper.selectObjs(queryWrapper);
        objects.forEach(System.out::println);
    }
    @Test
    public void test6(){
        final QueryWrapper<User> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("id");
        final List<User> users = userMapper.selectList(queryWrapper);
        users.forEach(System.out::println);
    }

}
