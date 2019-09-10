package com.md.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

@Configuration
public class WebConfig extends WebMvcConfigurationSupport {

    // 让bean提前加载，让拦截器中的@Autowired生效
    @Bean
    public HandlerInterceptor getMyInterceptor() {
        return new MyHttpInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // 定义过滤拦截的url名称，拦截所有请求
        registry.addInterceptor(this.getMyInterceptor()).addPathPatterns("/**");
        super.addInterceptors(registry);
    }
}
