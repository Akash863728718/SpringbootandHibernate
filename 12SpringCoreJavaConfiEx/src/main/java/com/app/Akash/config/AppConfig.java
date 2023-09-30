package com.app.Akash.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.app.Akash.bean.PdfExport;

@Configuration
public class AppConfig {
	@Bean
public PdfExport pobj() {
		PdfExport p=new PdfExport();
		p.setFileName("SBMS");
		p.setFileAuth("AKASH");
      	return p;
}
}
