package com.dk.week1.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class AppConfiguration {

    @Bean
//    @Scope("singleton") // it is by default, you do not need to mention.the container creates a single instance of the bean; all requests for that bean name will return the same bean object.
    @Scope("prototype") // this returns a different object every time it is requested from the container.
    Apple getApple(){  // getApple() is static factory method
        return new Apple();
    }
}
