package com.kaiburr.rest_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import org.springframework.context.annotation.Bean;
import org.springdoc.core.GroupedOpenApi;
import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

//import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class RestServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestServerApplication.class, args);
	}

	@Bean
	public GroupedOpenApi swaggerConfig() {
		return GroupedOpenApi.builder()
			.group("Server-APIs")
			.pathsToMatch("/api/**")
			.build();
	}

	@Bean
	public OpenAPI swaggerApiInfoConfig(){
		return new OpenAPI()
		.info(new Info().title("Server API")
		.description("Java Rest API Server Application")
		.license(new License().name("GitHub").url("http://github.com/affanbinhasan")));
	}

}
