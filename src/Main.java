import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    public static void count(String value) {
        Integer val = 0;
        int len = 0 ;
        Hashtable<String, Integer> myDict = new Hashtable<String, Integer>();
        String[] str = value.split("");
        for (String a : str) {
            if (myDict.containsKey(a)) {
                val = myDict.get(a);
                val = val + 1;
                myDict.put(a,val);
            } else {
                myDict.put(a,1);
                len ++ ;
            }
        }
        myDict.forEach(
                (k, v) -> System.out.println("Key : " + k + "\t, Value : " + v));
    }


    public static void main(String[] args) {
        System.out.println("Enter your Statement : ");
        Scanner input = new Scanner(System.in);
        String number = input.nextLine();
        count(number);
    }
}