package week02_review.practice_tasks;
/*
1. Create a class named StudentInformationSystem.

    Given the following variables:
       1. firstName (String)
       2. lastName (String)
       3. age (int)
       4. grade (char)

     The program should display the full information of the student in the following format:

         Example:
               firstName = "James"
               lastName = "Johnson"
               age = 16
               grade = 'B'

         Output:
               Student Information:
                       Name: James Johnson
                       Age: 16
                       Grade: B

 */
public class PrintStatements {
    public static void main(String[] args) {
        String firstName="James";
        String lastName="Johnson";
        int age=16;
        char grade='B';
        System.out.println("Student Information:\n"+"\tName:\t"+firstName+
               " " +lastName
        +"\n\tage:\t"+age+"\n\tgrade:\t"+grade
                );
    }
}
