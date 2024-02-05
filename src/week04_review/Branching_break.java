package week04_review;


public class Branching_break {

    public static void main(String[] args) {
        String url = "www.google.com";
        String browser = "chrome";
        for (int i = 1; i < 8; i++) {
            if (i == 5 ) {  // if the iteration number is 5
                //break;  // exists from the current loop
                return; // exists current method
            }
            System.out.println("----------- 30 Sounds pause -------");
            System.out.println("Opening the \t " + browser + " browser .");
            System.out.println("Navigating to \t " + url);
            System.out.println("Executing the test case \t " + i);
            System.out.println("Getting the test result of test case  " + i);
            System.out.println(" Closing the \t" + browser);


        }
    }


}
