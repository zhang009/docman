package com.xf.docman.man.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.xf.docman.front.views.vo.box.BoxListAllOutVO;
import com.xf.docman.front.views.vo.box.BoxListInputVO;
import com.xf.docman.front.views.vo.box.BoxListOutVO;
import com.xf.docman.man.entity.Box;
import org.apache.ibatis.annotations.Param;
import org.mapstruct.Mapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;

import java.util.List;


@Mapper
public interface BoxMapper extends BaseMapper<Box> {

    IPage<BoxListOutVO> list(Page<Box> page, @Param("input") BoxListInputVO  input);

    int enable(@Param("id") Long id);

    int disable(@Param("id") Long id);

    List<BoxListAllOutVO> listAllEnable();
}
