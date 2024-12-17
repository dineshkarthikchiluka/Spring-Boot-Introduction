package com.dk.week1.IntroductionToSpringBoot;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary (when the ambiguity issue is error use it, but is tightly coupled)
@ConditionalOnProperty(name = "deploy.env",havingValue = "production")
public class ProdDB implements DB {

    public String getData(){
        return "Prod Data";
    }
}
