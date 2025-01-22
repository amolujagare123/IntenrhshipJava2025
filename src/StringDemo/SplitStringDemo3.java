package StringDemo;

public class SplitStringDemo3 {

    public static void main(String[] args) {

        String str = "Hey baby you are so lovely";

        String[] stArr = str.split(" ");

        // print only the word that ends with y
        // without using inbuilt function

        for (int i=0;i< stArr.length ; i++)
        {
          //  if( /*condition*/)
            System.out.println(stArr[i]);
        }

    }
}
