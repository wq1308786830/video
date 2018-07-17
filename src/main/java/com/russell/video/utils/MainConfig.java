package com.russell.video.utils;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 全剧配置扫描的mapper
 */
@Configuration
@ComponentScan(value = "com.russell.video.*")
@MapperScan(basePackages = {"com.russell.video.mapper"})
public class MainConfig {

}
