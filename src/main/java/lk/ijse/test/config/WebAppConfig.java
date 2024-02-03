package lk.ijse.test.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class WebAppConfig {

    @Bean
    public ModelMapper setModelMapper(){
        return new ModelMapper();
    }

    @Bean
    public ObjectMapper setObjectMapper(){
        return new ObjectMapper();
    }

   @Bean
    public RestTemplate setRestTemplate(){
        return new RestTemplate();
    }
}
