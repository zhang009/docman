package com.xf.docman.front.service.sequence;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class IDGenerator {

    @Autowired
    private SequenceUtil sequenceUtil;

    private long getId(IDEnum idEnum) {
        return sequenceUtil.get(idEnum.name());
    }

    public Long getCategory() {
        return getId(IDEnum.CATEGORY);
    }

    public Long getAttachment() {return getId(IDEnum.ATTACHMENT); }

    public Long getBox(){return getId(IDEnum.BOX);}
}

enum IDEnum {
    ATTACHMENT, CATEGORY, BOX
}