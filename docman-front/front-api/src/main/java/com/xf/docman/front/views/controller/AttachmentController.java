package com.xf.docman.front.views.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.man.client.dto.AttachmentAddRPCOutVO;
import com.xf.docman.man.client.dto.AttachmentListRPCOutVO;


import com.xf.docman.front.service.AttachmentService;
import com.xf.docman.front.views.vo.attachment.AttachmentAddInputVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListInputVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

/**
 *
 */
@RestController
@RequestMapping("/attachment")
@Api(tags = {"文件管理"})
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping("/add")
    @ApiOperation("新建文件")
    public Result<AttachmentAddRPCOutVO> add(
            @RequestBody AttachmentAddInputVO vo,
            HttpServletRequest request
    ) {
        return attachmentService.add(vo);
    }


    @PostMapping("/list")
    @ApiOperation("列表查询")
    public Result<IPage<AttachmentListRPCOutVO>> list(
            @ApiParam("查询条件") @RequestBody AttachmentListInputVO input
    )
    {
        return attachmentService.list(input);
    }

}
