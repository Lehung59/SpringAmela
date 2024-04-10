package com.example.demo_amela.config;

import com.example.demo_amela.model.LocalDatasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class LocalDatasourceConfig {

    @Bean
    public LocalDatasource localDatasource() {
        return new LocalDatasource("Local object, Chỉ khởi tạo khi 'local' profile active");
    }
}