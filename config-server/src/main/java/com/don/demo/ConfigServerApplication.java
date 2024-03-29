package com.don.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * 这里没有使用SpringBootApplication或SpringCloudApplication注解，会报错
 * 原因也很简单，我们的java源码目录下没有目录，我们手动加一个也就正常了，
 * 为了写点体会和这里没必要用到包和类，所以使用这种方式
 */
@EnableDiscoveryClient//注册到eureka，让微服务通过eureka获取config
@EnableConfigServer
@SpringBootConfiguration
@EnableAutoConfiguration
public class ConfigServerApplication {
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplication.class, args);
	}
}
//focus 必须要master分支，否则监控检测显示down
