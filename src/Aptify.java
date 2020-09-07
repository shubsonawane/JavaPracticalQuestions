// Java program to 

interface Calculate {

	public void calc(int x);
}

public class Aptify implements Calculate {

	int x = 6;

	public void calc(int item) {

		x = item * item;
	}

	public static void main(String[] args) {

		Aptify obj = new Aptify();
		// int x = 6 ;

		// o/p for this will be 4
		obj.x = 0;
		obj.calc(2);

		// o/p for this will be 0
		//obj.calc(2);
		//obj.x = 0;
		

		System.out.println(obj.x);
	}

}
