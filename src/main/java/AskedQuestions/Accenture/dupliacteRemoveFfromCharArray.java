package AskedQuestions.Accenture;

public class dupliacteRemoveFfromCharArray {
    public static void main(String[] args) {
        char [] ch ={ 'H','e','l','l','o'};
        String rev ="";
        int n =ch.length;
        for(int i =n-1; i>= 0; i--){
            rev =rev + ch[i];
        }
        System.out.print(rev);

        String result ="";
        for(int i =0;i<n-1;i++){
            if(result.indexOf(ch[i])== -1){
              result =result+ch[i];
            }
        }
        System.out.println();
        System.out.println(result);



    }
}
