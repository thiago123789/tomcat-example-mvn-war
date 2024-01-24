package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@RestController
public class TomcatController {
    @GetMapping("/")
    public Collection<String> helloWorld() {
        return IntStream.range(0, 10).mapToObj(i -> "Hello World " + i)
                .collect(Collectors.toList());
    }

}
