package exemplos;

public class ExemploCondicionalSimples {

	public static void main(String[] args) {
		int valor1 = -10;
		int valor2 =  12;

		int result = 0;

		if (valor1>=0) {
			System.out.println("Vai somar!");
			result = valor1+valor2;
		}

		if (valor1<0) {
			System.out.println("Vai subtrair!");
			result = valor1+valor2;
			
		} 
		
		System.out.println("Resultado: " + result);

	}

}
