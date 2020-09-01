package com.mybatisplus.demo.blog.entity;

import com.baomidou.mybatisplus.annotation.Version;
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
@ApiModel(value="TBlogTags对象", description="")
public class TBlogTags implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long blogsId;

    private Long tagsId;


}
