package config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration

public class WebConfig implements WebMvcConfigurer{
	@Override
	public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/api/**")  // Allow all paths
                .allowedOrigins("http://localhost:3000") // React app's URL
                .allowedMethods("GET", "POST", "PUT", "DELETE") // Allow the necessary HTTP methods
                .allowedHeaders("*")  // Allow all headers
                .allowCredentials(true); // Allow credentials if needed (cookies, authorization headers)
    }
}
