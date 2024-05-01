import java.util.*;

public class task1 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int rand = (int)(Math.random()*100+1);
        int i = 5;
        int guess=0;
        while(i-->=0){
            System.out.println("Tries remaining: "+(i+1));
            System.out.println("Enter you guess: ");
            guess = sc.nextInt();
            if(guess>rand){
                System.out.println("Guess is too high");
            }else if(guess<rand){
                System.out.println("Guess is too low");
            }else{
                System.out.println("Correct answer!");
                break;
            }
            System.out.println();
        }
        if(guess!=rand){
            System.out.println("Oops all tries used, Better luck next time!\nCorrect answer: "+rand);
        }
        sc.close();
    }
}
