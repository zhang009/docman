package com.xf.docman.front.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashSet;
import java.util.Set;

public abstract class AppEnv {

    public static final boolean PRE_ENV_Flag;
    public static final String DEV_PROFILE = "dev";
    public static final String PRE_PROFILE = "pre";
    public static final String PROD_PROFILE = "prod";
    public static final String TEST_PROFILE = "test";
    private static final Logger logger = LoggerFactory.getLogger(AppEnv.class);
    public static volatile boolean leader = false;

    public static String activeProfile;

    private static Set<String> validProfile = new HashSet<>();

    static {
        String preEnvFlag = System.getProperty("app.preEnvFlag");
        logger.info("app.preEnvFlag:" + preEnvFlag);
        PRE_ENV_Flag = "pre".equalsIgnoreCase(preEnvFlag);

        initValidProfile();
    }

    private static void initValidProfile() {
        validProfile.add(TEST_PROFILE);
        validProfile.add(DEV_PROFILE);
        validProfile.add(PRE_PROFILE);
        validProfile.add(PROD_PROFILE);
    }

    public static boolean isPreProfile() {
        return PRE_PROFILE.equals(activeProfile);
    }

    public static boolean isDevProfile() {
        return DEV_PROFILE.equals(activeProfile);
    }

    public static boolean isTestProfile() {
        return TEST_PROFILE.equals(activeProfile);
    }

    public static boolean isProdProfile() {
        return PROD_PROFILE.equals(activeProfile);
    }

    public static boolean isLeader() {
        return leader;
    }

    public static boolean isPre() {
        return isPreProfile() || PRE_ENV_Flag;
    }

    public static String getEnvAsString() {
        if (isTestProfile()) {
            return TEST_PROFILE;
        }
        if (isDevProfile()) {
            return DEV_PROFILE;
        }
        if (isPre()) {
            return PRE_PROFILE;
        }
        if (isProdProfile()) {
            return PROD_PROFILE;
        }
        throw new RuntimeException("生效的profile不对:" + activeProfile);
    }

    public void checkProfileValid(String profile) {
        if (profile == null || profile.isEmpty()) {
            throw new RuntimeException("spring.profiles.active is not config.");
        }

        if (!validProfile.contains(profile)) {
            throw new RuntimeException("profile:" + profile + " is illegal.");
        }
    }

}
