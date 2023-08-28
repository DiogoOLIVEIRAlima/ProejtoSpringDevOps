package com.example.SpringDevOps;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/DevOps")
public class HelloController {

    @GetMapping("/Hello")
    public String HelloWorld(){
        return "Bem vindo a Api que vai ser hospedada na disciplina de DevOps";
    }
}
