package StringDemo;

public class SplitStringDemo2 {

    public static void main(String[] args) {

        String str = "I am from Scripting Logic";

        String[] stArr = str.split(" ");


        for (int i=0;i< stArr.length ; i++)
        {
            if(stArr[i].length() < 5)
            System.out.println(stArr[i]);
        }

    }
}
