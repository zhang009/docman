package com.xf.docman;

import com.xf.docman.front.configuration.AppProperties;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableConfigurationProperties({AppProperties.class})
@Slf4j
@EnableDiscoveryClient
public class ManServiceApplication {
    /*@MapperScan(basePackages ="com.xf.docman.man.mapper")*/
	public static void main(String[] args) {
		SpringApplication.run(ManServiceApplication.class, args);
	}

}
