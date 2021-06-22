import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        double armut,elma,domates,muz,patlican,a=2.14,e=3.67,d=1.11,m=0.95,p=5.0,toplam;

        Scanner input =new Scanner(System.in);

        System.out.print("Armut Kaç Kilo ? : ");
        armut = input.nextDouble();
        System.out.print("Elma Kaç Kilo ? : ");
        elma = input.nextDouble();
        System.out.print("Domates Kaç Kilo ? : ");
        domates = input.nextDouble();
        System.out.print("Muz Kaç Kilo ? : ");
        muz = input.nextDouble();
        System.out.print("Patlican Kaç Kilo ? : ");
        patlican = input.nextDouble();

        toplam=((armut*a)+(elma*e)+(domates*d)+(muz*m)+(patlican*p));

        System.out.println("Toplam Tutar : "+ toplam+ " TL");
    }
}
