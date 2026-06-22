
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalTime;

public class ClockTimer {
    public static Scanner sc = new Scanner(System.in);
    public static void userchoice(int choice){
        if(choice ==1){
            digitalclock();

        }
        else if(choice==2){
            
            System.out.println("Enter the number of seconds to countdown :");
            int seconds = sc.nextInt();
            countdown(seconds);

        }
        else{
            System.out.println("Invalid choice!");
        }
    }
    public static void digitalclock(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        while(true){
            LocalTime currenttime =LocalTime.now();
            System.out.print("\rCurrent time : "+currenttime.format(formatter));
        try{    
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Error : " +e.getMessage());
        }

    }
}
    public static void countdown(int seconds){
        System.out.println("Countdown Timer Started!");
        while(seconds>0){
            System.out.print("\rTime remaining : "+seconds+" seconds");
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                System.out.println("Error :"+e.getMessage());
            }
            seconds--;
        }
        System.out.println("\nTime's up");

    }
    public static void main(String[] args) {
        
        while(true){
            System.out.print("Choose an option (1: Digital Clock, 2: Countdown Timer): ");
            int choice = sc.nextInt();
            userchoice(choice);
        }
        
    }
    
}
