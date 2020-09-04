package com.xf.docman.front.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.xf.docman.common.Result;
import com.xf.docman.man.entity.Attachment;
import com.xf.docman.man.mapper.AttachmentMapper;
import com.xf.docman.front.service.sequence.IDGenerator;
import com.xf.docman.front.utils.PageUtils;
import com.xf.docman.front.views.vo.attachment.AttachmentAddInputVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListAllOutVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListInputVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListOutVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@Service
public class AttachmentService {


    @Autowired
    private AttachmentMapper attachmentMapper;

    @Autowired
    private IDGenerator idGenerator;

    public Long add(AttachmentAddInputVO vo) {
        Attachment attachment = new Attachment();
        BeanUtils.copyProperties(vo, attachment);
        Date now = new Date();
        attachment.setId(idGenerator.getBox());
        attachment.setCreated(now);
        attachment.setModified(now);
        attachment.setIsEnable(true);
        attachmentMapper.insert(attachment);
        return attachment.getId();
    }

    public Result<IPage<AttachmentListOutVO>> list(AttachmentListInputVO input) {
        Page<Attachment> page = new Page<>();
        PageUtils.setPage(page, input.getCurrentPage(), input.getPageSize());
        IPage<AttachmentListOutVO> ipage = attachmentMapper.list(page, input);
        return Result.success(ipage);
    }

    public Result<List<AttachmentListAllOutVO>> listAllEnable() {
        List<AttachmentListAllOutVO> list = attachmentMapper.listAllEnable();
        return Result.success(list);
    }
}
