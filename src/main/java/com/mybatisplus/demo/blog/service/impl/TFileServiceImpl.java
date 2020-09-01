package com.mybatisplus.demo.blog.service.impl;

import com.mybatisplus.demo.blog.entity.TFile;
import com.mybatisplus.demo.blog.mapper.TFileMapper;
import com.mybatisplus.demo.blog.service.TFileService;
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
public class TFileServiceImpl extends ServiceImpl<TFileMapper, TFile> implements TFileService {

}
