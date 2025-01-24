package Methods;

public class MethodReturningValues {



    int getMyInt()
    {
        System.out.println("getMyInt");
        int a =89;

        //return  10;
        return  a;
    }

    String getMyString()
    {
        String a = "amol ujagare";

        //return  10;
        return  a;
    }

    int[] getMyArray()
    {
        int[] a = {12,34,56,78,89,97};

        //return  10;
        return  a;
    }

    String[][] getMyStringArray()
        {
        String[][] a = {
                {"amol", "path", "priti"},
                {"Nupur", "Siddhi", "Sheya"},
                {"priti", "Aishwarya", "Kalyani"}
         };
                return a;

    }



    public static void main(String[] args) {

        int a;

        a = 10;

       int x= a;

        System.out.println(a);

        MethodReturningValues ob = new MethodReturningValues();
        int value1 = ob.getMyInt();
        System.out.println(value1);

        System.out.println(ob.getMyInt());
        System.out.println(ob.getMyString());

        int[] arr =ob.getMyArray();

        for (int ar : arr)
            System.out.println(ar);

        System.out.println("Below are string values");

        String[][] StringArr = ob.getMyStringArray();


        for(int i=0;i<StringArr.length;i++)
        {
            for (int j = 0; j < StringArr[0].length; j++) {
                System.out.print(StringArr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
