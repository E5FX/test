package com.z1805.demo.config;

import org.springframework.boot.autoconfigure.http.HttpMessageConverters;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alibaba.fastjson.serializer.SerializerFeature;
import com.alibaba.fastjson.support.config.FastJsonConfig;
import com.alibaba.fastjson.support.spring.FastJsonHttpMessageConverter;
import com.z1805.demo.interceptor.LoginInterceptor;

public class MvcConfig implements WebMvcConfigurer{

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		 //注册TestInterceptor拦截器
        InterceptorRegistration registration = registry.addInterceptor(new LoginInterceptor());
        registration.addPathPatterns("/*");//所有路径都被拦截
        registration.excludePathPatterns("/backstage/login.html");//排除登陆页面
        registration.excludePathPatterns("/frontstage/about.html");
        registration.excludePathPatterns("/frontstage/blogroll.html");
        registration.excludePathPatterns("/index.html");
        registration.excludePathPatterns("/layui/**");
        registration.excludePathPatterns("/css/**");
        registration.excludePathPatterns("/jquery-3.5.1/**");
        registration.excludePathPatterns("/js/**");
        //登陆方法
        registration.excludePathPatterns("/user/login");
        registration.excludePathPatterns("/user/exit");
        
        registration.excludePathPatterns("/error");
        registration.excludePathPatterns("/blog/**");
        registration.excludePathPatterns("/category/**");
        registration.excludePathPatterns("/comment/**");
        registration.excludePathPatterns("/tag/**");
        registration.excludePathPatterns("/link/**");
	}
	
	@Bean
	public HttpMessageConverters fastJsonHttpMessageConverters() {
		FastJsonHttpMessageConverter fastJsonHttpMessageConverter = new FastJsonHttpMessageConverter();
		FastJsonConfig fastJsonConfig = new FastJsonConfig();
		fastJsonConfig.setSerializerFeatures(SerializerFeature.PrettyFormat);
		fastJsonHttpMessageConverter.setFastJsonConfig(fastJsonConfig);
		HttpMessageConverter<?> converter = fastJsonHttpMessageConverter;
		return new HttpMessageConverters(converter);
	}

}
