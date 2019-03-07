import java.util.Scanner;

public class Bobcar {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int cost=0;
		int discount=0;
		double pckg=0;
		
		System.out.println("Avalaible cars: 1 for Economy, 2 for compact, 3 for Standard");
		int car=input.nextInt();
		
		System.out.println("Rental Days?");
		int day= input.nextInt();
		if(car == 1){
			cost = 25*day;
		} else if (car == 2){
			cost = 55*day;
		} else if (car ==3){
			cost = 100*day;
		}
		
		System.out.println("Are you a club member? 1 for Yes, 2 for No");
		int member = input.nextInt();
		if(car==1){
			discount=day/5 *25;
		}else if (car==2){
			discount=day/5*55;
		}else if(car==3){
			discount=day/5*100;
		}
		int total= cost - discount + (int)pckg;
		if (member ==1){
			System.out.println("Platinum Executive Package? 1 for Yes, 2 for No");
			double pack=input.nextDouble();
				if (pack ==1){
					pckg= cost *.2;
			}if ((member ==1) && (pack ==1)){
			System.out.println("Base Cost: $" + cost);
			System.out.println("Club Member Discount: -$"+ discount);
			System.out.println("Platinum Executive Package: +$" + (int)pckg);
			System.out.println("Total Estimate Cost: $" + (cost-discount+(int)pckg));
		}else if ((member ==1)&& (pack ==2)){
			System.out.println("Base Cost: $" + cost);
			System.out.println("Club Member Discount: -$"+ discount);
			System.out.println("Total Estimate Cost: $" + total);
		}
		
		}else if (member ==2){
			System.out.println("Base Cost: $" + cost);
			System.out.println("Total Estimate Cost: $" + cost);
		}
}
}