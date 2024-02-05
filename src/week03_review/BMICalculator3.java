package week03_review;

public class BMICalculator3 {
    public static void main(String[] args) {
        double height = -2;
        double weight = 100;
        double bmi;
        if(height<=0 || weight<=0){
            System.err.println(" Hight and Weight should not be zero or negative");
            System.exit(1);
        }
        bmi = weight / (height * height);
        String category;
        category = (bmi < 18.5) ? "underweight" : (bmi >= 18.5 && bmi < 25) ? "NormalWeight" :
                (bmi < 30 && bmi >= 25) ? "OverWeight" : "Obesity";

        System.out.println("print the category -->" + category);

        switch (category) {
            case "OverWeight", "Obesity":
                System.out.println("go to gym because you are in ");
                break;

            case "NormalWeight":
                System.out.println("you are a good boy  because you are in " + category);
                break;
        }
  }
}
