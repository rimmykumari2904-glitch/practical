package class6;
import java.util.Scanner;
class parent{
    void input(){
        
    }
}
public class ifElse{
    public static void main(String[] args) {
        System.out.println("enter 3 numbers:");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int Sum = a + b + c;
        if(Sum<45){
            Sum = a-b-c;
        }
        else{
            System.out.println(true);
        }
    }
}