package org.syu_likelion.Likelion13_BE.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                        .title("API")
                        .version("1.0")
                        .description("SYU-LIKELION 13th API"))
                .servers(List.of(
                        new Server().url("https://syu-likelion.org").description("Server")
                        //new Server().url("http://localhost:8080").description("Local")
                ));
    }
}
