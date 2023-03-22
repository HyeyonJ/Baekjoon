// a*b 를 입력받아
// a*b 를 출력한다

import java.util.Scanner;

public class Main{
    
  public static void main(String[] args){

    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int b= scan.nextInt();

    System.out.println(a*b);
    
    scan.close();
    }  
}


