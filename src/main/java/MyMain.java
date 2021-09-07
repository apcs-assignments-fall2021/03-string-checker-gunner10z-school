import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int total_counter=0;
        for (int i=0;i<str.length();i++){
            if (str.charAt(i)=='a'||str.charAt(i)=='b'||str.charAt(i)=='c'){
                total_counter+=1;
            }
        }
        return total_counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        if (str.indexOf("The")!=-1 || str.indexOf("the")!=-1){
            return true;
        }
        else{
            return false;
        }

    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int len=str.length();
        for(int i=0;i<len;i++){
            if (str.charAt(i)!=str.charAt(len-i-1)){
                return false;
            }
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What string: ");
        String str_input = scan.next();
        System.out.println(countABC(str_input));
        System.out.println(containsThe(str_input));
        System.out.println(isPalindrome(str_input));
        // YOUR CODE HERE
    }
}
