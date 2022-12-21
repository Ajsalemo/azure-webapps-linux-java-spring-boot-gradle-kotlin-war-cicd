package com.devops.azure.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    String message = "azure-webapps-linux-java-tomcat-war-devops-gradle";

    @GetMapping("/")
    public String index() {
        return message;
    }
}
