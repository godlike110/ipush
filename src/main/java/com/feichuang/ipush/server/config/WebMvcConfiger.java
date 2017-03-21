package com.feichuang.ipush.server.config;

import com.feichuang.ipush.server.interceptor.UserSecurityInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

//@CrossOrigin(methods = { RequestMethod.POST , RequestMethod.GET})
@Configuration
public class WebMvcConfiger extends WebMvcConfigurerAdapter {

	 public void addInterceptors(InterceptorRegistry registry) {
		 registry.addInterceptor(new UserSecurityInterceptor()).addPathPatterns("/**");
		 super.addInterceptors(registry);
	 }

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/assets/");
		super.addResourceHandlers(registry);
	}

}
