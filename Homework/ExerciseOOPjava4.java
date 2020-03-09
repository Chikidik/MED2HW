import java.util.Random;
import java.util.Scanner;
public class ExerciseOOPjava4{
    public static void main(String[] args) {
    Random random = new Random();

    int [] ran = new int[100];
    Scanner userInput = new Scanner(System.in);

    // Filling the array with randomn numbers
    for (int i = 0; i<ran.length;i++){
        ran[i] = random.nextInt(100);
        }
    

    // counter if you want to do certain number of cycles
    int counter = 100;

    while(counter!=0){

        // Get User Input
        int test = userInput.nextInt();
        int input = test-1;
        if (input > 100||input <0){
            System.out.println("Out of bounds");
        }else{

        
        // Printing the randomn number
        System.out.println("The random number is " + ran[input]);
        counter--;
        }
    }
    userInput.close();
    }
}