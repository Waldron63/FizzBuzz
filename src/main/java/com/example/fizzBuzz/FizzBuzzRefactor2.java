package com.example.fizzBuzz;

import java.util.HashMap;

public class FizzBuzzRefactor2 {

    private final HashMap<Integer, String> types = new HashMap<>();

    public String fizzbuzz(int n) {
        // banderas
        int total = types.size();
        int contador = 0;
        String resp = "";

        //ciclo de iteracion
        for (Integer i : types.keySet()) {
            contador ++;
            if (n % i == 0) {
                resp += types.get(i);
            }
            if (contador == total && resp.isEmpty()) {
                resp = String.valueOf(n);
            }
        }
        return resp;
    }

    public FizzBuzzRefactor2() {
        types.put(3, "Fizz");
        types.put(5, "Buzz");
    }
}
