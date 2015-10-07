import java.util.Scanner;
import java.util.*;


class CashRegister{
	static double balance = 0;
	public static double tax = 0.0875;
	
	public static List<String> menu = new ArrayList<String>();
	//public List<String> menu = Array.asList("Bread","Apple","Eggs","Corn","Ramen");

	public static List<Double> values = new ArrayList<Double>();
	public static Stock foodstock = new Stock();
	//List<String> list = new ArrayList<String>();
	//public List<double> values = Array.asList(7.00,1.50,12.00,1.85,2.00);
	public CashRegister () {
		menu.add("Bread");
		menu.add("Apple");
		menu.add("Eggs");
		menu.add("Corn");
		menu.add("Ramen");
		menu.add("Grapes");
		menu.add("Your mom");
		menu.add("Beats");
		menu.add("Basil");
		menu.add("Cinnamon");
		menu.add("Broccoli");
			

		values.add(7.00);
		values.add(1.50);
		values.add(12.00);
		values.add(1.85);
		values.add(2.00);
		values.add(13.01);
		values.add(3.00);
		values.add(1.50);
		values.add(1.00);
		values.add(2.00);
		values.add(1.50);
	}
	

	public static void main(String args[]){

		Scanner input = new Scanner(System.in);
		List<Food> receipt = new ArrayList<Food>();
		List<Food> yes = new ArrayList<Food>();
		System.out.println("Type in the food you want to buy.");
		System.out.println("The number tells you the balance.");
		while (1 == 1) {
			
			String newfood = input.nextLine();
	
			if (newfood.equals("end")) {
				break;
			}
			for (int i = 0; i < menu.size(); i++){
				if (newfood.equals(menu.get(i))) {
					balance = balance + foodstock.foods.get(i).price;
					receipt.add(foodstock.foods.get(i));
				} 
			}
			//System.out.println(balance);
			if (newfood.equals("no")) {
				if (receipt.size() == 0) {
					continue;
				}
				yes.add(receipt.get(receipt.size()-1));
				balance = balance - yes.get(yes.size()-1).price;
				receipt.remove(receipt.size()-1);
				System.out.println("Removed " + yes.get(yes.size()-1).name);
			}
			if (newfood.equals("yes")){
				if (yes.size() == 0) {
					continue;
				}
				balance = balance + yes.get(yes.size()-1).price;
				receipt.add(yes.get(yes.size()-1));
				System.out.println("Added " + yes.get(yes.size()-1).name);
				yes.remove(yes.size()-1);
			}
			if (newfood.equals("add")){
				System.out.println("Input name of new item.");
				String newname = input.nextLine();
				System.out.println("Input price of new item.");
				double newprice = input.nextDouble();
				add(newname, newprice);
			}
			if (!newfood.equals("print")) {
				System.out.println("Do you want to print the receipt? Input print to print.");
			}
			if (newfood.equals("print")) {
				for (Food f : receipt){
					System.out.println(f.name + " " + f.price);

				}
				System.out.printf("Subtotal %.2f\n",balance);
				System.out.printf("Tax %.2f\n",(balance * tax));
				System.out.printf("Total %.2f\n",(balance * (1 + tax)));
				break;
			}





			System.out.printf("%.2f\n",balance);
		} 
	}

	public static void add(String newfoodname, double newfoodprice){
		Food nfood = new Food(newfoodname, newfoodprice, Stock.cr.tax);
		Stock.cr.menu.add(newfoodname);
		Stock.cr.values.add(newfoodprice);
		Stock.cr.foodstock.foods.add(nfood);

	}
}

class Food{
	String name = " ";
	double price = 0.0;

	public Food(String inputname, double inputprice, double tax){
		name = inputname;
		price = inputprice * (1.0 + tax);
		price = Math.round(price*100.0)/100.0;
	}
}
class Stock{
	/*
	Food bread = new Food("Bread", 7.00);
	Food apple = new Food("Apple", 1.50);
	Food eggs = new Food("Eggs", 12.00);
	Food corn = new Food("Corn", 1.85);
	Food ramen = new Food("Ramen", 2.00);
	*/

	List<Food> foods = new ArrayList<Food>();
	public static CashRegister cr = new CashRegister();
	public Stock() {
		for (int g = 0; g < cr.menu.size(); g++) {
			Food item = new Food(cr.menu.get(g),cr.values.get(g), cr.tax);
			foods.add(item);
		}
	}	
}

