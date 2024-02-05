package week04_review;

public class Automation_While {
    public static void main(String[] args) {
        int number=50;
        int count = 0;
        while(number%2==0){
            number/=2;
            count++;
        }

        System.out.println("Number of divisible by 2 is \t"+count);
    }
}
