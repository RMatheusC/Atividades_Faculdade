package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		Random rand = new Random();
		String nome;
		
		rand.nextInt(30);
		
		System.out.println("Seja bem vindo ao jogo!!");
		System.out.println("Insira seu nome: ");
		nome = in.nextLine();
		System.out.println("Seja muito bem vindo "+nome);
		
		System.out.println("Voce deseja avançar para qual direção? ");
		System.out.println("--------------");
		System.out.println("w, s, a, d");
		System.out.println("--------------");
		String comando = in.nextLine();
		
		switch(comando) {
		case "w":
			System.out.println("Você esta indo para a frente!!");
			System.out.println("Um inimigo surgiu, o que fará? ");
			System.out.println("--------------");
			System.out.println("a = Analisar");
			System.out.println("c = Correr");
			System.out.println("l = Lutar");
			System.out.println("--------------");
			comando = in.nextLine();
			switch(comando) {
			case "a":
				System.out.println("Voce decidiu analizar o inimigo.");
				System.out.println("ANALIZANDO.....");
				System.out.println("Descobriu que o inimigo é um dragão, o que fará a seguir?");
				System.out.println("--------------");
				System.out.println("c = Correr");
				System.out.println("l = Lutar");
				System.out.println("--------------");
				comando = in.nextLine();
				switch(comando) {
				case "c":
					System.out.println("Você conseguiu correr por pouco!!!");
					System.out.println("FIM.");
					break;
				case "l": 
					System.out.println("Você decidiu lutar desarmado contra um dragão, voce tomou "+rand.nextInt(30)+"de dano.");
					System.out.println("Você morreu!");
					System.out.println("FIM.");
					break;
				}
				break;
			case "c":
				System.out.println("Você conseguiu correr por pouco!!!");
				System.out.println("FIM.");
				break;
			case "l": 
				System.out.println("Você decidiu lutar desarmado contra um inimigo desconhecido, você morreu!! ");
				System.out.println("FIM.");
				break;
			}
			break;
			
		case "s":
			System.out.println("Você esta voltando para a vila!!");
			System.out.println("Um inimigo surgiu, o que fará? ");
			System.out.println("--------------");
			System.out.println("a = Analisar");
			System.out.println("c = Correr");
			System.out.println("l = Lutar");
			System.out.println("--------------");
			comando = in.nextLine();
			switch(comando) {
			case "a":
				System.out.println("Você decidiu analizar o inimigo.");
				System.out.println("ANALIZANDO.....");
				System.out.println("Descobriu que o inimigo é um bandido, o que fará a seguir?");
				System.out.println("--------------");
				System.out.println("c = Correr");
				System.out.println("l = Lutar");
				System.out.println("--------------");
				comando = in.nextLine();
				switch(comando) {
				case "c":
					System.out.println("Você conseguiu correr tranquilo, o bandido estava fora de forma!");
					System.out.println("FIM.");
					break;
				case "l": 
					System.out.println("Você decidiu lutar desarmado contra um bandido, você desviou do ataque dele e deu "+rand.nextInt(30)+"de dano.");
					System.out.println("Você venceu e ganhou "+ rand.nextInt(30) +"de cobre.");
					System.out.println("FIM.");
					break;
				}
				break;
			case "c":
				System.out.println("Você conseguiu correr tranquilo, o inimigo estava fora de forma!");
				System.out.println("Mesmo que você não foi muito longe, o pessoal da sua vila comemorou sua chegada!!!!");
				System.out.println("FIM.");
				break;
			case "l": 
				System.out.println("Você decidiu lutar desarmado contra um inimigo desconhecido, você desviou do ataque dele e deu "+rand.nextInt(30)+"de dano.");
				System.out.println("Você venceu e ganhou "+ rand.nextInt(30) +"de cobre.");
				System.out.println("FIM.");
				break;
			}
			break;
			
		case "a":
			System.out.println("Voce decidiu ir para a esquerda!!");
			System.out.println("Um NPC surgiu, o que fara? ");
			System.out.println("--------------");
			System.out.println("a = Analisar");
			System.out.println("c = Conversar");
			System.out.println("s = Ataque furtivo");//sneek atack
			System.out.println("--------------");
			comando = in.nextLine();
			switch(comando) {
			case "a":
				System.out.println("Voce decidiu analizar o inimigo");
				System.out.println("ANALIZANDO.....");
				System.out.println("Descobriu que o inimigo e um velho com roupas chiques mas com o ar de sabedoria ao seu redor, provavelmente um nobre. o que fara a seguir?");
				System.out.println("--------------");
				System.out.println("c = Conversar");
				System.out.println("s = Atacar furtivamente");
				System.out.println("--------------");
				comando = in.nextLine();
				switch(comando) {
				case "c":
					System.out.println("Voce conversa com o velho, descobriu que era o Rei desse reino(ainda bem que nao atacou ele).");
					System.out.println("Voces conversam por horas, quando ele parte, te da um trocado. Voce ganhou: ");
					System.out.println(rand.nextInt(30)+" de ouro e "+rand.nextInt(30)+" de conhecimento");
					break;
				case "s": 
					System.out.println("Voce percebe movimentacoes nas arvores, conseguindo assim atacar furtivamente e roubar completamente o velho, sem os guardas notarem!");
					System.out.println("Voce ganhou "+rand.nextInt(30)+" de platina "+rand.nextInt(30)+" de malandragem");
					break;
				}
				break;
			case "c":
				System.out.println("Voce conversa amigavelmente com o velho, descobre que ele é o Rei da bagaca toda e ele te da uns trocados por voce parecer um pobretão");
				System.out.println("Voce ganhou "+rand.nextInt(30)+" de prata, alem de perder "+rand.nextInt(30)+" de autoestima");
				break;
			case "s": 
				System.out.println("Voce decidiu atacar furtivamente o velho, ninjas aparecem das sombras e te dão "+rand.nextInt(30)+" de dano.");
				System.out.println("Voce morreu!!");
				break;
			}
			break;
			
		case "d":
			System.out.println("Voce decidiu ir para a direita!!");
			System.out.println("Voce encontrou uma espada presa numa pedra.");
			System.out.println("--------------");
			System.out.println("a = Analisar");
			System.out.println("p = puxar a espada");
			System.out.println("d = deixar quieto");
			System.out.println("--------------");
			comando = in.nextLine();
			switch(comando) {
			case "a":
				System.out.println("Voce decidiu analizar a espada e aquela pedra");
				System.out.println("ANALIZANDO.....");
				System.out.println("Percebeu que a pedra esta levemente rachada, mas parece que a espada esta bem firme, o que fara a seguir?");
				System.out.println("--------------");
				System.out.println("p = Puxar a espada");
				System.out.println("t = Tentar quebrar a pedra");
				System.out.println("d = Deixar quieto");
				System.out.println("--------------");
				comando = in.nextLine();
				switch(comando) {
				case "p":
					System.out.println("Voce tenta puxar a espada.");
					System.out.println("PUXANDO.");
					System.out.println("PUXANDO..");
					System.out.println("PUXANDO...");
					System.out.println("PUXANDO....");
					System.out.println("PUXANDO.....");
					System.out.println("Nao conseguiu puxar, parece que nao és digno o suficiente.");
					System.out.println("Ao fazer tanta forca, sua espinha desloca e voce fica sem movimentacao nas pernas.");
					System.out.println("Como voce esta em um local isolado, ninguem há de aparecer.");
					System.out.println("Voce morre de fome, frio e sem ninguem.");
					System.out.println("Mas nem tudo é uma noticia ruim, após seu corpo decompor, uma grande árvore surgiu no lugar. Ela que após eras, se torna uma árvore sagrada e acaba por ser cultuada por locais.");
					System.out.println("FIM.");
					break;
				case "t":
					System.out.println("Voce tenta quebra a pedra na base da pohada.");
					System.out.println("Depois de muitos socos na pedra e de muito sangue derramado, suas maos estao dormentes e praticamente na carne viva");
					System.out.println("Mas no fim, acabou tendo um resultado positivo, a pedra quebrou e a espada esta liberada.");
					System.out.println("Voce ganhou a lendaria espada do REI DESTRUIDO.");
					System.out.println("Assim que pega a espada, suas maos se curam e assim voce decide seguir em frente, liderando a humanidade a uma nova era.");
					System.out.println("Com sua ajuda, a humanidade se torna a unica raca no mundo, tornando voce seu maior pilar ate a sua morte.");
					System.out.println("FIM.");
					break;
				case "d": 
					System.out.println("Voce deixa quieto a espada, mas nao sabe ao certo o porque, talves por sentir que aquela espada nao era pra voce ou por simples preguica");
					System.out.println("No fim, voce comecou a fazer investimentos ao chegar no reino e virou um grande trader, virando assim um bilionario.");
					System.out.println("Mas foi morto por sua esposa, parece que o rumor dela ter um caso com seu socio era verdade.");
					System.out.println("FIM.");
					break;
				}
				break;
			case "p":
				System.out.println("Voce tenta puxar a espada, ao segurar a espada, voce sente um poder divido emanado dela.");
				System.out.println("PUXANDO.");
				System.out.println("PUXANDO..");
				System.out.println("PUXANDO...");
				System.out.println("PUXANDO....");
				System.out.println("PUXANDO.....");
				System.out.println("PUXANDO......");
				System.out.println("PUXANDO.......");
				System.out.println("PUXANDO........");
				System.out.println("PUXANDO.........");
				System.out.println("PUXANDO..........");
				System.out.println("Depois de tanto tempo segurando a espada, voce comeca a se sentir mal.");
				System.out.println("O seu corpo comeca a rachar e uma luz ofuscante comeca a sair, era o excesso de poder divino que te correu por dentro.");
				System.out.println("Nenhum ser humano consegue aguentar tanto poder divido e voce nao é diferente, o seu corpo explode dando um fim a toda a area ao redor.");
				System.out.println("FIM.");
				
				break;
			case "d": 
				System.out.println("Voce decidiu sair e deixar a espada quieta, talvez ela sirva para uma outra pessoa.");
				System.out.println("Voce chega na capital do reino, voce comecou como um simples campones, sem conhecer ninguem.");
				System.out.println("Apos 10 anos, voce conseguiu se dar bem, teve 2 filhos e uma esposa que te ama e esta trabalhando como ferreiro.");
				System.out.println("A motivacao para se transformar em um ferreiro, foi a espada da floresta. Nesses ultimos 10 anos, sempre que tinha tempo, voce fazia uma espada especial.");
				System.out.println("Uma espada perfeita e voce consegui, após milhares de batidas e suor, voce conseguiu criar uma espada digna a ser conhecida como a melhor espada existente.");
				System.out.println("FIM.");
				break;
			}
			break;
		}
	}
}