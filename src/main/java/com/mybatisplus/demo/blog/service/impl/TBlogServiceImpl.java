package com.mybatisplus.demo.blog.service.impl;

import com.mybatisplus.demo.blog.entity.TBlog;
import com.mybatisplus.demo.blog.mapper.TBlogMapper;
import com.mybatisplus.demo.blog.service.TBlogService;
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
public class TBlogServiceImpl extends ServiceImpl<TBlogMapper, TBlog> implements TBlogService {

}
