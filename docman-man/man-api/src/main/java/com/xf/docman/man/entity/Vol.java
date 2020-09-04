package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_vol")
public class Vol extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * '案卷题名'
     **/
    public String volName;
    /**
     * '案卷代号'
     **/
    public String volCode;
    /**
     * '项目代号'
     **/
    public String projectCode;
    /**
     * '目录号'
     **/
    public String catalogCode;
    /**
     * '案卷档号'
     **/
    public String volFilingCode;
    /**
     * '所属部门:-1.未知'
     **/
    public int departmentId;
    /**
     * '所属部门名称'
     **/
    public String departmentName;
    /**
     * '年度'
     **/
    public Date year;
    /**
     * '件数'
     **/
    public int docCount;
    /**
     * '文件页数'
     **/
    public int pageCount;
    /**
     * '起始日期'
     **/
    public Date dateStart;
    /**
     * '截止日期'
     **/
    public Date dateEnd;
    /**
     * '归档部门:-1.未知'
     **/
    public int filingDepartment;
    /**
     * '归档人'
     **/
    public String filingStaffName;
    /**
     * '归档日期'
     **/
    public Date filingDate;
    /**
     * '归档份数'
     **/
    public int filingCount;
    /**
     * '备注'
     **/
    public String memo;
    /**
     * '编制单位'
     **/
    public String compileCompany;
    /**
     * '编制日期'
     **/
    public Date compileDate;
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
