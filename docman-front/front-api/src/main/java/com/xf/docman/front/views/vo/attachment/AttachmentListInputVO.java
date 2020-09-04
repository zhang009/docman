package com.xf.docman.front.views.vo.attachment;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 *
 */
@Data
@ApiModel
public class AttachmentListInputVO {

    @ApiModelProperty("文件ID")
    private Long id;

    @ApiModelProperty("文件名")
    private String fileName;

    @ApiModelProperty("文件大小")
    private Long fileSize;

    @ApiModelProperty("后缀名")
    private String fileExtension;

    @ApiModelProperty("状态 true:有效 false:无效")
    private Boolean isEnable;

    private int currentPage;
    private int pageSize;

}
