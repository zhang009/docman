package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;

import java.util.Date;

/**
 * 基础实体
 *
 *
 */
@Data
public class BaseEntity {

    private Long id;

    private Date created;

    private Date modified;

    private Boolean isEnable;

}
