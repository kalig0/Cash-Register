public class Question {
	static String name = " ";
	static String age = " ";
	static String rank= " ";
	static void changeName(String newName) {
		name = newName;
	}
	static void changeAge(String newAge) {
		age = newAge;
	}
	static void changeRank(String newRank) {
		rank = newRank;
	}
	static void answer() {
		 int[] five = new int[5];
		 for(int i = 0; i < five.length; i++){
		 	System.out.println("My name is " + name + ". My age is " + age + ". My League of Legends rank is " + rank + ".");
		 }
	}
	public static void main(String args[]){
		changeName("Daniel");
		changeAge("14");
		changeRank("Better than Rory");
		answer();
	}
}
