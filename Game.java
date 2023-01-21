import java.util.Scanner;
import java.util.Random;
public class Game{
    public static void main(String [] args){
        int guess = 0;
        final Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        int randint = rd.nextInt()%100+1;
        int count = 0;
        while(guess != randint){
            System.out.print("Enter a guess between 1 and 100: ");
            guess = sc.nextInt();
            if(guess < randint){
                System.out.println("Higher");
            }
            else if(guess > randint){
                System.out.println("Lower");
            }
            else{
                System.out.println("You guess it!!!");
            }
            count++;
        }
        System.out.println("You took " + count + " counts");
    }
}
