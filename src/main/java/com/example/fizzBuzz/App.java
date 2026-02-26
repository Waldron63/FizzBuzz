package com.example.fizzBuzz;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        for (int i = 1; i <= 100; i++) {
            System.out.println( i+":"+ FizzBuzz.fizzbuzz(i));
        }
    }
}
