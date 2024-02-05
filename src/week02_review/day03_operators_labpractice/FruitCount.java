package week02_review.day03_operators_labpractice;

public class FruitCount {
    public static void main(String[] args) {
        int appleCount=10;
        int orangeCount=20;
        int strawberryCount=30;
        boolean result=((appleCount<orangeCount)||(orangeCount>=strawberryCount));
        System.out.println("result =  "+result);

    }
}
