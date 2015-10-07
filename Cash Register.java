import java.utl.Scanner;
public class Food{
	String name = " ";
	int price = 0;
	
	public Food(String inputname, int inputprice){
		name = inputname;
		price = inputprice;
	}
}
public class Stock{
	Food bread = new Food("Bread", 7.00);
	Food apple = new Food("Apple", 1.50);
	Food eggs = new Food("Eggs", 12.00);
	Food corn = new Food("Corn", 1.85);
	Food ramen = new Food("Ramen", 2.00);
}

public class CashRegister{
	int balance = 0;
	double tax = 0.875

	public static void main(String args[]){
		Stock foodstock = new Stock();
		Scanner input = new Scanner(System.in);
		while (1 == 1) {
			newfood = input.next();
			if (newfood.equalsto("end")) {
				break;
			}
		}
	}
}
