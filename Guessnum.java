import java.util.*;


public class Guessnum{

    public static int giverandom(){
        Random random = new Random();
        return random.nextInt(100)+1;

    }

    public static String givehint(int guess,int number){

        if(guess>(number+10)||guess<(number-10)){
            return "Hot";
            }
        else if(number==guess){
            return "Right";
            }
        else{
            return "Cold";
            }

        }

    public static void runguess(){
        int number = giverandom();
        String hint;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Enter your Number 1 to 100");
            int guess = sc.nextInt();
            hint = givehint(guess, number);

            if(hint.equals("Right")){
            System.out.println("Your guess is correct");
            break;
            }
            else{
            System.out.println(hint);
            }
        }
    sc.close();
    }

public static void main(String[] args){
    runguess();
    }

}