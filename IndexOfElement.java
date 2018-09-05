public class IndexOfElement {


    //Q. write a program to find out the first occurence of any given number in the array.
    //Ex:
    //int [] arr = {34, 55, 3 ,5 , 10, 3, 55};
    // findElement(3)  //should return the index : 2



    public static int indexValue(int[] array,int inputValue){

        for (int i = 0;i < array.length ;i++){

            if (array[i] == inputValue){

                //System.out.println("input value is " + inputValue + "and  its index is " + i );
                return i;


            }

        }
        return -1;

    }


    public static void main(String[] args) {

        int [] array = {34, 55, 3 ,5 , 10, 3, 55};
        int inputValue = 55;



        System.out.println("input value is " + inputValue + " and  its index is " + indexValue(array,inputValue) );

    }

}
