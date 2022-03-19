package com.tonny.kaoshi;


import com.ulisesbocchio.jasyptspringboot.annotation.EnableEncryptableProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@EnableEncryptableProperties
@SpringBootApplication
public class KaoshiApp {
    public static void main(String args[]){
        SpringApplication.run(KaoshiApp.class,args);
    }
}
