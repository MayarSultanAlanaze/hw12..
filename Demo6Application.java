package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo6Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo6Application.class, args);
    }

     /* output1
     hey from message1
     */


    /* output 2
      hey from message1
        hey from message2
     */


    /* output 3
      hey from message1
        hey from message3
        hey from message2
     */


      /* output 4
        hey from message1
        hey from Main conteroller
        hey from message3
        hey from message2
     */


    /* output 5
        hey from message3
       hey from message2
       hey from Main Controller
       hey from message1
     */


}
