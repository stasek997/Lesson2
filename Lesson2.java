import java.util.Scanner;
public class Lesson2 {
    public static void main(String[] args) {
        one();
        two();
        three();
    }
    static void one(){
                int a = 4532;
                int b = (a%1000)/100;
                System.out.println(b);
    }
    static void two(){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите время отправления");
        int h1 = in.nextInt()*60;
        int m1 = in.nextInt();
        System.out.println("Введите время прибытия");
        int h2 = in.nextInt()*60;
        int m2 = in.nextInt();
        int suma= (h2+m2)-(m1+h1);
        System.out.println("Время проведенное в дороге:" +  suma);

    }
    static void three(){
        int number,first,second,third;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите трёхзначное число");
        number =in.nextInt();
        first = (number - number % 100)/100;
        second = (number /10) %10;
        third = number %10 ;
        System.out.println(third*100+second*10+first);
    }
    }



