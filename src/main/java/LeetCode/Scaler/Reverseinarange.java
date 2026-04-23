package LeetCode.Scaler;

public class Reverseinarange {

    public static  int[] solve (int[] A, int b, int c){
        int i =b;
        int j =c;

        while (i<j){
            int temp = A[i];
            A[i] = A[j];
            A[j] =temp;
            i++;
            j--;
        }
        return A;
    }
    public static void main(String[] args) {
        int [] A = {1,2,3,4,5,6};
        int b = 2;
        int c = 4;
        solve(A,b,c);
       for(int i =0; i<A.length;i++){
           System.out.print(A[i]+" ");
       }
    }
}
