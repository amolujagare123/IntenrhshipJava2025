package StringDemo;

public class SplitStringDemo {

    public static void main(String[] args) {

        String str = "I am from Scripting Logic";

        String[] stArr = str.split(" ");

        for (int i=0;i< stArr.length ; i++)
        {
            System.out.println(stArr[i]);
        }

    }
}
