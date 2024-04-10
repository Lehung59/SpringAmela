package com.example.demo_amela.config;

import com.example.demo_amela.model.DevDatasource;
import com.example.demo_amela.model.LocalDatasource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("dev")
public class DevDataSourceConfig {
        @Bean
        public DevDatasource devDatasource() {
            return new DevDatasource("Dev object, Chỉ khởi tạo khi 'dev' profile active");
        }

}
