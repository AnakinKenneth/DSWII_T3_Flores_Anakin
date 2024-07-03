package pe.edu.cibertec.DSWII_T3_Flores_Anakin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class DswiiT3FloresAnakinApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiT3FloresAnakinApplication.class, args);
	}



	@Bean
	public WebMvcConfigurer configGlobalCors(){
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
						.allowedMethods("GET", "POST", "PUT")
						.allowedOrigins("https://www.cibertec.edu.pe");
			}
		};
	}
}
