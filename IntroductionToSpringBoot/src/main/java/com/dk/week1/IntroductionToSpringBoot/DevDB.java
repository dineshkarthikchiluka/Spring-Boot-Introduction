package com.dk.week1.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Conditional;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(name = "deploy.env",havingValue = "development")
public class DevDB implements DB{

    public String getData(){
        return "Dev Data";
    }
}
