package com.example.helloworld;

import java.util.concurrent.ExecutionException;

public class HelloWorld {
    public static void main(String[] arg) {
        System.out.println("hello world");
        int i = 0;
        while(i <= 5){
            System.out.println(i);
            i++;
        }
        String name = "test";
        for(int j = 0; j <= 3;j++){
            System.out.printf("this is J: %d %s \n",j, name);
        }
        try
        {
            int myNumber = 10 / 0;
        }
        catch(Exception e)
        {
            System.out.println("Error");

            System.out.println(e);

        }
        throw new RuntimeException("exp test");
    }
    //CHANGE
}

