package com.tutorial.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

//cuando queremos crear varios archivos de properties se usa esta clase
@Configuration
@PropertySources({
	@PropertySource("classpath:textos.properties"),
//	@PropertySource("classpath:textos2.properties")
})	
public class TextosPropertiesConfig {

}
