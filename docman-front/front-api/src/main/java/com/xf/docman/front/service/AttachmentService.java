package com.xf.docman.front.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.man.client.AttachmentRPCService;
import com.xf.docman.man.client.dto.AttachmentAddRPCInputVO;
import com.xf.docman.man.client.dto.AttachmentAddRPCOutVO;
import com.xf.docman.man.client.dto.AttachmentListRPCInputVO;
import com.xf.docman.man.client.dto.AttachmentListRPCOutVO;
import com.xf.docman.front.views.vo.attachment.AttachmentAddInputVO;
import com.xf.docman.front.views.vo.attachment.AttachmentListInputVO;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AttachmentService {

    @Autowired
    private AttachmentRPCService attachmentRPCService;

    public Result<AttachmentAddRPCOutVO> add(AttachmentAddInputVO vo) {
        AttachmentAddRPCInputVO attachment = new AttachmentAddRPCInputVO();
        BeanUtils.copyProperties(vo, attachment);
        return attachmentRPCService.add(attachment);
    }

    public Result<IPage<AttachmentListRPCOutVO>> list(AttachmentListInputVO input) {
        AttachmentListRPCInputVO attachmentListRPCInputVO = new AttachmentListRPCInputVO();
        BeanUtils.copyProperties(input, attachmentListRPCInputVO);
        Result<IPage<AttachmentListRPCOutVO>> out = attachmentRPCService.list(attachmentListRPCInputVO);
        return out;
    }

}
