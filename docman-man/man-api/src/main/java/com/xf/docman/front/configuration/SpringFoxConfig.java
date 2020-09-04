package com.xf.docman.front.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

/**
 * 参考：
 * https://www.vojtechruzicka.com/documenting-spring-boot-rest-api-swagger-springfox/
 */
@Configuration
@EnableSwagger2
@Profile({"dev","test","pre"})
public class SpringFoxConfig {

    @Autowired
    private AppProperties appProperties;

    @Bean
    public Docket apiDocket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .host(appProperties.getSelfDomain())
                .useDefaultResponseMessages(false)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.xf.docman.front.views.controller"))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(getApiInfo());
    }

    private ApiInfo getApiInfo() {
        return new ApiInfo(
                "这里是标题",
                "这里是描述",
                "V1.0",
                "TERMS OF SERVICE URL",
                new Contact("联系人名字", "联系人URL", "联系人邮箱"),
                "版权",
                "版权连接",
                Collections.emptyList()
        );
    }
}