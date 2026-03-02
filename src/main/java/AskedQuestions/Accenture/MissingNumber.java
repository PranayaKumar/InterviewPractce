package AskedQuestions.Accenture;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {
    public static void main(String[] args) {
        int n[] = {1, 2, 3, 5, 6};

        Set<Integer> set = new HashSet<>();
        for(int num:n){
            set.add(num);
        }
        for(int i =1;i<= set.size();i++){
            if(!set.contains(i)){
                System.out.println(i);
            }
        }
    }
}
