package Arrays.oneD;

public class PrintNegativeNumbers {
    public static void main(String[] args) {
        int A[]  ={1,2,3,-5,-7,-9};
        int n = A.length;
        for(int i =0; i<n; i++){
           if(A[i] < 0){
               System.out.print(A[i]);
           }
        }
    }
}
