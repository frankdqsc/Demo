import java.util.Random;
import java.util.Scanner;

public class InputOutputRandom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();
        int num = r.nextInt(100)+1;
        while(true){
            int guessNum = sc.nextInt();
            if (guessNum > num){
                System.out.println("大了");
            }else if(guessNum < num){
                System.out.println("小了");
            }else{
                System.out.println("命中");
                break;
            }
        }
    }
}
