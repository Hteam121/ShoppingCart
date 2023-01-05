import java.io.FileNotFoundException;
import java.util.Arrays;

public class Runner {
    public static void main(String[] args) throws FileNotFoundException {
        WelcomeBack test = new WelcomeBack();
        //4
        System.out.println(test.getMiddle("Hell0"));

        //5
        System.out.println(Arrays.toString(test.sumNumbers(5)));

        //6
        System.out.println(test.sumDigits(234));

        //7
        System.out.println(test.keepSummingDigits(29));

        //8
        System.out.println(test.getIntersection(new int[] {1,2,3,4}, new int[] {9,0,4,3,4,1}));

        //9
        System.out.println(test.mapLengths(new String[] {"a", "b", "hello", "hi", "yo", "I"}));

        //11
        System.out.println(test.sumDigitsRecur(234));

        //12
        System.out.println(test.sumWithoutCarry(861,450));

        //13
        System.out.println(test.buySell1(new int[] {5, 4, 3, 2, 1, 1}));

        //14
        test.zeck("zeck.txt");
    }
}
