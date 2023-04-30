/*
Case #1: 1 + 1 = 2
Case #2: 2 + 3 = 5
Case #3: 3 + 4 = 7
Case #4: 9 + 8 = 17
Case #5: 5 + 2 = 7
*/
import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        
        int N = scan.nextInt();
        
        for(int i = 1; i <= N; i++){
            int A = scan.nextInt();
            int B = scan.nextInt();
            
            System.out.println("Case #" + i + ": " + A + " + " + B + " = " + (A+B));
    }
          
       scan.close();
  }
}