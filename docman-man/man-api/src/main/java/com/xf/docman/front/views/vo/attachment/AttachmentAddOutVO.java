package com.xf.docman.front.views.vo.attachment;

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
public class AttachmentAddOutVO {

    @ApiModelProperty("文件Id")
    private Long id;

}
