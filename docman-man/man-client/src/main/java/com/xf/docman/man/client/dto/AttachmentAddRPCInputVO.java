package com.xf.docman.man.client.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 */
@Data
@ApiModel
public class AttachmentAddRPCInputVO {

    @ApiModelProperty("文件名")
    private String fileName;

    @ApiModelProperty("文件大小")
    private Long fileSize;

    @ApiModelProperty("后缀名")
    private String fileExtension;

    @ApiModelProperty("hash值")
    private String fileHash;

}
