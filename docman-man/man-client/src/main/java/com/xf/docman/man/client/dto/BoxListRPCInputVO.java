package com.xf.docman.man.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class BoxListRPCInputVO {

    //这里设置可以按照，所属部门名称、整理人名称、存放地点、归属类型、档案类目进行查询

    @ApiModelProperty("档案盒Id")
    private Long id;


    @ApiModelProperty("整理人名称")
    private String collatingStaffName;

    @ApiModelProperty("存放地点")
    private String storagePlace;


    @ApiModelProperty("档案类目ID")
    private int categoryId;



    private int currentPage;
    private int pageSize;
}
