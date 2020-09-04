package com.xf.docman.man.client;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.xf.docman.common.Result;
import com.xf.docman.man.client.dto.BoxAddRPCInputVO;
import com.xf.docman.man.client.dto.BoxAddRPCOutVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import com.xf.docman.man.client.dto.*;

import java.awt.*;

@FeignClient(name="docman-man-api",contextId ="boxs" )
public interface BoxServiceRPCService {

    @PostMapping(path = "/box/add", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    Result<BoxAddRPCOutVO> add(BoxAddRPCInputVO box);


    @PostMapping(path="/box/list",consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Result<IPage<BoxListRPCOutVO>> list(BoxListRPCInputVO input);

}
