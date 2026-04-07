package Company_Wzise;

public class VovelAndConsonentCount {
    public static void main(String[] args) {
        String input ="Interview";
        input = input.toLowerCase();

        int vovels =0;
        int consonent =0;

        for(char c:input.toCharArray()){
            if("aeioiu".indexOf(c) != -1){
                vovels++;
            }
            else {
                consonent++;
            }
        }
        System.out.println("Vovels "+vovels+"   Consonent :"+consonent );
    }
}
