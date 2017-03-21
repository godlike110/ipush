package com.feichuang.ipush.server.config;

import com.google.common.base.Predicate;
import org.springframework.boot.autoconfigure.web.BasicErrorController;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.RequestHandler;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Created by wenzhiwei on 2017/3/20.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {


    @Bean
    public Docket createRestApi() {
        Predicate<RequestHandler> predicate = new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
                Class<?> declaringClass = input.getClass();
                if (declaringClass == BasicErrorController.class)// 排除
                    return false;
                if (declaringClass.isAnnotationPresent(RestController.class)) // 被注解的类
                    return true;
                if (declaringClass.isAnnotationPresent(ResponseBody.class)) // 被注解的方法
                    return true;
                if (declaringClass.isAnnotationPresent(Controller.class)) // 被注解的方法
                    return false;
                return false;
            }
        };
        return testApi();
    }

    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_12)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.hc.henghuirong.server"))
                .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("财富Restful接口定义")
                .description("财富Restful接口查看和测试工具")
                .termsOfServiceUrl("")
                .contact(new Contact("Wu.Kang","http://www.credithc.com","wukang170208@credithc.com"))
                .contact(new Contact("wenzhiwei","http://www.baidu.com","wenzhiwei170313@credithc.com"))
                .version("1.0")
                .build();
    }

}
