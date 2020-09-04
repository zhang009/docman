package com.xf.docman.front.views.vo.box;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
*   档案添加成功之后，返回ID
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@ApiModel
public class BoxAddOutVO {

    @ApiModelProperty("档案盒Id")
    private Long id;
}
