import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Random random = new Random();
		
		Scanner scan = new Scanner(System.in);
		
		//asks how long you want your password to be
		System.out.println("Please enter how long you would like your password to be: ");
		int y = scan.nextInt();
		
		//characters array
		char[] alphabet = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z',
				'1','2','3','4','5','6','7','8','9','0','A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		
		//loop the creates the password
		for(int i = 0; i < y; i++) {
		int x = random.nextInt(63);
		System.out.print(alphabet[x]);
		}
	}

}