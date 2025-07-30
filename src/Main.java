//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
class Student {
    int id;
    float cgpa;
    static String uni = "UIU"; //static variables are accessible from everywhere and can access using class and object
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


        }
    }

