package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_box")
public class Box extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * '盒号'
     **/
    public String boxCode;
    /**
     * '所属部门:-1.未知'
     **/
    public int departmentId;
    /**
     * '所属部门名称'
     **/
    public String departmentName;
    /**
     * '档案件数'
     **/
    public int docCount;
    /**
     * '案卷件数'
     **/
    public int volCount;
    /**
     * '文件页数'
     **/
    public int pageCount;
    /**
     * '整理日期'
     **/
    public Date collatingDate;
    /**
     * '整理人ID:-1.未知'
     **/
    public Long collatingStaffId;
    /**
     * '整理人名称'
     **/
    public String collatingStaffName;
    /**
     * '存放地点'
     **/
    public String storagePlace;
    /**
     * '备注'
     **/
    public String memo;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷'
     **/
    public int belongState;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒'
     **/
    public int belongType;
    /**
     * '分类号:-1.未知'
     **/
    public int classfyId;
    /**
     * '分类名称'
     **/
    public String classfyName;
    /**
     * '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
     **/
    public int categoryId;


}
