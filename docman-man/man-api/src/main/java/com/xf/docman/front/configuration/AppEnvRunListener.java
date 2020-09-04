package com.xf.docman.front.configuration;

import com.xf.docman.front.utils.AppEnv;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

public class AppEnvRunListener implements SpringApplicationRunListener {

    private static final Logger logger = LoggerFactory.getLogger(AppEnvRunListener.class);

    public AppEnvRunListener(SpringApplication application, String[] args) {
        //必须有一个这样签名的构造函数
    }

    @Override
    public void starting() {

    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        //在环境变量准备好后初始化AppEnv
        String profile = environment.resolveRequiredPlaceholders("${spring.profiles.active}");
        AppEnv.activeProfile = profile;
        logger.info("set AppEnv.activeProfile=" + profile);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {

    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {

    }

    @Override
    public void started(ConfigurableApplicationContext context) {

    }

    @Override
    public void running(ConfigurableApplicationContext context) {

    }

    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {

    }
}
