package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_classfy")
public class Classfy extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * '分类名称'
     **/
    public String classfyName;
    /**
     * '父级ID:0为顶级'
     **/
    public int parentId;
    /**
     * '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
     **/
    public int categoryId;

}
