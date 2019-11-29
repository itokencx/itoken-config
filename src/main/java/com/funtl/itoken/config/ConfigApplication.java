package com.funtl.itoken.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author cx
 * @Package: com.funtl.itoken.config.ConfigApplication
 * @ClassName: ConfigApplication
 * @Description:
 * @Date 2019/11/29 14:10
 * @Version 1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigApplication.class,args);
    	}
}
