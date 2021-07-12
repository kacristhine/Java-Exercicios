import java.util.Scanner;
	public class Cinema {
		public static void main(String[] args) {  
		
			Scanner sc = new Scanner(System.in); 
			int escolhaFilme;
			int assentosAlpha = 140;
			int assentosBeta = 120;
			int fileiraAlphaA, fileiraAlphaB. fileiraAlphaC, fileiraAlphaD, fileiraAlphaE: 25;
			int fileiraAlphaF: 27;
			int quantIngressos: 0;
			String nome, fileira;
			
			
			System.out.println("Bem vindo ao cinema\nInforme seu nome");
			nome = sc.next();
			System.out.println("Digite a opção para o filme deseja ingresso: \n1-As Branquelas \n2-A chegada");
			int escolhaFilme = sc.nextInt();
			while (escolhaFilme == 1){
				System.out.println("Ótima escolha de filme!"+nome+"\nDigite quantos ingressos deseja:);
				int quantIngressos = sc.nextInt();
				System.out.println("\n Temos a Sala Alpha para sessão desse filme.Escolha uma das fileiras disponiveis: A,B,C,D,E,F");
				fileira = sc.next().toUpperCase;
					if(fileira == "A" && quantIngressos < 24){
						int disponiveis;
						disponiveis = fileiraAlphaA - quantIngressos;
						System.out.println("Ótimo, separamos" + quantIngressos+" para você. Ainda tem na fileira A,"+disponiveis+"assentos disponiveis")
					}else if(fileira == "B"){
						disponiveis = fileiraAlphaB - quantIngressos;
						System.out.println("Ótimo, separamos" + quantIngressos+" para você. Ainda tem na fileira B,"+disponiveis+"assentos disponiveis")
						
				System.out.println(nome+ "seus ingressos foram comprados com sucesso. Aproveite a pipoca grátis e tenha um bom filme")
				System.out.println("Filera A- 25 assentos disponiveis \n Fileira B- 25 assentos disponiveis \n Fileira C- 25 assentos disponiveis \n Fileira D- 25 assentos disponiveis \n Fileira E- 25 assentos disponiveis \nFileira F- 27 assentos disponiveis ")
				
			else;
			
			}
			
		}
		
	}