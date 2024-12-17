package com.dk.week1.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DBService {

// Field Injection
//    @Autowired
//    private DB db;

    final private DB db;

    // Constructor Injection
    public DBService(DB db){
        this.db = db;
    }

    String getData(){
        return db.getData();
    }
}

// we can externally configure in 2 ways
//1) using application properties
// 2) using environment variables (more precedence than application properties configuration)

// Constructor Dependency (most preferred)
// if a dependency is a core dependency of a particular bean then use constructor dependency
// 2) when you want to make the field as final