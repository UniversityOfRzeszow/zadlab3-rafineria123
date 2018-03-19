/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;

/**
 *
 * @author Asia
 */
import java.util.Scanner;
import static java.lang.Math.*;
import java.io.*;
import java.lang.*;
public class Main {

    public int zadanie(){
        System.out.println("Podaj Numer zadania");
        Scanner zad;
        zad=new Scanner(System.in);
        int zadanie=zad.nextInt();

        return zadanie;
    }
    //zadanie 1.4
    public void zadanie1(){
        System.out.println("Podaj liczbe: ");
        Scanner zad;
        zad=new Scanner(System.in);
        int liczba=zad.nextInt();
        System.out.println("Podaj o ile miejsc przesunac: ");
        int miejsca=zad.nextInt();
        System.out.println("W ktora strone przesunac?: ");
        System.out.println("1. w lewo ze znakiem <<");
        System.out.println("2. w prawo ze znakiem >>");
        System.out.println("3. w prawo bez znaku >>>");
        int przesuniecie=zad.nextInt();
        switch(przesuniecie){
              case 1:
                 liczba=liczba<<miejsca;
                 System.out.println("Wynik to: "+liczba);
                 break;
              case 2:
                 liczba=liczba>>miejsca;
                 System.out.println("Wynik to: "+liczba);
                 break;
              case 3:
                 liczba=liczba>>>miejsca;
                 System.out.println("Wynik to: "+liczba);
                 break;
                    
              default:
                 System.out.println("Nie ma takiej opcji");
                 break;
        }
                
                
    }
    //zadanie 1.7
    public void zadanie2(){
        //! to NOT, ^ to XOR
      Scanner zad;
      zad=new Scanner(System.in);  
      System.out.println("Podaj wartość logiczną(true/false) X: ");
      boolean x=zad.nextBoolean();
      System.out.println("Podaj wartość logiczną(true/false) Y: ");
      boolean y=zad.nextBoolean();
        System.out.println("NOT   !X= "+(!x));
        System.out.println("NOT   !Y= "+(!y));
        System.out.println("XOR    X^Y= "+(x^y));
        System.out.println("XOR    Y^X= "+(y^x));
          
    }
    //zadanie 2.2
    public void zadanie3(){
        //char[] toCharArray()- Zamienia Stringa w tablice znaków
        System.out.println("\n\n1.char[] toCharArray()");
            String str="rafal";
            char[] tablica= new char[str.length()];
            tablica=str.toCharArray();
            System.out.println(str);
        //byte[] getBytes()- Zamienia Stringa w tablice bajtową z zakodowanymi kolejnymi znakami  
        System.out.println("\n\n2.byte[] getBytes()");
            byte[] tablica1= new byte[1000];
            tablica1=str.getBytes();
            System.out.println(tablica1);
        //boolean equals(String str)- Sprawdza czy dwa podane Stringi sa identyczne
        System.out.println("\n\n3.boolean equals(String str)");
            String b1,b2;
            boolean equal;
            b1="rafau";
            b2="rafau";
            equal=b1.equals(b2);
            System.out.println("b1:" +b1+ " i b2:" +b2+ " sa rowne " + equal);
        //boolean equalsIgnoreCase(String str)- Sprawdza czy dwa podane stringi sa identyczne(ignoruje rożnice
        // w duzych i malych literach)
        System.out.println("\n\n4.boolean equalsIgnoreCase(String str)");
            String b3,b4;
            boolean equall;
            b3="rafau";
            b4="Rafau";
            equall=b3.equals(b4);
            System.out.println("b3:" +b3+ " i b4:" +b4+ " sa rowne " + equall);
        //int campareTo(String str)- Porownuje dwa stringi leksykograficznie
        System.out.println("\n\n5.int campareTo(String str)");
            String str51="Rafau",str52="rafauAaAaaaa";
            int wynik=str51.compareTo(str52);
            System.out.println(wynik);
        //int campareToIgnoreCase(String str)- Porownuje dwa stringi leksykograficznie ignorując duże i małe litery
        System.out.println("\n\n6.int campareToIgnoreCase(String str)");
            wynik=str51.compareToIgnoreCase(str52);
            System.out.println(wynik);
        //Wyświetla kiedy (w kolejnosci od lewej) po raz pierwszy wystepuje podana liczba w Stringu(zaczynamy od 0)
        System.out.println("\n\n7.int indexOf(int i)");
            String str7="rafauuuu123";
            System.out.println("Pierwsze  1 od lewej to: "+str7.indexOf( '1' ));
        //Wyświetla kiedy (w kolejnosci od lewej) po raz pierwszy wystepuje podany znak lub ciag znakow w Stringu(zaczynamy od 0)
        System.out.println("\n\n8.int indexOf(String str)");
        //Wyświetla kiedy (w kolejnosci od lewej) po raz ostatni wystepuje podana liczba w Stringu(zaczynamy od 0)
        System.out.println("\n\n9.int lastIndexOf(int i)");
            String str8="rafauuuu1231";
            System.out.println("ostatnia  1 od lewej to: "+str8.lastIndexOf( '1' ));
        //Wyświetla kiedy (w kolejnosci od lewej) po raz ostatni wystepuje podany znak lub ciag znakow w Stringu(zaczynamy od 0)
        System.out.println("\n\n10.int lastIndexOf(String str)");
        //Wyświetla część stringa od podanego indexu
        System.out.println("\n\n11.String substring(int startString)");
            String  str10="fafauufaf";
            System.out.println("Wyswietlanie od 3ciego znaku: "+str10.substring(2));
        //Wyświetla część stringa w od podanego indexu do podanego indexu
        System.out.println("\n\n12.String substring(int startString, int stopString)");
            System.out.println("Wyswietlanie od 3ciego znaku do 5tego: "+str10.substring(2,4));
        //Zamienia w tekscie podany znak na inny
        System.out.println("\n\n13.String replace(char orginal, char zamiennik)");
            String str13="fafuafafueufa";
            System.out.println("Zamienia kazde a na e: "+str13.replace("a","e"));
        //Zwraca tego samego stringa przy czym usuwa spacje na poczatku i koncu
        System.out.println("\n\n14.String trim()");
            String str14=" eeewe ";
            System.out.println("Przed zamiana:"+str14+"\nPo zamianie:"+str14.trim());
        //Zamienia wszystkie litery w stringu na małe litery
        System.out.println("\n\n15.String toLowerCase()");
            String str15="RAFAu";
            System.out.println("Przed: "+str15+" Po: "+str15.toLowerCase());
        //Zamienia wszystkie litery w stringu na duze litery
        System.out.println("\n\n16.String toUpperCase()");
            System.out.println("Przed: "+str15+" Po: "+str15.toUpperCase());
        //Dzieli Stringa i zwraca cześci w postaci tablicy char[], regex oznacza gdzie ma dzielic, a limit to ilosc oddzielnych tablic
        System.out.println("\n\n17.String[] split(String regex, int limit)");
            String str17="Rafal Raf faf Rafau afau";
            for(String w:str17.split("\\s",4)){  
            System.out.println(w);  
            }
        //Dzieli Stringa i zwraca cześci w postaci tablicy char[], regex oznacza gdzie ma dzielic, limit podstawowy oznacza ze kazdy wyraz bedzie w odddzielnej tablicy
        System.out.println("\n\n18.String[] split(String regex)");
            for(String w:str17.split("\\s")){  
            System.out.println(w);  
            }
            
        //boolean equals(String str)
        //boolean equalsIgnoreCase(String str)
        //int campareTo(String str)
        //int campareToIgnoreCase(String str)
        //int indexOf(int i)
        //int indexOf(String str)
        //int lastIndexOf(int i)
        //int lastIndexOf(String str)
        //String substring(int startString)
        //String substring(int startString, int stopString)
        //String replace(char orginal, char zamiennik)
        //String trim()
        //String toLowerCase()
        //String toUpperCase()
        //String[] split(String regex, int limit)
        //String[] split(String regex)
        
    }
    public double zadanie41(double podstawa,int wykladnik){
        double wynik=1;
        for(int i=0;i<wykladnik;i++){
            wynik=wynik*podstawa;
        }
        return wynik;
        
    }
    public double zadanie42(double podstawa,int wykladnik){
        if(wykladnik==0)return 1;
        else if(wykladnik%2!=0){
            return podstawa*pow(zadanie42(podstawa,(wykladnik-1)/2),2);
        }
        else{
            return pow(zadanie42(podstawa,wykladnik/2),2);
        }
    }
    public double zadanie5(int n){
       if(n==1||n==2)return 1;
       else{
           return zadanie5(n-1)+zadanie5(n-2);
       }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO 1.4, 1.7, 
        // TODO 2.2
        // TODO 3.3, 3.4
        int zadanie,przesuniecie,liczba,miejsca;
        while(true){
            Main funkcja=new Main();
            zadanie=funkcja.zadanie();
            //zad 1.4
            if(zadanie==1){
                funkcja.zadanie1();
            }
            //zadanie 1.7
            if(zadanie==2){
                funkcja.zadanie2();
            }
            //zadanie 2.2
            if(zadanie==3){
                funkcja.zadanie3();
            }
            //zadanie 3.3
            if(zadanie==4){
                double wynikpot;
                System.out.println("Ktorą metode wybierasz:");
                System.out.println("1. Iteracyjna\n 2.Rekurencyjna");
                Scanner zad1;
                zad1=new Scanner(System.in);
                int x=zad1.nextInt();
                double podstawa;
                int wykladnik;
                System.out.println("Podaj podstawe potegi");
                podstawa=zad1.nextDouble();
                System.out.println("Podaj wykladnik potegi");
                wykladnik=zad1.nextInt();
                if(x==1)wynikpot=funkcja.zadanie41(podstawa,wykladnik);
                else{
                    wynikpot=funkcja.zadanie42(podstawa,wykladnik);
                    
                }
                System.out.println("Wynik to: "+wynikpot);
            }
            //zadanie 3.4
            if(zadanie==5){
                Scanner zad1;
                zad1=new Scanner(System.in);
                int n;
                System.out.println("Podaj, ktory wyraz ciagu Fibonacciego obliczyc");
                n=zad1.nextInt();
                System.out.println(n+"-ty wyraz ciagu Fibonacciego: "+funkcja.zadanie5(n));
                funkcja.zadanie5(n);            }
            
            
            
            
            
        }

   }
}