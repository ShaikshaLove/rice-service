package io.s3rice.riceservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@SpringBootApplication
@EnableSwagger2

public class RiceServiceApplication implements WebMvcConfigurer {

    public static void main(String[] args) {
        SpringApplication.run(RiceServiceApplication.class, args);
    }

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
        .allowedMethods("GET","PUT","POST","DELETE","PATCH")
        .allowedHeaders("Access-Control-Allow-Origin:*");
    }

    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("io.s3rice.riceservice.rest.api"))
                .paths(PathSelectors.ant("/v1/*"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {
        return new ApiInfo(
                "Rice Type Service",
                "The api for consuming rice type service",
                "1.0",
                "Terms of service",
                 new Contact("shaiksha sayyad", "s3rice.tk", "sayyad.shaiksha@gmail.com"),
                "License of API", "API license URL", Collections.emptyList());
    }


}
