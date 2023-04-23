import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
        Scanner scan = new Scanner(System.in);
        int A = scan.nextInt();    // 시
        int B = scan.nextInt();    // 분
        int C = scan.nextInt();    // 요리에 필요한 시간
        
        int min = 60 * A + B; // 시 -> 분
        min += C;
        
        int hour = (min / 60)% 24;
        int minute = min%60;
        
        System.out.println(hour + " " + minute);

        
        scan.close();
    }
}