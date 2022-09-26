package Media_Aluno_Com_variaveis;

public class Media_Aluno_Com_variaveis {

	public static void main(String[] args) {
		
		double nota1 =70; double nota2 = 70; double nota3 =90; double nota4 =100;
		double media = (nota1 + nota2 + nota3 + nota4) /4;
		
		System.out.println("A média do aluno é: " + media);
		
		if(media <= 30) {
			System.out.println("REPROVADO DIRETO.");
		}else if(media <=69 && media >30) {
			System.out.println("Aluno em Recuperação.");
		}else {
			System.out.println("PARABÉNS APROVADO");
		}
	}
}
