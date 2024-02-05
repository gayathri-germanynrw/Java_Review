package week02_review.day03_operators_labpractice;

public class EligibleForWork {
    public static void main(String[] args) {
        int age=24;
        boolean isEligible=((age>=18) & (age<=65));
        System.out.println("Am i eligible to work ? "+isEligible);
    }
}
