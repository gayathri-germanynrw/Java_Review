package week02_review.practice_tasks;

public class PrintEmail {
    public static void main(String[] args) {
        /*
         Example:
       firstName = "Daniel"
       birthYear = 1985

     Output:
       Your generated emails are:
          Yahoo: Daniel_1985@yahoo.com
          Gmail: Daniel_1985@gmail.com
          Outlook: Daniel_1985@outlook.com
         */

        String firstName="Daniel";
        int birthYear=1982;
        String emailPattern=firstName+"_"+birthYear;
        String yahoo=emailPattern+"@yahoo.com";
        String gmail=emailPattern+"@Gmail.com";
        String outlook=emailPattern+"@Outlook.com";

        System.out.println("Your generated emails are:\n\tyahoo :"+yahoo
        +"\n\tGmail:"+gmail
        +"\n\toutlook:"+outlook);
    }
}
