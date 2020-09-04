package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_attachment")
public class Attachment extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * '附件名称'
     **/
    public String fileName;
    /**
     * '附件大小'
     **/
    public Long fileSize;
    /**
     * '附件扩展名'
     **/
    public String fileExtension;
    /**
     * '附件hash码'
     **/
    public String fileHash;
    /**
     * '引用计数'
     **/
    public int referenceCount;
}
