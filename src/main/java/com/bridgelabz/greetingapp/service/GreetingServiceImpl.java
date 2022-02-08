package com.bridgelabz.greetingapp.service;


import com.bridgelabz.greetingapp.repository.GreetingRepository;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.concurrent.atomic.AtomicLong;

@Service
@ToString
public class GreetingServiceImpl {

    @Autowired
    private GreetingRepository greetingRepository;

    private static final String template = "Hello,%s";
    private final AtomicLong counter = new AtomicLong();


}
