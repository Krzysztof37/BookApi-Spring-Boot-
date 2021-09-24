package pl.coderslab.bookapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;
import org.springframework.web.servlet.tags.form.ErrorsTag;
import pl.coderslab.bookapi.utils.BookRepository;
import pl.coderslab.bookapi.utils.JpaBookService;

@SpringBootApplication
public class BookapiApplication extends SpringBootServletInitializer {

	@Bean
	JpaBookService jpaBookService(){
		return new JpaBookService();
	}



	public static void main(String[] args) {
		SpringApplication.run(BookapiApplication.class, args);
	}




}
