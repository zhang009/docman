package com.xf.docman.front.views.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.front.service.BoxService;
import com.xf.docman.front.views.vo.box.BoxAddInputVO;
import com.xf.docman.front.views.vo.box.BoxListInputVO;
import com.xf.docman.front.views.vo.box.BoxListOutVO;
import com.xf.docman.man.client.dto.BoxAddRPCOutVO;
import com.xf.docman.man.client.dto.BoxListRPCOutVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/box")
@Api(tags = {"档案盒管理"})
public class BoxController {


    @Autowired
    private BoxService boxService;


    @PostMapping("/list")
    @ApiOperation("档案盒查询")
    public Result<IPage<BoxListRPCOutVO>> list(
            @ApiParam("查询档案盒") @RequestBody BoxListInputVO input
    ){
        return boxService.list(input);
    }

    @PostMapping("/add")
    @ApiOperation("档案盒添加")
    public Result<BoxAddRPCOutVO> add(
            @RequestBody BoxAddInputVO vo,
            HttpServletRequest request
            ){
        return boxService.add(vo);
    }

}
