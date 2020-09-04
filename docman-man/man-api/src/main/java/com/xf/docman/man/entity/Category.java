package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 
 * </p>
 *
 *
 * @since 2019-05-28
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
public class Category extends BaseEntity {

    private static final long serialVersionUID = 1L;

    @TableField("parentId")
    private Long parentId;

    private String name;

    private Integer level;

    /**
     * 最后操作人账号
     */
    @TableField("lastOperatorAccount")
    private String lastOperatorAccount;


}
