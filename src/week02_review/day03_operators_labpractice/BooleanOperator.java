package week02_review.day03_operators_labpractice;

public class BooleanOperator {
    public static void main(String[] args) {
        // The logical AND checks for short circuit evalution. if first condition false then it will not go for second check
        int b=2;
        boolean result=(++b ==2 || b==2)&& --b==2;
        System.out.println(result);
        System.out.println(b);
    }
}
