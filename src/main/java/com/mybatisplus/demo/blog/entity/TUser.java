package com.mybatisplus.demo.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author yamon
 * @since 2020-09-01
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class TUser implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private String avatar;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String email;

    private String nickName;

    private String password;

    private Integer type;

    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date updateTime;

    private String userName;

    private Long fileId;

    private String registerMethod;

    private String token;

    private String shortMessage;

    private String telephone;

    private String location;

    private String job;

    private String city;

    private String district;

    private String province;

    private Date updatePwTime;

    private String salt;

    private String githubUrl;

    private String qqNumber;

    private String wechatNumber;

    private Long userLog;


}
