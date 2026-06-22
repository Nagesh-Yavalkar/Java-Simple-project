import java.util.Scanner;

public class Calculator{
    public static String display(){
        return "Welcome to Calculator\n\n "+
                "Choose one operation:\n"+
                "1. Add\n"+
                "2. Subtract\n"+
                "3. Multiplication\n"+
                "4. Division\n"+
                "5. Exit\n";

    }
    public static void userinput(Scanner sc,int[]numbers){
        System.out.println("Enter your first Number");
        numbers[0] = sc.nextInt();
        System.out.println("Enter your second Number");
        numbers[1] = sc.nextInt();

    }
    public static int addition(int a,int b){
        return a+b;
    }
    public static int sub(int a,int b){
        return a-b;
    }
    public static int multi(int a,int b){
        return a*b;
    }
    public static int division(int a,int b){
        return a/b;
    }
    public static String calculatefun(int userchoice,Scanner sc){
            int numbers[] = new int[2];
            String result="";
            switch (userchoice) {
                case 1:  
                    userinput(sc, numbers);
                    int output = addition(numbers[0],numbers[1]);
                    result = "The sum is "+output;
                    break;
                case 2:
                    userinput(sc,numbers);
                    int o = sub(numbers[0],numbers[1]);
                    result = "The Subtraction is "+o;
                    break;
                case 3:
                    userinput(sc, numbers);
                    int mul = multi(numbers[0],numbers[1]);
                    result = "The Multiplication is "+mul;
                    break;
                case 4:
                    userinput(sc, numbers);
                    if(numbers[1]==0){
                        System.out.println("Divisor equal to zero");
                        break;
                    }
                    int div = division(numbers[0],numbers[1]);
                    result = "The Division is "+div;
                    break;
                case 5:
                    System.out.println("Exit the program");
                    break;
                default:
                    System.out.println("Invalid Choie");
                    break;
            }
            return result;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println(display());

            System.out.println("Select the operation : ");
            int userchoice = sc.nextInt();

            String result = calculatefun(userchoice,sc);
            System.out.println(result);


            if(result.equals("Exit the program")){
                break;
            }
            
        }
        sc.close();

    }
}