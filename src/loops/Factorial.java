package loops;

public class Factorial {

    public static void main(String[] args) {

        int n = 6;
        int mult = 1;

        for(int i=n ; i >=1 ; i--) {
            //System.out.println(i);

            mult = mult * i;
        }

        System.out.println("loops.Factorial="+mult);
    }
}
