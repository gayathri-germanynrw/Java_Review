package week06_review;

public class MedianNumber {
    public static void main(String[] args) {
        int a = 20, b = 25, c = 30;
        boolean aIsMedian = (b > a && a > c) || (c > a && a > b);
        boolean bIsMedian = (a > b && b > c) || (c > b && b > a);
        boolean cIsMedian = (a > c && c > b) || (b > c && c > a);

        System.out.println("aIsMedian = " + aIsMedian);
        System.out.println("bIsMedian = " + bIsMedian);
        System.out.println("cIsMedian = " + cIsMedian);
        if(aIsMedian){
            System.out.println("a is median number\t " + aIsMedian);
        }else if(bIsMedian){
            System.out.println("b is median number\t" + bIsMedian);
        }else{
            System.out.println("c is median number\t" + cIsMedian);
        }

    }
}
