package com.feichuang.ipush.server.config;

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
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import com.google.common.base.Predicate;

/**
 * Created by wenzhiwei on 2017/3/20.
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket createRestApi() {
        new Predicate<RequestHandler>() {
            @Override
            public boolean apply(RequestHandler input) {
                Class<?> declaringClass = input.getClass();
                if (declaringClass == BasicErrorController.class) {
                    return false;
                }
                if (declaringClass.isAnnotationPresent(RestController.class)) {
                    return true;
                }
                if (declaringClass.isAnnotationPresent(ResponseBody.class)) {
                    return true;
                }
                if (declaringClass.isAnnotationPresent(Controller.class)) {
                    return false;
                }
                return false;
            }
        };
        return this.testApi();
    }

    public Docket testApi() {
        return new Docket(DocumentationType.SWAGGER_12)
            .apiInfo(this.apiInfo())
            .select()
            .apis(
                RequestHandlerSelectors
                    .basePackage("com.feichuang.ipush.server"))
            .paths(PathSelectors.any()).build();
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder().title("iPush Restful接口定义")
            .description("iPush Restful接口查看和测试工具").termsOfServiceUrl("")
                .version("1.0").build();
    }

}
