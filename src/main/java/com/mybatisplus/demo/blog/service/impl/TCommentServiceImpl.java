package com.mybatisplus.demo.blog.service.impl;

import com.mybatisplus.demo.blog.entity.TComment;
import com.mybatisplus.demo.blog.mapper.TCommentMapper;
import com.mybatisplus.demo.blog.service.TCommentService;
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
public class TCommentServiceImpl extends ServiceImpl<TCommentMapper, TComment> implements TCommentService {

}
