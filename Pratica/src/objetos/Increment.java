package objetos;

public class Increment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int c=5;
		
		System.out.printf("c before postincrement: %d%n",c);
		System.out.printf(" postincrementing c: %d%n", c++);
		System.out.printf("c after posticrement: %d%n", c);
		
		System.out.println();
	
		c=5;
		System.out.printf("c before postincrement: %d%n",c);
		System.out.printf(" postincrementing c: %d%n", ++c);
		System.out.printf("c after posticrement: %d%n", c);
	}

}
