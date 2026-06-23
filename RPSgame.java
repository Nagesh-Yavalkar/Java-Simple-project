import java.util.Random;
import java.util.Scanner;

public class RPSgame {
    public static int youscore = 0;
    public static int compscore = 0;
    public static String toLower(String input){
        return input.toLowerCase();
    }
    public static String checkuser(String input){
        String userchoice = toLower(input);
        if(userchoice.equals("rock")||userchoice.equals("scissor")||userchoice.equals("paper")){
            return userchoice;
        }
        return "Invalid Choice please Enter 'rock' or 'scissor' or 'paper'" ;
    }
    public static String randomchoice(int oup){
        if(oup==1){
            return "rock";
        }else if(oup==2){
            return "scissor";
        }
        else{
            return "paper";
        }
    }
    public static String getcomputerchoice(){
        Random random = new Random();
        int oup = random.nextInt(3);
        return randomchoice(oup);
    }
    public static String determine(String userchoice,String compchoice){
        if(userchoice.equals(compchoice)){
            return "Round is Tie";
        }
        else if((userchoice.equals("rock")&&compchoice.equals("scissor"))||
        (userchoice.equals("paper")&&compchoice.equals("rock"))||
        (userchoice.equals("scissor")&&compchoice.equals("paper"))
        
        
        ){
            youscore++;
            return "You win this Round.";
        }
        else{
            compscore++;
            return "computer win this Round.";
        }

    }
    public static String roundcheck(int youscore,int compscore){
        if(youscore>compscore){
            return "You win this Game";
        }
        else if(compscore>youscore){
            return "Computer win this Game.";
        }
        else{
            return "Game is Tie.";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's start the game : ");
        System.out.println();
        System.out.println("How many round you want to play : ");
        int round = scanner.nextInt();
        int n =0;
        while(n<round){

            
            while(true){
                System.out.println();
                System.out.println("Let's start with the "+(n+1)+ " round : ");
                System.out.println();
                
                System.out.println("Enter your Choice 'rock' or 'scissor' or 'paper' :");
                String input = scanner.next();
                String userchoice = checkuser(input);
                if(userchoice.equals("Invalid Choice please Enter 'rock' or 'scissors' or 'paper'")){
                    System.out.println(userchoice);
                }
                else{
                    String computerchoice = getcomputerchoice();
                    System.out.println();
                    System.out.println("The user choice is :  "+userchoice);
                    System.out.println("The Computer Choice is :  "+computerchoice);
                    String result = determine(userchoice,computerchoice);
                    System.out.println();
                    System.out.println("Your Score is : "+youscore);
                    System.out.println("Computer Score is : "+compscore);
                    System.out.println();
                    System.out.println(result);
                    
                }
                n++;
                break;
                
            }
        }
        String r = roundcheck(youscore,compscore);
        System.out.println();
        System.out.println(r);
        scanner.close();
    }
}
