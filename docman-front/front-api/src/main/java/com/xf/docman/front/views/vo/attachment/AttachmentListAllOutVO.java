package com.xf.docman.front.views.vo.attachment;

import com.xf.docman.front.utils.DateTimeUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 *
 */
@Data
@ApiModel
public class AttachmentListAllOutVO {

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

    private Date created;

    private Date modified;

    @ApiModelProperty("最后修改时间，字符串")
    public String getModifiedStr() {
        return DateTimeUtils.date2String(this.getModified());
    }

}
