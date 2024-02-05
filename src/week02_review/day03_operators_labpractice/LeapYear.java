package week02_review.day03_operators_labpractice;

public class LeapYear {
    public static void main(String[] args) {
        int year=2020;
        boolean isLeapYear=(year%4==0 && year%100!=0)||(year%400==0);
        System.out.println("Is leap year ? "+isLeapYear);
    }
}
