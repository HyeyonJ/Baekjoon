import java.util.*;

 public class Main{
     
     public static void main(String[] args){
         
         Scanner scan = new Scanner(System.in);
         int X = scan.nextInt(); // 구매한 총 금액
         int N = scan.nextInt(); // 구매한 갯수
         int total = 0;
        
         for(int i = 1; i <= N; i++){
             int a = scan.nextInt(); // 구매한 가격
             int b = scan.nextInt(); // 구매한 갯수 
             total = total + a * b;
         }
         if(total == X){
             System.out.println("Yes");
         } else {
             System.out.println("No");
         }
     }
 }