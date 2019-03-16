package com.vasu.VishuBhai;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class VishuBhaiApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder app) {
        return app.sources(VishuBhaiApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(VishuBhaiApplication.class, args);
    }

}
