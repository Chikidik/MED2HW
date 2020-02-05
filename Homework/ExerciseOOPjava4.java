import java.util.Random;
import java.util.Scanner;
public class ExerciseOOPjava4{
    public static void main(String[] args) {
    Scanner userInput = new Scanner(System.in);
    Random random = new Random();
    int [] RanNum = new int[100];
    int test = userInput.nextInt();
    
    if (test > 99||test <0){
        System.out.println("Out of bounds");
    }

    for (int i = 0; i<RanNum.length;i++){
        RanNum[i] = random.nextInt(50);
        //System.out.println(RanNum[i]);
        }
        System.out.println("The entry number is " + RanNum[test]);
        userInput.close();
    }
}