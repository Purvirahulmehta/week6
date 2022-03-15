package homeworkweek6;

public class Programme1 {
    String bjp = "Shri";//Instance or Global veriable
    String name = " Modi";//Instance or Globel veriable

    public static void main(String[] args) {// Main method
        Programme1 obj = new Programme1();//object
      //  System.out.println(obj.bjp);//bjp
        obj.test();//to call instance method into main method
      //  Programme1 obj1 = new Programme1();//object
       // System.out.println(obj1.name);//Modi

    }

        public void test() {  //instance method

        System.out.println(bjp + name);
        }
    }
