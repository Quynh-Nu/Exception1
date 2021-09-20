import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String  w = sc.nextLine();
        String h = sc.nextLine();
        boolean isValid = FunctionBMI.checkInput(w, h);
        if(isValid){
           double BMI =  FunctionBMI.calculateBMI(Integer.parseInt(w), Integer.parseInt(h));
           System.out.println("MBI = " + BMI);
        }
    }
}
