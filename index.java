import java.util.Scanner;
public class Main {
	public static void main(String[]args) {
		currency();
	}
	public static void currency() {
		
		int choice = 1;
		
		System.out.println("\f");
		Scanner input = new Scanner(System.in);
		
		System.out.println("My Currency Converter");
		System.out.println(" ");
		
		System.out.println("How to use this?");
		System.out.println("*Type the number exactly as it is given before the currency. For example, in the \"INR\" to other currencies converter, there is a '1' before USD. Type that 1 to convert values from INR to USD.");
		System.out.println("*To give the value to the system, enter the value and press \"enter\" key on your keyboard. The System will understand that you are giving your calue and does its calculations and gives out the answer to you.");
		System.out.println(" ");
		
		System.out.println("Abbreviations used:");
		System.out.println("INR - Indian Rupee");
		System.out.println("USD - US Dollars");
		System.out.println("GBP - British Pounds");
		System.out.println("EUR - Euro among EU registered countries");
		
		System.out.println("What would you like to convert?");
		System.out.println("INR to:");
		System.out.println("1. USD");
		System.out.println("2. GBP");
		System.out.println("3. EUR");

		System.out.println(" ");
		System.out.println("USD to:");
		System.out.println("4. INR");
		System.out.println("5. GBP");
		System.out.println("6. EUR");

		System.out.println(" ");
		System.out.println("GBP to:");
		System.out.println("7. INR");
		System.out.println("8. USD");
		System.out.println("9. EUR");

		
		System.out.println(" ");
		System.out.println("EUR to:");
		System.out.println("10. INR");
		System.out.println("11. USD");
		System.out.println("12. EUR");

		

		
		System.out.println("(Enter value and press \"enter\" key on your keyboard)");
		
		choice = input.nextInt();
		
		if(choice == 1)	{
			float USDINR = (float) 73.27;
			System.out.println("Enter INR to be converted to USD");
			System.out.println("USD: " + input.nextFloat() * USDINR);
		}
		
		else if(choice == 2) {
			float GBPINR = (float) 103.05;
			System.out.println("Enter INR to be converted to GBP");
			System.out.println("GBP: " + input.nextFloat() * GBPINR);
		}
		
		else if(choice == 3) {
			float EURINR = (float) 88.73;
			System.out.println("Enter INR to be converted to EUR");
			System.out.println("EUR: " + input.nextFloat() * EURINR);
		}
		
		else if(choice == 4) {
			float INRUSD = (float) 0.01;
			System.out.println("Enter USD to be converted to INR");
			System.out.println("INR: " + input.nextFloat() * INRUSD);
		}
		
		else if(choice ==5) {
			float GBPUSD = (float) 0.71;
			System.out.println("Enter USD to be converted to GBP");
			System.out.println("GBP: " + input.nextFloat() * GBPUSD);
		}
		
		else if(choice == 6) {
			float EURUSD = (float) 0.82;
			System.out.println("Enter USD to be converted to EUR");
			System.out.println("EUR: " + input.nextFloat() * EURUSD);
		}
		
		else if(choice == 7) {
			float INRGBP = (float) 0.009;
			System.out.println("Enter GBP to be converted to INR");
			System.out.println("INR: " + input.nextFloat() * INRGBP);
		}
		
		else if(choice == 8) {
			float USDGBP = (float) 1.40;
			System.out.println("Enter GBP to be converted to USD");
			System.out.println("USD: " + input.nextFloat() * USDGBP);
		}
		
		else if(choice == 9) {
			float EURGBP = (float) 1.16;
			System.out.println("Enter GBP to be converted to EUR");
			System.out.println("EUR: " + input.nextFloat() * EURGBP);
		}
		
		else if(choice == 10) {
			float INREUR = (float) 0.01;
			System.out.println("Enter EUR to be converted to INR");
			System.out.println("EUR: " + input.nextFloat() * INREUR);
		}
		
		else if(choice == 11) {
			float USDEUR = (float) 1.21;
			System.out.println("Enter USD to be converted to EUR");
			System.out.println("EUR: " + input.nextFloat() * USDEUR);
		}
		
		else if(choice == 12) {
			float GBPEUR = (float) 0.86;
			System.out.println("Enter GBP to be converted to EUR");
			System.out.println("EUR: " + input.nextFloat() * GBPEUR);
		}
		
		else if(choice > 12 || choice < 1){
			System.out.println("Please only choose the options given.");			
		}
	}
}
