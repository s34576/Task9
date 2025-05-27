import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {
   static int[] liczby= new int[10];
   static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Car> cars=new ArrayList<Car>();
        cars.add(new Car("Toyota",2010));
        cars.add(new Car("Nissan",2008));
        cars.add(new Car("Peugeot",2015));
        cars.add(new Car("Lexus",2020));
        cars.add(new Car("Fiat",2011));
        cars.add(new Car("Ford",2010));
        cars.add(new Car("Audi",2018));
        cars.add(new Car("Opel",2000));
        cars.add(new Car("Skoda",2001));
        cars.add(new Car("Dacia",2014));
        Collections.sort(cars);
        System.out.println("Zadanie1");
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("____________________________________________");
        System.out.println("Zadanie4");
        fillArray();
        System.out.println("Zawartość tablicy: ");
        for(int lic:liczby)
        {
            System.out.print(lic+" ");
        }
    }
    public static int readNumber() throws NegativeNumberException{
        System.out.println("Podaj liczbę: ");
        int war=scanner.nextInt();
        if(war<0)
        {
            throw new NegativeNumberException("Negative numbers are not allowed");
        }
        return war;
    }
    public static void fillArray(){
        for(int i=0;i<liczby.length;i++){
            try{
                liczby[i]=readNumber();
            }catch(NegativeNumberException e){
                System.out.println(e.getMessage());
                liczby[i]=0;
            }
        }
    }
}


