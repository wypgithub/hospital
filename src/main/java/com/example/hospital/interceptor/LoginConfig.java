package com.example.hospital.interceptor;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class LoginConfig implements WebMvcConfigurer {
    /**
     *配置拦截请求规则
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/loginPage","/logout","/login")
                .excludePathPatterns("/static/**","/lib/**","/temp/**");
    }

    /**
     *配置请求视图映射
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/loginPage").setViewName("login");
        registry.addViewController("/index").setViewName("index");

        registry.addViewController("/registerPage").setViewName("register");
    }

}
