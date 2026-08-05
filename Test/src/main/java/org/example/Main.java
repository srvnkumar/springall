package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var factory= Thread.ofVirtual().factory();

       try(var executors = Executors.newThreadPerTaskExecutor(factory)) {

               executors.submit(() -> {
                   System.out.println("Hello from virtual thread: " + Thread.currentThread());
               });
               executors.submit(() -> {
                   System.out.println("Hello from virtual thread: " + Thread.currentThread());
               });
               executors.submit(() -> {
                   System.out.println("Hello from virtual thread: " + Thread.currentThread());
               });
               executors.submit(() -> {
                   System.out.println("Hello from virtual thread: " + Thread.currentThread());
               });

       }

    }




}