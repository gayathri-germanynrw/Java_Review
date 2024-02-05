public class MaximumAndMinimum {
    public static void main(String[] args) {
        int[] numbers={-10,-20,-30,-40,-50,-5};
        int max=numbers[0];
        int min=numbers[0];
        for(int each: numbers){
            if(each>max){
                max=each;
            }
            if(each<min){
                min=each;
            }
        }
        System.out.println("-----------------");
        System.out.println("min = " + min);
        System.out.println("max = " + max);
    }
}
