import java.util.HashSet;

public class JavaDemo {


    public static void main(String[] args) {

        String str = "i am from Scripting Logic";

        int count = 0;

        HashSet<Character> hs = new HashSet<>();
        hs.add('c');


        for (int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' ')
            hs.add(str.charAt(i));
        }

        for(char ch:hs) {
            for (int i = 0; i < str.length(); i++) {

                if (str.charAt(i) == ch)
                    count++;

            }
            System.out.println("Ocuarance of "+ch+"="+count);
            count = 0;
        }
       // System.out.println("oucarance of i = "+ count);
    }
}
