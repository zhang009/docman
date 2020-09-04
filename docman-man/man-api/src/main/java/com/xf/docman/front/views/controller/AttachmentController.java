package com.xf.docman.front.views.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.front.service.AttachmentService;
import com.xf.docman.front.views.vo.attachment.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 *
 */
@RestController
@RequestMapping("/attachment")
@Api(tags = {"类目管理"})
public class AttachmentController {

    @Autowired
    private AttachmentService attachmentService;

    @PostMapping("/add")
    @ApiOperation("新建类目")
    public Result<AttachmentAddOutVO> add(
            @RequestBody AttachmentAddInputVO vo,
            HttpServletRequest request
    ) {
        Long attachmentID = attachmentService.add(vo);
        return Result.success(new AttachmentAddOutVO(attachmentID));
    }


    @PostMapping("/list")
    @ApiOperation("列表查询")
    public Result<IPage<AttachmentListOutVO>> list(
            @ApiParam("查询条件") @RequestBody AttachmentListInputVO input
    ) {
        return attachmentService.list(input);
    }

    @GetMapping("/listAllEnable")
    @ApiOperation("查询所有")
    public Result<List<AttachmentListAllOutVO>> listAllEnable() {
        return attachmentService.listAllEnable();
    }
}
