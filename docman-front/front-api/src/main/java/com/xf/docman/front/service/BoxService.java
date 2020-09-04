package com.xf.docman.front.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.fasterxml.jackson.databind.util.BeanUtil;
import com.xf.docman.common.Result;
import com.xf.docman.front.views.vo.box.BoxAddInputVO;
import com.xf.docman.front.views.vo.box.BoxListInputVO;
import com.xf.docman.man.client.BoxServiceRPCService;
import com.xf.docman.man.client.dto.*;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoxService {

    @Autowired
    private BoxServiceRPCService boxServiceRPCService;

    //添加档案盒
    public Result<BoxAddRPCOutVO> add(BoxAddInputVO vo){

     //   System.out.println("vo---:"+vo.toString());
        BoxAddRPCInputVO box=new BoxAddRPCInputVO();
        BeanUtils.copyProperties(vo,box);//拷贝属性（把BoxAddInputVO对BoxAddRPCInputVO属性进行赋值）
     //   System.out.println("box---:"+box);
        return boxServiceRPCService.add(box);
    }
    //条件查询档案盒
    public Result<IPage<BoxListRPCOutVO>> list(BoxListInputVO input){

        BoxListRPCInputVO boxListRPCInputVO=new BoxListRPCInputVO();
        BeanUtils.copyProperties(input,boxListRPCInputVO);

        Result<IPage<BoxListRPCOutVO>> out=boxServiceRPCService.list(boxListRPCInputVO);
        return out;
    }




}
