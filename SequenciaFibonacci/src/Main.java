import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("digite o termo da sequencia para ser calculado: ");
		int n = scanner.nextInt();
		
		System.out.println("digite o numero para conferir se pertence a sequência de Fibonacci: ");
		int x = scanner.nextInt();
		
		int resultado = fib(n);
		System.out.println("o " + n + " termo da sequencia é: "+resultado);
		for (int i = 1; i<= n; i++) {
			System.out.println(fib(i)+"");
		}
		
		 if (Fibonacci(x)) {
	            System.out.println("\nO número " + x + " pertence à sequência de Fibonacci.");
	        } else {
	            System.out.println("\nO número " + x + " não pertence à sequência de Fibonacci.");
	        }

		scanner.close();
		}
	
	public static int fib(int n) {
		if (n == 1)
			return (0);
		if (n == 2)
			return (1);
		
		int i, a = 0, b = 0, c =1 ;
		for (i =3; i<=n; i++ ) {
			a = b+c;
			b = c;
			c = a;
		}
		return (a);
	}
	
	public static boolean Fibonacci(int num) {
        int a = 0, b = 1, c = 1;
        
        // Continua  até encontrar o número ou exceder seu valor
        while (a <= num) {
            if (a == num) {
                return true;
            }
            a = b;
            b = c;
            c = a + b;
        }
        return false;
    }
}
	

