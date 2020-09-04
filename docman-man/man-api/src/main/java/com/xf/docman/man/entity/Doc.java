package com.xf.docman.man.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = true)
@Accessors(chain = true)
@TableName("t_doc")
public class Doc extends BaseEntity {

    private static final long serialVersionUID = 1L;

    /**
     * '文件档号'
     **/
    public String docId;
    /**
     * '年度'
     **/
    public Date year;
    /**
     * '文件题名'
     **/
    public String docName;
    /**
     * '分类号:-1.未知'
     **/
    public int classfyId;
    /**
     * '分类名称'
     **/
    public String classfyName;
    /**
     * '件号'
     **/
    public String docCode;
    /**
     * '所属部门:-1.未知'
     **/
    public int departmentId;
    /**
     * '所属部门名称'
     **/
    public String departmentName;
    /**
     * '成文日期'
     **/
    public Date docDate;
    /**
     * '文号'
     **/
    public String docPubCode;
    /**
     * '文件类型:-1.未知,1.发文,2.收文,3.签报'
     **/
    public int docPubType;
    /**
     * '收文登记号'
     **/
    public String receiveDocId;
    /**
     * '发文主送单位'
     **/
    public String issuedCompany;
    /**
     * '发文抄送单位'
     **/
    public String copyCompany;
    /**
     * '文件页数'
     **/
    public int pageCount;
    /**
     * '来问文号'
     **/
    public String receiveDocPubCode;
    /**
     * '收文编号'
     **/
    public String receiveDocCode;
    /**
     * '稿本:-1.未知,1.草稿,2.定稿,3.手稿,4.草图,5.原图,6.地图,7.蓝图,8.正文,9.副本,10.原版,11.试行本,12.修订本,13.影视本,14.文字本'
     **/
    public int docStepType;
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
     * '盒号'
     **/
    public String box;
    /**
     * '附件个数'
     **/
    public int attachmentCount;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷'
     **/
    public int belongState;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒'
     **/
    public int belongType;
    /**
     * '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
     **/
    public int categoryId;
}
