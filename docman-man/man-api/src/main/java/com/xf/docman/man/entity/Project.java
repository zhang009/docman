package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_project")
public class Project extends BaseEntity {

    private static final long serialVersionUID = 1L;
    /**
     * '项目名称'
     **/
    public String projectName;
    /**
     * '项目代号'
     **/
    public String projectCode;
    /**
     * '所属部门:-1.未知'
     **/
    public int departmentId;
    /**
     * '所属部门名称'
     **/
    public String departmentName;
    /**
     * '立项年度'
     **/
    public Date projectApprovalYear;
    /**
     * '立项日期'
     **/
    public Date projectApprovalDate;
    /**
     * '初验日期'
     **/
    public Date projectAcceptanceDate;
    /**
     * '竣工年度'
     **/
    public Date projectCompletionYear;
    /**
     * '竣工日期'
     **/
    public Date projectCompletionDate;
    /**
     * '归档年度'
     **/
    public Date filingYear;
    /**
     * '归档日期'
     **/
    public Date filingDate;
    /**
     * '归属单位'
     **/
    public String company;
    /**
     * '设计单位'
     **/
    public String companyDesign;
    /**
     * '施工单位'
     **/
    public String companyConstruction;
    /**
     * '监理单位'
     **/
    public String companySupervision;
    /**
     * '项目介绍'
     **/
    public String projectIntro;
    /**
     * '备注'
     **/
    public String memo;
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
