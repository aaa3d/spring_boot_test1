/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yarregion.spring_boot_test1.spring_boot_test1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author istorozhev
 */

@Configuration
@EnableAutoConfiguration
@ComponentScan
@RestController
public class startApplication extends SpringBootServletInitializer{
    
    @RequestMapping("/start")
    public String onStart(){
        return "START CONTROLLER";
    }
    
    @Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(startApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(startApplication.class, args);
	}
}
