package Collections;

public class SortAnArray {
    public static void main(String[] args) {
        int[] myArray = {860, 8, 200, 9};
        System.out.println("Before Sorting");
        for (int i = 0; i < myArray.length; i++) {
            int index = i;
            for (int j = i; j < myArray.length - 1; i++) {

                if (myArray[j] < myArray[i]) {
                    i = index;
                }
                int smallerNumber = myArray[index];
                myArray[index] = myArray[i];
                myArray[i] = smallerNumber;


            }
        }
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i] + " ");
        }
        System.out.println();
    }
}
