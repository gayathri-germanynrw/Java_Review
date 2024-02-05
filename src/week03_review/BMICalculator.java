package week03_review;

public class BMICalculator {
    public static void main(String[] args) {
        double height = 1.8;
        double weight = 100;
        double bmi;
        bmi = weight / (height * height);
        String category;
        if (bmi < 18.5) {
            category = "underweight";

        } else if (bmi < 25) {   //(bmi >= 18.5)
            category = "NormalWeight";

        } else if (bmi < 30) { //bmi >= 25
            category = "OverWeight";

        } else {
            category = "Obesity";

        }
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
