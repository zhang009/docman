package com.xf.docman.man.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel
public class BoxAddRPCOutVO {

    @ApiModelProperty("档案Id")
    private Long id;
}
