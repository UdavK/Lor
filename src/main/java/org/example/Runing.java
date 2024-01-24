package org.example;

public class Runing {
    public static void run(Node node){

        while (!node.isFact()){
            node=node.next();
        }

        System.out.println("Vozmozhno vash diagnoz:" + node);
    }
}
