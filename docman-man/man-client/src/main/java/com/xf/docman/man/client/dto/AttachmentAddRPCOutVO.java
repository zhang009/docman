package com.xf.docman.man.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 *
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class AttachmentAddRPCOutVO {

    @ApiModelProperty("文件Id")
    private Long id;

}
