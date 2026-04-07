package Basic_Questions.String;

public class VovelsCount {
    public static void main(String[] args) {

        String s1 =" Hello Indian";

        String s = s1.toLowerCase();

        int v =0;
        int c =0;
        int n =s.length();
        for(int i =0; i <n;i++){

            char ch = s.charAt(i);
            if(ch =='a' || ch =='e' ||ch =='i' ||ch =='o' ||ch =='u'){
                v++;
            }
            else{
                c++;
            }
         }
        System.out.println("Vovels count :"+v+"  consonent count "+c);
    }
}
