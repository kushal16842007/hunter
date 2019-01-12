    import java.util.Scanner;
import java.util.Stack;
public class PalindromeStack {
    static void palindromeStack(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); ++i) { 
        if (s.charAt(i) != ' ') 
            stack.push(s.charAt(i)); 
        }
        int i;
        for (i = 0; i < s.length(); ++i) { 
        if (s.charAt(i) != stack.pop()){ 
            
               System.out.print("NO");
               break;
        }
        }
        if(i == s.length())
            System.out.print("YES");
        
    }
public static void main(String[] arg)
{
    //int n,k;
    
     Scanner scan = new Scanner(System.in);
     String s = scan.nextLine();
     palindromeStack(s);
}
}
