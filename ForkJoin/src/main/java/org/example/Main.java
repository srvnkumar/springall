package org.example;

import java.util.concurrent.ForkJoinPool;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        long[] arr = new long[1_000_000000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        ForkJoinPool pool = ForkJoinPool.commonPool();

        SumTask task = new SumTask(arr, 0, arr.length);

        long result = pool.invoke(task);

        System.out.println("Sum = " + result);
    }
}