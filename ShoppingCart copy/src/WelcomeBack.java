import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.*;
import java.io.*;

public class WelcomeBack
{
    String getMiddle(String str)
    {
        String ans = "";
        if(str.length()%2 == 0)
        {
            int num = str.length()/2;
            ans=str.substring(num-1, num+1);
        } else {
            int num = str.length()/2;
            ans=str.substring(num, num+1);
        }
        return ans;
    }

    int[] sumNumbers(int n)
    {
        int sum = 0;
        int[] ans = new int[n+1];
        for(int i = 0; i <= 5; i++)
        {
            sum+= i;
            ans[i] = sum;
        }
        return ans;
    }

    int sumDigits(int num)
    {
        String splitter = "" + num;
        int sum = 0;
        for(int i = 0; i < splitter.length(); i++)
        {
            sum += num %10;
            num = num/10;
        }

        return sum;
    }

    int keepSummingDigits(int num)
    {
        String splitter = "" + num;
        ArrayList<Integer> n = new ArrayList<>();
        int sum = num;
        while(splitter.length() != 1)
        {
            while(sum > 0)
            {
                n.add(sum%10);
                sum = sum/10;
            }
            sum = 0;
            for(int c = 0; c < n.size(); c++)
            {
                sum+=n.get(c);
            }
            splitter="" + sum;
            for(int i = n.size()-1; i >= 0; i--)
            {
                n.remove(i);
            }
        }
        return sum;
    }

    String getIntersection(int[] a, int[] b)
    {
        String ans = "";
        for(int i = 0; i < a.length; i++)
        {
            for(int c = 0; c < b.length; c++)
            {
                if(a[i] == b[c])
                {
                    ans+=b[c];
                    break;
                }
            }
        }
        return ans;
    }

    Map<Integer, Integer> mapLengths(String[] words)
    {
        Map<Integer,Integer> ans = new HashMap<>();
        for(int i = 0; i < words.length; i++)
        {
            int count = 0;
            for(int c = 0; c < words.length; c++)
            {
                if(words[i].length()==words[c].length())
                {
                    count++;
                }
            }
            ans.put(words[i].length(),count);
        }
        return ans;
    }

    int sumDigitsRecur(int n)
    {
        int sum = n % 10;
        if(n == 0)
        {
            return 0;
        }
        else
        {
            return sum + sumDigitsRecur(n / 10);
        }

    }

    int sumWithoutCarry(int a, int b)
    {
        int num = a+b;
        String s = "" + num;
        String n = "" + a;
        if(s.length()>n.length())
        {
            int sub = s.length() - n.length();
            s = s.substring(sub);
        }
        int ans = Integer.parseInt(s);
        return ans;
    }

    int buySell1(int[] stock)
    {
        int min = stock[0];
        int max = stock[0];
        int maxDay = 0;
        int minDay = 0;

        for (int i = 1; i <= stock.length - 1; i++)
        {
            if (max < stock[i]) {
                max = stock[i];
                maxDay = i;
            }

            if (min > stock[i]) {
                min = stock[i];
                minDay = i;
            }
        }
        int ans = 0;
        if(maxDay > minDay)
        {
            ans = max-min;
        }
        return ans;
    }

    void zeck(String fileName) throws FileNotFoundException {
        File file = new File(fileName);
        Scanner input = new Scanner(file);
        ArrayList<Integer> list = new ArrayList<>();
        while(input.hasNextLine())
        {

            list.add(Integer.parseInt(input.nextLine()));
        }
        for(int i = 0; i < list.size(); i++)
        {
            System.out.println(getZeck(list.get(i)));
        }
    }
    static int fib(int n)
    {
        if (n <= 1)
            return n;
        return fib(n-1) + fib(n-2);
    }
    public static String getZeck(int n)
    {
        int s = n;
        ArrayList<Integer> list = new ArrayList<>();
        int num = 0;
        for(int i = 0; num < n; i++)
        {
            num = fib(i);
            list.add(num);
        }

        ArrayList<Integer> listSum = new ArrayList<>();
        for(int i = list.size() - 1; i > 0 && n != 0; i--)
        {
            if(list.get(i) <= n)
            {
                n=n-list.get(i);
                listSum.add(list.get(i));
            }
        }

        String ans = "" + s + " = ";
        for(int i = 0; i < listSum.size(); i++)
        {
            if(listSum.size()-1==i)
            {
                ans+= listSum.get(i);
            } else {
                ans+=listSum.get(i) + " + ";
            }
        }
        return ans;
    }
}
