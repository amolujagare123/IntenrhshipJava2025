package arrays;

public class IntArrayDemo2 {

    public static void main(String[] args) {

        int[] a = {12,45,16,78,90,12,34,56,78,90};



       /* System.out.println(a[3]);
        System.out.println(a.length);*/

        System.out.println("======= For loop =======");
        for (int i=0;i<a.length;i++)
        {
            System.out.println(a[i]);
        }

        System.out.println("======= For each loop =======");

        for(int x : a  )
            System.out.println(x);

    }
}
