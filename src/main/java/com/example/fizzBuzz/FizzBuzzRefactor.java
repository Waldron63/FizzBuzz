package com.example.fizzBuzz;

public class FizzBuzzRefactor {
    public static String fizzbuzz(int n) {
        String resp = "";
        if (n % 3 == 0) {
            resp += "Fizz";
        }
        if (n % 5 == 0) {
            resp += "Buzz";
        }
        if (resp.isEmpty()) {
            resp = String.valueOf(n);
        }
        return resp;
    }

}
