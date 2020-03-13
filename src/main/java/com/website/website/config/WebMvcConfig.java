package com.website.website.config;

import static org.springframework.core.Ordered.HIGHEST_PRECEDENCE;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebMvcConfig extends WebMvcConfigurerAdapter {

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
//        registry.addViewController("/");
//        registry.setOrder(HIGHEST_PRECEDENCE);
//    }
}