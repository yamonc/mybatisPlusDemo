package com.mybatisplus.demo.blog.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
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
@ApiModel(value="TComment对象", description="")
public class TComment implements Serializable {

    private static final long serialVersionUID = 1L;

      @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String avatar;

      @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String email;

    private String nickName;

    private Long blogId;

    private Long parentCommentId;

    private Boolean adminComment;

    private String content;

    private String nickname;

    private Integer commentType;

    private Long commentator;

    private Integer status;


}
