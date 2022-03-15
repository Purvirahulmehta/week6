package practice;
//instance veriable and instance method week 6 homework
public class Question1 {
    String name = "India";//instance veriable
    String name1 = " is ";//instance veriable
    String name2 = " the best.";//instance veriable

    public void test(){ //instance method
        System.out.print(name);//It should print as a India
        System.out.print(name1);//It should print as is
        System.out.print(name2);//It should print as the best.

    }

    public static void main(String[] args) { //main method
        Question1 question1 = new Question1(); //creating object for instance method
        question1.test();//to call the instance method into main method
    }


}
