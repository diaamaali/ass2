package com.example.simple_calculater;

public class Calculater {
    String op;


    public Calculater() {
    }

    public Calculater(String op) {
        this.op = op;
    }


    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        this.op = op;
    }

    @Override
    public String toString() {
        return "Calculater{" +
                "op='" + op + '\'' +
                '}';
    }
}
