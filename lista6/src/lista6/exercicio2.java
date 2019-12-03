package lista6;

import java.util.*;

public class exercicio2 {

	public static void main(String[] args) {


		Scanner entrada = new Scanner(System.in);

		
		int a[], i, Primos[];
		int c = 0;
		a = new int[10];
		Primos = new int[10];
		
		
		for(i=0;i<a.length;i++) {
			System.out.println("Digite "+ (i+1)+"° número: ");			
			a[i] = entrada.nextInt();
			Primos[i]=0;
			
			for (c=1;c<=a[i];c++) {
				
				if (a[i]%c==0) {
					Primos[i]++;
				}
				
			}
			
			
		}

		
		int qtdprimos=0;
		
		for (i=0;i<a.length;i++) {
			if (Primos[i] ==2) {
				System.out.println(a[i]+" é primo");
				qtdprimos++;
			} else {
				System.out.println(a[i]+" não é primo");
	}
}
	}
	
}