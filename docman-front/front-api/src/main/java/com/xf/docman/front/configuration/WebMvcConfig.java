package com.xf.docman.front.configuration;

import com.xf.docman.front.views.interceptor.CustomCorsInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 暂时先不考虑国际化
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(customCorsInterceptor()).order(600);
    }

    @Bean
    public CustomCorsInterceptor customCorsInterceptor() {
        return new CustomCorsInterceptor();
    }


}