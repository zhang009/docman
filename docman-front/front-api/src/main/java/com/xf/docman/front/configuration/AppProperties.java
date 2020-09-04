package com.xf.docman.front.configuration;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 *
 */
@ConfigurationProperties(
        prefix = "app"
)
@Data
public class AppProperties {


    /**
     * 系统权限的appCode
     */
    private String permissionAppCode;

    /**
     * 排除登录的路径,必须是equals相等
     */
    private List<String> excludeLoginPathEquals;

    /**
     * 排除登录的路径,必须是equals相等
     */
    private List<String> excludeLoginPathStartWith;


    /**
     * 静态资源后缀
     */
    private List<String> staticResourceSuffix;


    private String selfDomain;

    /**
     * 排除权限校验的路径,必须是equals相等
     */
    private List<String> excludePermissionPathEquals;

}
