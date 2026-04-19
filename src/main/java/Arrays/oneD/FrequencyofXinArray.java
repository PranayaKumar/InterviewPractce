package Arrays.oneD;

public class FrequencyofXinArray {
    public int solve(int[] A, int B) {
        int n= A.length;
        int count =0;
        for(int i=0;i<n;i++){

            if(A[i]==B){

                count++;
            }
        }
        return count;

    }
}
