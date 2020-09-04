package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiParam;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 驿站
 * </p>
 *
 *
 * @since 2019-04-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@ApiModel
public class Store extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * 驿站名称
     */
    private String name;

    @TableField("area1Code")
    private String area1Code;
    @TableField("area2Code")
    private String area2Code;
    @TableField("area3Code")
    private String area3Code;

    /**
     * 驿站地址
     */
    private String address;

    /**
     * 存储时间段，比如：
     * 09:00-18:00
     */
    @TableField("businessHours")
    private String businessHours;

    /**
     * 负责人账号
     */
    @TableField("principalAccount")
    private String principalAccount;



    /**
     * 联系电话
     */
    @TableField("contactPhone")
    private String contactPhone;

    /**
     * 客服电话
     */
    @TableField("servicePhone")
    private String servicePhone;

    /**
     * 公告
     */
    private String notice;

    /**
     * 驿站图片地址
     */
    private String image;

    /**
     * 最后操作人账号
     */
    @TableField("lastOperatorAccount")
    private String lastOperatorAccount;


}
