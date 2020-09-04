package com.xf.docman.front.service.sequence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

/**
 *
 */
@Configuration
public class SequenceConfiguration {

    @Bean
    public SequenceUtil sequenceUtil(DataSource dataSource) {
        Sequence sequence = new Sequence();
        sequence.setDataSource(dataSource);
        sequence.setBlockSize(50);

        SequenceUtil sequenceUtil = new SequenceUtil();
        sequenceUtil.setDefaultSequence(sequence);
        return sequenceUtil;
    }

}
