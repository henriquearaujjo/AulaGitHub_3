import java.util.Scanner;
public class SomaVetor { 
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int dados[] = new int[10]; 
		
		//leitura 
		
		try{
			for (int i = 0; i < dados.length; i++) { 
		
			System.out.print("Digite o valor para o indice " + i + ": " ); 
			dados[i] = sc.nextInt();
			} 
		}	catch(java.util.InputMismatchException e){
			System.out.println("Digite um valor valido! ");
		}try{
		int soma = 0; 
		for (int i = 0; i < 15; i++) 
			soma = soma + dados[i]; 
		System.err.println("A soma dos elementos é : " + soma); 
		sc.close(); 
		}catch(java.lang.ArrayIndexOutOfBoundsException e){
			System.out.println("ERRO!!!!!");
		}
		
		} 
	
	}

