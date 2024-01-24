package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Fact f1 = new Fact("Laringit");
        Fact f2 = new Fact("Tonzillit");
        Fact f3 = new Fact("Faringit");
        Fact f4 = new Fact("Rinit");
        Fact f5 = new Fact("Naruzhniy otit");
        Fact f6 = new Fact("Perforazia barabannoy pereponki");
        Fact f7 = new Fact("Otomikoz");
        Fact f8 = new Fact("Sinusit");
        Fact f9 = new Fact("Izkrevlenie peregorodki");
        Fact f10 = new Fact("Allergicheskiy Rinit");
        Fact f11= new Fact("Adenoid");
        Fact f12= new Fact("Poterya sluxa");
        Fact f13= new Fact("Sredniy otit");


        Question q8 = new Question("Есть боли при изменении положения головы. Боли которые отдают в зубы, голову, кости черепа",f8,f4);
        Question q12 = new Question("Есть ли выделения из слухового протока?",f7,f13);
        Question q4 = new Question("Голос изменен?",f1,null);
        Question q2= new Question("Боль усиливается при питье?",f2,f3);
        Question q11 = new Question("Ухо внешне изменено?",f5,q12);
        Question q10 = new Question("Есть другие симптомы кроме нарушения слуха?",q11,f12);
        Question q7 = new Question("Есть проблемы со слухом?",f11,q8);
        Question q6 = new Question("Есть ли слезоточивость, чихание?",f10,q7);
        Question q3 = new Question("Есть лающий кашель?",q4,null);
        Question q5 = new Question("Есть ли выделения из носа?",q6,f9);
        Question q9 = new Question("Была травма и есть ли кровотечение?",f6,q10);
        Question q1 = new Question("глотать больно?",q2,q3);

        Scanner sc =new Scanner(System.in);
        String oblast = sc.next();
        if(oblast.equals("u")){
            Runing.run(q9);
        }
        else if(oblast.equals("g")){
            Runing.run(q1);
        }
        else{
            Runing.run(q5);
        }


    }
}