import java.util.Scanner;

//Assignment: 1. Implement Ternary Operators if possible in above scenario
// 			  2. Whenever a wrong promo code is applied, tell the user whats the right promo code 
//			  3. implement a use case i.e. Book a Cab by taking OLA/Uber as a case study
		
public class UberCaseStudy {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double rate = 50.0;
		char ch = '\u20b9';
		System.out.println("Rate per kilo meter is: "+ch+rate);
		System.out.println("Enter distance you want to travel: ");
		double distance = sc.nextDouble();
		double amount = rate*distance;
		System.out.println("Your amount would be: "+ch+amount);
		int promocode = 1001;
		double discount = 0.4*amount;
		double bill = 0;
		//using conditionals
		if(distance >= 2.5){
			System.out.println("You are eligible for discount");
			System.out.println("Enter a promocode to get discount: ");
			int promobyuser = sc.nextInt();
			if(promocode == promobyuser){
				System.out.println("Your disount would be: "+ch+discount);
			}
			else{
				System.out.println("Invalid promocode!");
				System.out.println("You can try putting 1001 as promo code");
			}
			//Using Ternary operator
			bill = (promocode == promobyuser)?(amount-discount):amount;
		}
		else{
			bill = amount;
		}
		System.out.println("You have to pay only: "+ch+bill);
		sc.close();
	}
}
