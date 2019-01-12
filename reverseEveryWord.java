import java.util.Scanner;
public class Demo {
    static String reverseString(String s)
    {
        char[] array1 = s.toCharArray();
        String re = "";
        for(int i=0;i<s.length();i++)
        {
            re = array1[i] + re;
        }
        return re;
    }
    static String reverseEveryWord(String s)
    {
        s = s+ ' ';
    String temp ="";
    String all ="";
    for(int i=0;i<s.length();i++)
    {
        if(s.charAt(i)==' ')
        {
            all = all + " " + reverseString(temp);
            temp = "";
        }
        else
        {
            temp += s.charAt(i) ;
        }
            
    }
    return all;
    }
public static void main(String[] arg)
{
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    System.out.print(reverseEveryWord(s));
    
    
}
    
}
