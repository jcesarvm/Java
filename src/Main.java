import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); 
		
		System.out.println("digite a string: ");
		String input = scanner.nextLine();
		
		int count = 0;
		
		for (int i =0; i < input.length(); i++) {
			char a = input.charAt(i);
			if (a == 'a' || a =='A') {
				count++;
			}
		}
		if (count>0) {
			System.out.println("a letra aparece " +count+ " vez(vezes)" );
			
		}else {
			System.out.println("A letra 'a'nao foi encontrada." );
		}
	}

}
