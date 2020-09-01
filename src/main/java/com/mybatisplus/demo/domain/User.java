package com.mybatisplus.demo.domain;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * @Author yamon
 * @Date 2020/8/29 9:37
 * @Description
 * @Version 1.0
 */
@Data
public class User {
    // 对应数据库中的主键（uuid、自增id、雪花算法、redis、zookeeper）
    @TableId(type = IdType.AUTO)
    private Long id;
    private String name;
    private Integer age;
    private String email;
    //乐观锁
    @Version
    private Integer version;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;
    @TableLogic
    private Integer deleted;
}
