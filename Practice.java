import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
     String[] name={"Raj" , "Rajeev" , "Priya" , "Priya Yadav", "Pannu", "Radhika Ranjan Yadav"};
        System.out.println (longest(name));
    }
    public static String longest(String[] name){
        int max=0;

        String maximum=null;

        for (String s : name) {

            int count = 0;

            for (int j = 0; j < s.length (); j++) {
                count++;
            }

            max = Math.max ( count, max );

        }

        for (String s : name) {

            if (max == s.length ()) {

                maximum = s;

            }
        }
        System.out.println (max);

        return maximum;
    }
}