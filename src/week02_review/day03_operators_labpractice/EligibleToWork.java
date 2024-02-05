package week02_review.day03_operators_labpractice;

public class EligibleToWork {
    public static void main(String[] args) {
        double age=15.9;
        boolean hasLearningPermit=true;
        boolean hasDriverLicense=false;
        boolean result=( (age>=18 && hasDriverLicense) ||((age>=15.5)&&(hasLearningPermit)));
        System.out.println("Is Kai eligible to drive ? "+result);
    }
}
