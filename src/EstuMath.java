
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
							"Raiz quadrada de 81 � igual a " + Math.sqrt(81)+"\n");
	}
	
	static void exemploLogaritmo(){
		System.out.println("Exemplo de logaritmo na base 10 (Math.log10):\nLogartimo de 100 na base 10 � igual a: " +Math.log10(100)+"\n");
	}
	
	static void exemploRound(){
		System.out.println("Exemplo de Math.round:\nO n�mero inteiro mais pr�ximo de 9.689 � " + Math.round(9.689));
		System.out.println("O n�mero inteiro mais pr�ximo de 10.489 � " + Math.round(10.489)+"\n");
	}
	
	static void exemploMaxMin(){
		System.out.println("Exemplo de Math.max e Math.min\nO maior n�mero entre 104780 e 104985 � " + Math.max(104780,104985));
		System.out.println("O menor n�mero entre 104780 e 104985 � " + Math.min(104780,104985)+"\n");
	}
	
	static void exemploRandom(){
		System.out.println("Exemplo de Math.random:\nUm n�mero de 0 a 10: "+ Math.round(Math.random()*10)+"\n"+
				"Um n�mero de 0 a 10: " + Math.round(Math.random()*10)+"\n"+
						 "Um n�mero de 0 a 10: "+ Math.round(Math.random()*10)+"\n");
		
	}
	
	static void exemploPotencia(){
		System.out.println("Exemplo de pontencia��o:\nO n�mero 5 elevado a 2 � igual a " +Math.pow(5, 2)+"\nO n�mero "
				+ "3 elevado ao cubo � igual a " + Math.pow(3, 3)+"\n");
		
	}
}
