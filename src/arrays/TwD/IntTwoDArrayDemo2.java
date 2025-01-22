package arrays.TwD;

public class IntTwoDArrayDemo2 {

    public static void main(String[] args) {
        int[][] arr = {
                {15,31,19},
                {16,12,10},
                {17,23,13},
                {14,64,17}
        };


        System.out.println("row="+arr.length);
        System.out.println("col="+arr[0].length);

        for(int i=0;i<arr.length;i++)
        {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }


    }

}
