package com.company;

import java.util.Scanner;

public class Main {

    static double prostokat(double a, double b){
        System.out.println("Pole prostokata wynosi: "  + a * b);
        return a * b;
    }

    static double kwadrat(double a){
        System.out.println("Pole kwadratu wynosi: " + a * a);
        return a * a;
    }
    static double trojkat(double a, double h) {
        System.out.println("Pole trojkata wynosi: " +  (a * h)/2);
        return (a * h)/2;
    }
    static double rab(double a, double h) {
        System.out.println("Pole rabu wynosi: " + a * h);
        return a * h;
    }
    static double rownoleglobok(double a, double h) {
        System.out.println("Pole rownolegloboku wynosi: " + a * h);
        return a * h;
    }
    static double trapez(double a, double b, double h) {
        System.out.println("Pole trapezu wynosi: " + (a+b)*h/2);
        return (a+b)*h/2;
    }


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        // zadanie 1
        System.out.print("Powiedz prosze jaka figura Cibie interesuje");
        int figura = scanner.nextInt();

        switch(figura){
            case 1:
                System.out.println("Podaj bok a: ");
                double bok_a = scanner.nextDouble();
                System.out.println("Podaj bok b; ");
                double bok_b = scanner.nextDouble();
                prostokat(bok_a, bok_b);
                break;
            case 2:
                System.out.println("Podaj bok a: ");
                double bok_kwadrat = scanner.nextDouble();
                kwadrat(bok_kwadrat);
                break;
            case 3:
                System.out.print("Podaj bok a:");
                double bok_trojkat = scanner.nextDouble();
                System.out.println("Podaj h: ");
                double h = scanner.nextDouble();
                trojkat(bok_trojkat, h);
                break;
            case 4:
                System.out.print("Podaj bok a:");
                double bok_rabu = scanner.nextDouble();
                System.out.println("Podaj h: ");
                double h2 = scanner.nextDouble();
                rab(bok_rabu, h2);
                break;
            case 5:
                System.out.print("Podaj bok a:");
                double bok_rownoleglobok = scanner.nextDouble();
                System.out.println("Podaj h: ");
                double h3 = scanner.nextDouble();
                rownoleglobok(bok_rownoleglobok, h3);
                break;
            case 6:
                System.out.print("Podaj bok a:");
                double bok_trapez = scanner.nextDouble();
                System.out.println("Podaj b: ");
                double bok_trapez2 = scanner.nextDouble();
                System.out.print("Podaj bok h:");
                double h4 = scanner.nextDouble();
                trapez(bok_trapez, bok_trapez2, h4);
                break;

        }



        //zadanie 2

        System.out.print("Podaj jedną liczbę całkowitą");
        int numer = scanner.nextInt();

        boolean moduloPrzezDwa = numer % 2 == 0;
        boolean moduloPrzezTrzy = numer % 3 == 0;
        boolean moduloPrzezPiec = numer % 5 == 0;

        if (moduloPrzezPiec && moduloPrzezTrzy && moduloPrzezDwa) {
            System.out.print("Liczba " + numer + " jest podzielna przez 2,3 i 5");
        } else if (moduloPrzezDwa && moduloPrzezTrzy) {
            System.out.print("Liczba " + numer + " jest podzielna przez 2 i 3");
        } else if (moduloPrzezPiec) {
            System.out.print("Liczba " + numer + " jest podzielna przez 5");
        } else if (moduloPrzezTrzy) {
            System.out.print("Liczba " + numer + " jest podzielna przez 3");
        } else if (moduloPrzezDwa) {
            System.out.print("Liczba " + numer + " jest podzielna przez 2");
        } else {
            System.out.print("Liczba " + numer + " nie jest podzielna przez 2,3 i 5");

        }



        //zadanie 3


        System.out.print("Podaj liczbe calkowita skladajaca sie skladajaca sie  maksymalnie z czterech cyfr ");


        double liczba = scanner.nextDouble();

        if (liczba < 10) {
            System.out.print("Numer" + liczba + " jest liczba jednocyfrowa");
        } else if (liczba <= 100) {
            System.out.print("Numer" + liczba + " jest liczba dwucyfrowa");
        } else if (liczba >= 100) {
            System.out.print("Numer" + liczba + " jest liczba trzycyfrowa");
        } else if (liczba >= 1000) {
            System.out.print("Numer" + liczba + " jest liczba czterocyfrowa");
        }


        //zadanie 4

        System.out.print("Podaj numer misiąca ");

        int numerMiesiaca = scanner.nextInt();

        switch (numerMiesiaca) {

            case 1:
                System.out.print("Styczeń mrozi, lipiec skwarem grozi.");
                break;
            case 2:
                System.out.print("Idzie luty, podkuj but");
                break;
            case 3:
                System.out.print("Kiedy w marcu deszczu wiele, nieurodzaj zboża ściele.");
                break;
            case 4:
                System.out.print("Gdyby w kwietniu nie padało, to owoców będzie mało.");

            case 5:
                System.out.print("Gdy kukułka kuka w maju, spodziewaj się urodzaju.");
                break;
            case 6:
                System.out.print("Gdy czerwiec z burzami - staw rybny, a las grzybny.");
                break;
            case 7:
                System.out.print("Kiedy lipiec daje deszcze, długie lato będzie jeszcze.");
                break;
            case 8:
                System.out.print("Kiedy sierpień wrzos rozwija - jesień krótka, szybko mija.");
                break;
            case 9:
                System.out.print("Jaki pierwszy wrzesień, taka będzie jesień.");
                break;
            case 10:
                System.out.print("Gdy październik ciepło trzyma, zwykle mroźna bywa zima.");
                break;
            case 11:
                System.out.print("W listopadzie goło w sadzie.");
                break;
            case 12:
                System.out.print("Grudzień to miesiąc zawiły, czasem srogi, czasem miły.");
                break;

        }



        //zadanie 5
        System.out.print("Podaj numer misiąca ");

        int numerMiesiaca2 = scanner.nextInt();

        switch (numerMiesiaca2) {
            case 1:
                System.out.print("To dopiero poczatek...Przed nami jeszcze troche :)");
                break;
            case 2:
                System.out.print("Przed nami jeszcze marzec, kwiecien, maj, czerwiec, lipiec, sierpien, wrzesien, pazdziernik, listopad i grudzien");
                break;
            case 3:
                System.out.print("Przed nami jeszcze kwiecien, maj, czerwiec, lipiec, sierpien, wrzesien, pazdziernik, listopad i grudzien.");
                break;
            case 4:
                System.out.print("Przed nami jeszcze maj, czerwiec, lipiec, sierpien, wrzesien, pazdziernik, listopad i grudzien");
                break;
            case 5:
                System.out.print("Przed nami jeszcze czerwiec, lipiec, sierpien, wrzesien, pazdziernik, listopad i grudzien.");
                break;
            case 6:
                System.out.print("To już połowa! Przed nami jeszcze lipiec, sierpien, wrzesien, pazdziernik, listopad i grudzien.");
                break;
            case 7:
                System.out.print("Przed nami jeszcze sierpien, wrzesien, pazdziernik, listopad i grudzien");
                break;
            case 8:
                System.out.print("Przed nami jeszcze wrzesien, pazdziernik, listopad i grudzien.");
                break;
            case 9:
                System.out.print("Przed nami jeszcze pazdziernik, listopad i grudzien.");
                break;
            case 10:
                System.out.print("Jestesmy blisko konca! Przed nami jeszcze listopad i grudzien.");
                break;
            case 11:
                System.out.print("To ostatnia prosta! Przed nami jeszcze tylko grudzien.");
                break;
            case 12:
                System.out.print("Hura! To już koniec roku!");
                break;

        }




        //zadanie 6

        System.out.print("Podaj liczbe rzeczywista");
        int liczbaRzeczywista= scanner.nextInt();

        if (liczbaRzeczywista<0) {
            System.out.print("Wartość funkcji signum dla "+ liczbaRzeczywista+ " to -1");
        }
        else if (liczbaRzeczywista>0){
            System.out.print("Wartość funkcji signum dla "+ liczbaRzeczywista+ " to 1");
        }
        else if (liczbaRzeczywista==0){
            System.out.print("Wartość funkcji signum dla "+ liczbaRzeczywista+ " to 0");
        }




        //zadanie 7

        System.out.print("Podaj liczbe a ");
        int a= scanner.nextInt();
        System.out.print("Podaj liczbe b ");
        int b= scanner.nextInt();
        System.out.print("Podaj liczbe n ");
        int n= scanner.nextInt();

        if(a%n == b%n)
        {
            System.out.print("Liczba"+a+"i"+b+"nie przystaja do siebie modulo"+n);
        }
        else
        {
            System.out.print("Liczba  "+a+"  i"+b+"  przystaja do siebie modulo  "+n);
        }
    }
}
