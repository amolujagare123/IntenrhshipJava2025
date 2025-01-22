package arrays.TwD;

public class IntTwoDArrayDemo1 {

    public static void main(String[] args) {
        int[][] arr = new int[4][3];

        arr[0][0] = 23;
        arr[0][1] = 13;
        arr[0][2] = 53;

        arr[1][0] = 45;
        arr[1][1] = 67;
        arr[1][2] = 89;

        arr[2][0] = 99;
        arr[2][1] = 78;
        arr[2][2] = 34;

        arr[3][0] = 24;
        arr[3][1] = 90;
        arr[3][2] = 22;

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
