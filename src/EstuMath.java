
public class EstuMath {
	//Exemplos da classe Math
	//Por Lucas Moreira
	public static void main(String[] args){
		
		System.out.println("Este programa mostra diversos exemplos usando a classe Math\n");
		
		exemploAbsoluto();
		exemploSenoCosTg();
		exemploRaizQuadrada();
		exemploLogaritmo();
		exemploRound();
		exemploMaxMin();
		exemploRandom();
		exemploPotencia();
	}
	
	static void exemploAbsoluto(){
			int a = -100;
			
			System.out.println("Exemplo de Math.abs() -> " + a + "  ->  " + Math.abs(a)+ "\n");
			
		}
	
	static void exemploSenoCosTg(){
		int i,j,k;
		i=30; j=45; k=60;
		System.out.println("Exemplo de Math.sin, Math.cos, Math.tan\n    Sen - Cos - Tan");
		System.out.printf("30: %.3f %.3f %.3f",
				Math.sin(Math.toRadians(i)),
				Math.cos(Math.toRadians(i)),
				Math.tan(Math.toRadians(i)));
		System.out.println();
		System.out.printf("45: %.3f %.3f %.3f",
				Math.sin(Math.toRadians(j)),
				Math.cos(Math.toRadians(j)),
				Math.tan(Math.toRadians(j)));
				System.out.println();
		System.out.printf("60: %.3f %.3f %.3f",
				Math.sin(Math.toRadians(k)),
				Math.cos(Math.toRadians(k)),
				Math.tan(Math.toRadians(k)));
		System.out.println("\n");

	}

	static void exemploRaizQuadrada(){
		System.out.println("Exemplo de raiz quadrada:\n" +
							"Raiz quadrada de 81 é igual a " + Math.sqrt(81)+"\n");
	}
	
	static void exemploLogaritmo(){
		System.out.println("Exemplo de logaritmo na base 10 (Math.log10):\nLogartimo de 100 na base 10 é igual a: " +Math.log10(100)+"\n");
	}
	
	static void exemploRound(){
		System.out.println("Exemplo de Math.round:\nO número inteiro mais próximo de 9.689 é " + Math.round(9.689));
		System.out.println("O número inteiro mais próximo de 10.489 é " + Math.round(10.489)+"\n");
	}
	
	static void exemploMaxMin(){
		System.out.println("Exemplo de Math.max e Math.min\nO maior número entre 104780 e 104985 é " + Math.max(104780,104985));
		System.out.println("O menor número entre 104780 e 104985 é " + Math.min(104780,104985)+"\n");
	}
	
	static void exemploRandom(){
		System.out.println("Exemplo de Math.random:\nUm número de 0 a 10: "+ Math.round(Math.random()*10)+"\n"+
				"Um número de 0 a 10: " + Math.round(Math.random()*10)+"\n"+
						 "Um número de 0 a 10: "+ Math.round(Math.random()*10)+"\n");
		
	}
	
	static void exemploPotencia(){
		System.out.println("Exemplo de pontenciação:\nO número 5 elevado a 2 é igual a " +Math.pow(5, 2)+"\nO número "
				+ "3 elevado ao cubo é igual a " + Math.pow(3, 3)+"\n");
		
	}
}
