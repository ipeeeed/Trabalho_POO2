package br.com.uniderp.poo2.atacado.Configs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class SwaggerConfig {

    @Bean
    public OpenAPI customAPI() {
        return new OpenAPI()
        .info(new Info()
            .title("Atacado")
            .version("1.0")
            .title("Atacado")
            .description("Descrição da API Atacado")
            .license(new License()
                .name("MIT")
                .url("https://github.com/ipeeeed")));
    }
}
