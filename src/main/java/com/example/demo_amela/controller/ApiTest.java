package com.example.demo_amela.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("api/v1/")
@Profile("dev")
public class ApiTest {
    @Value("${ans}")
    private String ans;
    @GetMapping("/user/{id}")
    ResponseEntity<?> getUser(@PathVariable("id")Optional<String> id){
        if(id.isEmpty()){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok(ans+" user: "+id.get());

    }
    @PostMapping("/user/insert")
    ResponseEntity<?> addUser(@RequestParam String name,
                              @RequestParam String phonenumber){
        return ResponseEntity.ok(ans+" insert "+name+" phonenum: "+ phonenumber);
    }

}
