//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student {
    int id;
    float cgpa;
    static String uni = "UIU"; //static variables are accessible from everywhere and can access using class and object
}


class Car{
    String name;
    String color;
    String model;
    Car(String name,String color,String model) { // This is constructor and No Return Type and the name will be class name
        this.name = name;
        this.color = color;
        this.model = model;
    }

    Car(String name,String model) { //No Return Type and the name will be class name
        this.name = name;
        this.model = model;
    }


    void print(){
        System.out.println(" Name:"+name + " Color:"+color + " Model:"+model);
    }
}

class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(" ( x,y ):"+"("+x +","+ y+")");
    }
}




public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        System.out.println("University:"+ Student.uni);

        Student.uni = "BUET"; //changing the value using class
        System.out.println("New University:"+ Student.uni);

        Student s1 = new Student();
        s1.uni  = "King"; //changing the value using object
        System.out.println("New University Again:"+ Student.uni); //we can only use static things in the static function

        Car s2 = new Car("Toyota","Black", "MK4"); //using constructor from Car class
        s2.print();

        Car s3 = new Car("Toyota", "White");
        s3.print();

        double x = Math.pow(2,3); //Library available
        System.out.println("2^3:"+x);

        final float y = 10; //Final is like const variable. It cant be changed

        //Array
        int []arr=new int[5];
        //int arr[]={10,20,30,40,50};

        for(int i=0; i<5; i++){
            arr[i]=10*i;
        }
        for(int i=0; i<5; i++){
            System.out.println(" "+arr[i]);
        }

        Point pntr[] = new Point[5];

        for(int i=0; i< pntr.length; i++){
            pntr[i]= new Point(10,20); //for every pointer need one object
        }
        for(int i=0; i< pntr.length; i++){
            pntr[i].print();
        }


        }
    }

    //Array
    // int arr [] = new int [5] ---->>Declaration
    //There are 2 Types of Data-->1.Primitive(int,float,boolean,char, double etc)   2.Reference(String, Array0

