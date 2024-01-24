package org.example;

import java.util.Scanner;

public class Question implements Node {
    private String q;

    private Node yes;

    private Node no;

    public Question(String q, Node yes, Node no){
        this.q=q;
        this.yes=yes;
        this.no=no;
    }

    @Override
    public Node next(){
        System.out.println(q);
        System.out.println("[y/n]");
        Scanner sc = new Scanner(System.in);
        String answer = sc.next();
        if(answer.equals("y")){
            return yes;
        }
        else if(answer.equals("n")){
            return  no;
        }
        else{
            return null;
        }
    }

    @Override
    public boolean isFact(){
        return false;
    }

    @Override
    public String toString(){
        return q;
    }


}
