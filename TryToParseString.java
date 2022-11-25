 import java.util.Scanner;  
public class TryToParseString{
public static void main(String[] args) {
    try (Scanner s = new Scanner(System.in)) {
        System.out.print("Enter a number: ");
        String n = s.nextLine();

        try{
            int number = Integer.parseInt(n);
            System.out.println("String converted into int : " + number);
        }catch(NumberFormatException e){
            System.out.println("Error");
        }
    }
    
}
    
} 

   



    
