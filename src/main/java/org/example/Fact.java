package org.example;

import java.util.ArrayList;
import java.util.List;

public class Fact implements Node{
    private static List<Fact> facts = new ArrayList<>();

    private static void printFacts(){facts.forEach(System.out::println);}

    private String name;

    public Fact(String name){
        this.name=name;
        facts.add(this);
    }

    @Override
    public Node next(){
        return null;
    }

    @Override
    public boolean isFact(){return true;}

    @Override
    public String toString(){return name;}
}
