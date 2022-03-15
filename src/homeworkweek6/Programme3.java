package homeworkweek6;

public class Programme3 {
    static int a = 2022;//static veriable
    String name = "London";//instance veriable
    //main method

    public static void main(String[] args) {
        Programme3 obj = new Programme3();//defining an object
        test1();//calling static method
        obj.test();//calling instance method

    }

    //instance method
    public void test() {
        System.out.println("This output is from my instance method" );
        System.out.print(a);//importing static veriable into instance method
        System.out.println(name);//importing instance veriable into instance method
    }

    public static void test1() { //static method
        Programme3 programme3 = new Programme3();//defining an object
        System.out.println("This output is from my static method" );
        System.out.print(programme3.a);//importing static veriable into static method
        System.out.println(programme3.name);//importing instance veriable into static method
    }
}
