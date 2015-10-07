public class Question {
	String Name = " ";
	String Age = " ";
	String Rank= " ";
	static void changeName(String newName) {
		Name = newName;
	}
	static void changeAge(String newAge) {
		Age = newAge;
	}
	static void changeRank(String newRank) {
		Rank = newRank;
	}
	static void answer() {
		 int[] five = new int[5];
		 for(int i = 0, i < five.length, i++){
		 	System.out.println("My name is " + name + " My age is " + age + " My League of Legends rank is " + rank + ".");
		 }
	}
	public static void main(String args[]){
		changeName("Daniel");
		changeAge("14");
		changeRank("Better than Rory");
		answer();
	}
}
