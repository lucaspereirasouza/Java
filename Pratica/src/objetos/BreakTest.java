package objetos;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int count;
		for(count=1;count<=10;count++) {
			if(count==5) {
				System.out.printf("%d ", count);
				break;
			}
			System.out.printf("%nBroke out of loop at count = %d%n", count);
			
		}
	}

} // fim da clase BreakTest
