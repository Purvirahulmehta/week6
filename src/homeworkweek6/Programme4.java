package homeworkweek6;

public class Programme4 {
    static String name = "Shri";//static veriable
    static String name1 = "Narendra";//static veriable
    String name2 = "bhai A";//instance veriable
    int a = 1;//instance veriable
    //main method
    public static void main(String[] args) {
        Programme4 obj = new Programme4();//defining an object
        test1();//instance method
        obj.test();//static method

    }

    //instance method
    public void test() {
        System.out.println("This output is from my instance method");
        System.out.print(name);//importing static veriable into instance method
        System.out.print( name1);//importing static veriable into instance method
        System.out.print( name2);//importing instance veriable into instance method
        System.out.println( a);//importing instance veriable into instance method
    }
    //static method
    public static void test1() { //static method
        Programme4 programme4 = new Programme4();//defining an object
        System.out.println("This output is from my static method" );
        System.out.print(programme4.name);//inporting instance veriable into static method
        System.out.print(programme4.name1);//inporting instance veriable into static method
        System.out.print(programme4.name2);
        System.out.println(programme4.a);
    }
}
