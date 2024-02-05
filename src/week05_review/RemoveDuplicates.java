package week05_review;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str="aaabbbbbcccccccooooooppppppp";
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
//            if(!result.contains(""+ch)){
//            result+=ch;
//            }
            if(result.contains(""+ch)){
                continue;
            }
            result+=ch;



        }
        System.out.println(result);

    }
}
