package com.example.simple_calculater;

import java.util.ArrayList;
import java.util.List;

public class CalData {


    private List<Calculater> cal;

    // In this constructor we will create a dumpy data
    public CalData() {
        cal = new ArrayList<Calculater>();
        cal.add(new Calculater("+"));
        cal.add(new Calculater("-"));
        cal.add(new Calculater("*"));
        cal.add(new Calculater("/"));
    }

    public List<Calculater> getCalOP (String type) {
        List<Calculater> book = new ArrayList<>();
        for (Calculater b: cal) {
            if (b.getOp().equals(type)){
                book.add(b);
            }
        }
        return book;
    }

    public String[] getCalOpSpinner(){
        String [] operation = {"+","-","*","/"};
        return operation;
    }




}
