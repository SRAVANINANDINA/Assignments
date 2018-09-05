import java.util.ArrayList;
import java.util.List;

public class OddAndEvenArray {

    int result;

    //Q. write a program to Put Even & Odd Elements of an Array in 2 Separate Arrays.
    //Example:  int[] arr = {23, 45, 44,  65, 33,  76, 47, 49}
    //Output:
    //Arr1 = { 44, 76}
    //Arr2 = { 23, 45, 44, 65, 33, 47, 49}

    public static void main(String[] args) {

        int[] array = {23, 45, 44,  65, 33,  76, 47, 49};

        List<Integer> evenList = new ArrayList<Integer>();
        List<Integer> oddList = new ArrayList<Integer>();

        for(int i=0;i<array.length;i++){

            if (array[i]%2 == 0){

                evenList.add(array[i]);


            }
            else {

                oddList.add(array[i]);

            }


        }

        System.out.println("even array is " + evenList);
        System.out.println("odd array is " + oddList);




    }



}
