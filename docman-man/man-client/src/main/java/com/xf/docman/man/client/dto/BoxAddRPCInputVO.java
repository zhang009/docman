package com.xf.docman.man.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;
@Data
@ApiModel
public class BoxAddRPCInputVO {


    @ApiModelProperty("盒号")
    public String boxCode;


    @ApiModelProperty("所属部门")
    public int departmentId;


    @ApiModelProperty("所属部门名称")
    public String departmentName;


    @ApiModelProperty("文件件数")
    public int docCount;


    @ApiModelProperty("案卷件数")
    public int volCount;


    @ApiModelProperty("文件页数")
    public int pageCount;


    @ApiModelProperty("整理日期")
    public Date collatingDate;


    @ApiModelProperty("整理人ID")
    public Long collatingStaffId;


    @ApiModelProperty("整理人名称")
    public String collatingStaffName;


    @ApiModelProperty("存放地点")
    public String storagePlace;


    @ApiModelProperty("备注")
    public String memo;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属盒,3.归属案卷'
     **/
    @ApiModelProperty("归属状态")
    public int belongState;
    /**
     * '归属类型:-1.未知,0.离散未归属,1.归属项目,2.归属案卷,3.归属盒'
     **/
    @ApiModelProperty("归属类型")
    public int belongType;
    /**
     * '分类号:-1.未知'
     **/
    @ApiModelProperty("分类号")
    public int classfyId;
    /**
     * '分类名称'
     **/
    @ApiModelProperty("分类名称")
    public String classfyName;
    /**
     * '档案类目ID:-1.未知,1.文书档案,2.项目档案,3.工程档案,4.照片档案,5.资料库,6.实物档案,7.业务档案,8.科技档案,9.涉密档案,10.合同档案,11.会计档案,12.音视频档案'
     **/
    @ApiModelProperty("档案类目")
    public int categoryId;

}
