package week04_review;

public class ReturnVsExit {
    public static void main(String[] args) {
        System.out.println("Test Started ");
        methodA();
        System.out.println("Test Completed \t");
    }

    public static void methodA() {
        System.out.println(" Method A is being executed\t ");
       // return;

       System.exit(0);

    }
}
