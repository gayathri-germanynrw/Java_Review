package week03_review;

public class BMICalculator2 {
    public static void main(String[] args)
    {
        double height = 2;
        double weight = 100;
        double bmi;

        boolean valid=height>0 && weight>0;
        if(valid){
            bmi = weight / (height * height);
            String category;
            category=(bmi < 18.5) ?"underweight": (bmi >= 18.5 &&bmi < 25)?"NormalWeight":
                    (bmi < 30 &&bmi >= 25)?"OverWeight":"Obesity";
            /*
            if (bmi < 18.5) {
                category = "underweight";

            } else if (bmi < 25) {   //(bmi >= 18.5)
                category = "NormalWeight";

            } else if (bmi < 30) { //bmi >= 25
                category = "OverWeight";

            } else {
                category = "Obesity";

            } */
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
        else{
            System.err.println(" Height and weight should not be negative or Zero:");
        }

    }
}
