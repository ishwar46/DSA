package ExamPractice;

public class FooBar {

    // n times

    public static void main(String[] args) {
        int n = 5;
        //call the method to print
        printFooBar(n);

    }

    //print foobar
    public static void printFooBar(int n){
        for (int i = 0; i < n; i++){
            printFoo();
            printBar();

        }
    }

    //two function which print foo and bar

    //function one
    public static void printFoo(){
        System.out.print("Foo");
    }

    // function two
    public static void printBar(){
        System.out.print("Bar");
    }
}