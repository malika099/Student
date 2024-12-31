import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       /* Car car = new Car();
        car.brand = "BMW";
        car.color = "white";
        car.year = 2019;
        System.out.println(car.brand);
        System.out.println(car.color);
        System.out.println(car.year);

        Car car2 = new Car();
        car2.brand = "tesla";
        car2.color = "blue";
        car2.year2 = 2024;
        System.out.println(car2.brand);
        System.out.println(car2.color);
        System.out.println(car2.year2);

        Car car3 = new Car();
        car3.brand = "honda";
        car3.color = "black";
        car3.year3 = 2023;
        System.out.println(car3.brand);
        System.out.println(car3.color);
        System.out.println(car3.year3);


        Dog dog = new Dog();
        dog.name = "Cat";
        dog.color = "White";
        Scanner scanner = new Scanner(System.in);
        dog.years = scanner.nextInt();

        System.out.println(dog.name);
        System.out.println(dog.color);
        System.out.println(2024-dog.years);

        Student student = new Student();
        student.name = "name: "+"Dastan";
        student.faculty = "faculty: "+"програитрования";
        student.SchoolNumber = 20;
        student.university = "name university: "+"Естественно–технический";
        student.years = 17;
        System.out.println(student.name);
        System.out.println(student.faculty);
        System.out.println(student.SchoolNumber);
        System.out.println(student.university);
        System.out.println(student.years);
        //
        Student student2 = new Student();
        student2.name = "name: "+"Kankey";
        student2.faculty = "Faculty: "+"cardiologist";
        student2.SchoolNumber = 17;
        student2.university = "name uneversity; "+"Кафедра кардиохирургии и эндоваскулярной хирургии";
        student2.years = 17;
        System.out.println(student2.name);
        System.out.println(student2.faculty);
        System.out.println(student2.SchoolNumber);
        System.out.println(student2.university);
        System.out.println(student2.years);
        //
        Student student3 = new Student();
        student3.name = "name: "+"Ulan";
        student3.faculty = "faculty: "+"програмирования";
        student3.SchoolNumber = 5;
        student3.university = "university"+"IT Hub Academy";
        student3.years = 18;
        System.out.println(student3.name);
        System.out.println(student3.faculty);
        System.out.println(student3.SchoolNumber);
        System.out.println(student3.university);
        System.out.println(student3.years);

        Rectangle rect = new Rectangle("Милфа", "red",30);
        System.out.println(rect);

        Curss curss = new Curss("English",3,"Venera","Mondy,Wednsday,friday" );
        System.out.println(curss);




        Studentt stud = new Studentt("Аврора","Уилсон","11.01.2000", -24);

        if (stud.age>0){
            System.out.println("терс эмес сан");
        }
        else {
            System.out.println("терс сан");
        }
        System.out.println(stud);*/



        colculate(4,4);
        colculate(7L,1);
        colculate( 3.5, 2);
        colculate(4,1,2);
        colculate("Hello,","Компьютор!");
        colculate("Я тебе дал", 10);
        colculate(9);
        colculate(8.0);

    }
    public static void  colculate (int a ,int  b ){
        int f = a+b;
        System.out.println("Сложение целых чисел: "+f);
    }
    public static void colculate (long a, int b){
        double o = a - b;
        System.out.println("Вычитание целых чисел:"+o);
    }
    public static void colculate   (double a, double b){
        double c = (int) (a * b);
        System.out.println("Умножение дробных чисел:"+c);
    }
    public static void colculate (int a, int b,int c){
        int d = a + b * c;
        System.out.println("Сложение трёх чисел:"+d);
    }
    public static void colculate(String a , String b){
        String s = a;
        String e = b;
        System.out.println("Объединение строк:"+s+e);
    }
    public static void colculate (String a , int b){
        String s = a;
        int d = b;
        System.out.println("Объединение строки с числом:"+a + b);
    }
    public static void colculate (int a){
        int w = a;
        System.out.println("Длина строки:"+w);
    }
    public static void colculate (double a ){
        double d = a;
        System.out.println("Возведение в степень:"+d);


        System.out.println("malika");

        int f = 10;
        int b = 20;
        int sum = f + b;
        System.out.println(sum);
        System.out.println("Malika");
        System.out.println("Kanukey Djanybekova");//kjhghjk
        System.out.println("ulan");

        mm(1);
    }
    public static void mm (int a ){
        System.out.println(1);
        System.out.println(3);
    }
}
