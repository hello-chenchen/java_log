package com.hello_chenchen.javalog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by hello_chenchen on 2017/3/12.
 * jdk_version:jdk1.8.0_111
 */
public class LogTest {

    public static void main(String[] args) {

        Logger logger = LoggerFactory.getLogger(LogTest.class);

        logger.debug("chenchen");
        logger.info("chenchen");
        logger.warn("chenchen");
        logger.error("chenchen");
    }
}
