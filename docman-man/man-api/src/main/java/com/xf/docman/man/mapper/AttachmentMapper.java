package com.xf.docman.man.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xf.docman.man.entity.Attachment;
import com.xf.docman.front.views.vo.attachment.AttachmentListAllOutVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListInputVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListOutVO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface AttachmentMapper extends BaseMapper<Attachment> {

    IPage<AttachmentListOutVO> list(Page<Attachment> page, @Param("input") AttachmentListInputVO input);

    int enable(@Param("id") Long id);

    int disable(@Param("id") Long id);

    List<AttachmentListAllOutVO> listAllEnable();

}
