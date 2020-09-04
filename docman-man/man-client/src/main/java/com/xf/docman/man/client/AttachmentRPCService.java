package com.xf.docman.man.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.man.client.dto.*;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@FeignClient(name = "docman-man-api", contextId = "attachments")
public interface AttachmentRPCService {
    @PostMapping(path ="/attachment/add", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<AttachmentAddRPCOutVO> add(AttachmentAddRPCInputVO attachment);

    @PostMapping(path ="/attachment/list", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<IPage<AttachmentListRPCOutVO>> list(AttachmentListRPCInputVO input);

}
