public class ArraySumAverage {



    public static int sum(int[] sum){
        int result = 0;

        for (int i=0;i<sum.length;i++){



            result = result + sum[i];

        }

        return result;


    }

    public static int average(int[] sum){

        int a = sum(sum);
        
        return a;

    }


    public static void main(String[] args) {

        int[] array = {1, 4, 6, 9};

        int result = sum(array);

        System.out.println(result);

        int avgresult = average(array);

        System.out.println(avgresult/array.length);


    }

}
