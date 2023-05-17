package DynamicInputExampleFromUser;

import java.util.*;

public class DynamicInputExample {
	/****************************************************************************/
	 /* checking the input is Integer Or not */
    private static boolean isInteger(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    
	/****************************************************************************/
    /* checking the input is double Or not */
	private static boolean isDouble(String input) {
		
		try{
			Double.parseDouble(input);
			return true;
		}catch(NumberFormatException e) {
			
			return false;
		}
	}
	/****************************************************************************/

    /* checking the input is Boolean Or not */
    private static boolean isBoolean(String input) {
        return input.equalsIgnoreCase("true") || input.equalsIgnoreCase("false");
    }

    
	/****************************************************************************/
	
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your input: ");
        String input = scanner.nextLine();

        if (isInteger(input)) {
            int number = Integer.parseInt(input);
            
            System.out.println("Input is integer :"+number);
            
        }
        
        else if (isDouble(input)) {
        	double number = Double.parseDouble(input);
        	
        	System.out.println("Input is double :"+number);
        	
        }
        else if (isBoolean(input)) {
        	
            boolean boolValue = Boolean.parseBoolean(input);
           System.out.println("input is boolean :"+boolValue);
            
        } 
        else { 
         
           System.out.println("Input is string :"+input);
           
        }

        scanner.close();
    }

    
   
}
