package nl.enovation.account;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.client.RestTemplate;
import org.apache.commons.collections.ArrayStack;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Bean
    PasswordEncoder encoder() {
    	return new BCryptPasswordEncoder();
    }

    @Bean
    ObjectMapper messagingObjectMapper() {
    	return new Jackson2ObjectMapperBuilder().build();
    }

    @Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
