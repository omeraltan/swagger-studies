package com.demo.swagger.configuration;

import com.demo.swagger.utilty.EmailAnnotationPlugin;
import io.swagger.models.HttpMethod;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import springfox.bean.validators.configuration.BeanValidatorPluginsConfiguration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ResponseMessageBuilder;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.ResponseMessage;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger.readers.operation.SwaggerOperationModelsProvider;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
@Import(BeanValidatorPluginsConfiguration.class)
public class SwaggerConfig {


    @Bean
    public Docket api(){

        return new Docket(DocumentationType.SWAGGER_2)
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.demo.swagger.controller")) // only this path
            //.paths(PathSelectors.regex("/.*"))
            .paths(PathSelectors.ant("/employee/*")) // only controllers from a particular package
            .build()
            .useDefaultResponseMessages(false)
            .apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo() {
        return new ApiInfoBuilder()
            .title("Spring Boot Swagger Examples")
            .description("Employee Api Documentation")
            .contact(new Contact("Ömer ALTAN","www.example.com","omer@gmail.com"))
            .license("Apache 2.0")
            .licenseUrl("http://www.apache.org/licenses/LICENSE-2.0.html")
            .version("1.12.3")
            .build();
    }

    @Bean
    public EmailAnnotationPlugin emailPlugin(){
        return new EmailAnnotationPlugin();
    }

}
