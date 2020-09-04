package com.xf.docman.front.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xf.docman.common.Result;
import com.xf.docman.front.service.sequence.IDGenerator;
import com.xf.docman.front.utils.PageUtils;
import com.xf.docman.front.views.vo.box.*;
import com.xf.docman.man.entity.Box;
import com.xf.docman.man.mapper.BoxMapper;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.Date;
import java.util.List;

@Service
public class BoxService {

    @Autowired
    private BoxMapper boxMapper;

    @Autowired
    private IDGenerator idGenerator;

    //条件查询
    public Result<IPage<BoxListOutVO>> list(BoxListInputVO input) {
        Page<Box> page=new Page<>();
        PageUtils.setPage(page,input.getCurrentPage(),input.getPageSize());
        IPage<BoxListOutVO> iPage=boxMapper.list(page,input);

        return Result.success(iPage);
    }

    //添加
    public Long add(BoxAddInputVO vo){
        Box box=new Box();//设置box的其他属性
        BeanUtils.copyProperties(vo,box);
        Date now=new Date();
        box.setId(idGenerator.getBox());
        box.setCreated(now);
        box.setCollatingDate(now);
        box.setModified(now);
        box.setIsEnable(true);

        boxMapper.insert(box);
        return box.getId();
    }
     /*   public Result<List<BoxListAllOutVO>> add(BoxAddInputVO vo) {
        List<BoxListAllOutVO> list=boxMapper.listAllEnable();
        return Result.success(list);
    }*/

}
