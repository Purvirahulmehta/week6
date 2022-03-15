package practice;

public class Question3 {
    static int a = 10;//static veriable
            int b = 5;//instance veriable

        public void test1(){ //instance method
        System.out.println("This has both veriable in instance method");//it should print as a this is a instance&static  veriable in instance method
        System.out.println(a + b);
            System.out.println(a);
        System.out.println(b);
    }
public static void test(){//static method
    Question3 question3 = new Question3();//creating object for instance veriable
    //question3.test1();//calling the instance veriable into static method
    System.out.println("This has both veriable in static method");
    System.out.println(question3.a);
    System.out.println(question3.b);

}
    public static void main(String[] args) { // main method
        Question3 question3 = new Question3();//creating object for instance veriable
        question3.test1();////calling the instance method into main method
        test();//calling static method into main method
    }
}
