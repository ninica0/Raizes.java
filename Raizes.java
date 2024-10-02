import java.util.Scanner;
public class Raizes {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		int valor ;
		double raiz, raizCubica;
		System.out.println("Digite o número que desejar: ");
		valor = sc.nextInt();
		
		if(valor<=5) {
			raizCubica= Math.cbrt(valor);
			System.out.println("A raiz cúbica deste número é: ");
		}else if(valor>5) {
			raiz = Math.sqrt(valor);
			System.out.println("A raiz quadrada deste número é: "+raiz);
		}else if(valor <0) {
			System.out.println("Não há soluções.");
		
		}
		
				
	}
}
