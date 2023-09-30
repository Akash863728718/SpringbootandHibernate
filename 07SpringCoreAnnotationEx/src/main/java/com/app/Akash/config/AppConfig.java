package com.app.Akash.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@ComponentScan("com.app.Akash")
@PropertySource("classpath:myapp.properties")
public class AppConfig {

}
