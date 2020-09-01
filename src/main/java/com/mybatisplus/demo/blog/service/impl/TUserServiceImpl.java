package com.mybatisplus.demo.blog.service.impl;

import com.mybatisplus.demo.blog.entity.TUser;
import com.mybatisplus.demo.blog.mapper.TUserMapper;
import com.mybatisplus.demo.blog.service.TUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yamon
 * @since 2020-09-01
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements TUserService {

}
