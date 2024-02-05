package week06_review;

public class WhileFromLab {
    public static void main(String[] args) {
        int x=20;
        while(x>0){
            do{
                x-=2;
            }while(x>5);
        }
        x--;
        System.out.println("x = " + x);
    }
}
