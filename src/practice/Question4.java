package practice;
//import java.lang.instrument.;
public class Question4 {

    static String name1 = "Upton"; //static veriable
    static String name2 = " Court"; //static veriable
    String name3 = " Slough "; // instance veriable
    String name4 = " London";// instance veriable

    public static void main(String[] args) {
        Question4 question4 = new Question4();//creating object
        question4.school();//calling instance method
        school1();//calling static method1

    }

    public void school(){ //instance method
        System.out.println("This output is from instance method");
       // Question4 question4 = new Question4();//creating object
       // question4.school();//calling instance method
      // school1();//calling static method1
        System.out.println(name1);
        System.out.println(name2);
        System.out.println(name3);
        System.out.println(name4);

    }
    public static void school1(){ //static method
        Question4 question4 = new Question4();//creating object
       // question4.school();//calling instance method
        System.out.println("This input is from static method");
        System.out.println(question4.name1);//print static veriable
        System.out.println(question4.name2);//print static veriable
        System.out.println(question4.name3);//print instance veriable
        System.out.println(question4.name4);//print instance veriable

    }

    }
