package games;
import java.util.Random;
import java.util.Scanner;

public class Pokemon {
	String nome;
	String tipo1;
	String tipo2;
	int level;
	int atk;
	int hp;
	
	 void atacar(Pokemon oponente) {
		 Random Random = new Random();
		 int crit = Random.nextInt(6);
		 int i = Random.nextInt(6);
		 int dano = atk/12;
		 
		 if(i == crit) {
			 dano += 10;
			 System.out.println("Critical attack!\n");
		 }
		 
		System.out.println(nome + " attacked! \n"); 
		oponente.hp -= dano;
		if(oponente.hp <= 0) {
			oponente.hp = 0;
			System.out.println(oponente.nome + " fainted! \n");
		} else { System.out.println(oponente.nome + " still has " + oponente.hp + " HP\n"); }
	 }
	 
	
	 @Override
	 public String toString() {
		 return nome;
	 }

	public static void main(String[] args) {
		Scanner Scan = new Scanner(System.in);
		Random Random = new Random();
		int sorteio = Random.nextInt(2);
		
		System.out.println("Welcome to the Pokemon world! First, tell me your name!");
		String YName = Scan.nextLine();
		
		System.out.println("Oh, " + YName + ", that's beautiful! \nNow, what is your rival's name?\n");
		String nomin = Scan.nextLine();
		
		Treinador Rival = new Treinador(nomin, null);
		Treinador You = new Treinador(YName, null);
		
		
		Pokemon p1 = new Pokemon();
		p1.nome = "Bulbasaur";
		p1.tipo1 = "Grama";
		p1.tipo2 = "Veneno";
		p1.level = 5;
		p1.atk = 49;
		p1.hp = 45;
		
		Pokemon p2 = new Pokemon();
		p2.nome = "Charmander";
		p2.tipo1 = "Fogo";
		p2.tipo2 = "N/A";
		p2.level = 5;
		p2.atk = 52;
		p2.hp = 39;
		
		Pokemon p3 = new Pokemon();
		p3.nome = "Squirtle";
		p3.tipo1 = "Água";
		p3.tipo2 = "N/A";
		p3.level = 5;
		p3.atk = 48;
		p3.hp = 44;
		
		
		System.out.println("Choose your starter! \nBulbasaur \nCharmander \nSquirtle \n\n");
		String YStarter = Scan.nextLine();

		if(YStarter.equalsIgnoreCase(p1.nome)) {
			You.starter = p1;
			YStarter = p1.nome;
		} else if (YStarter.equalsIgnoreCase(p2.nome)) {
			You.starter = p2;
			YStarter = p2.nome;
		} else if(YStarter.equalsIgnoreCase(p3.nome)) {
			You.starter = p3;
			YStarter = p3.nome;
		} else {
			System.out.println("\nInvalid choice! Defaulting to Bulbasaur.\n");
			You.starter = p1;
			YStarter = p1.nome;
		}
		
		if(You.starter == p1) {
			Rival.starter = p2;
		} else if (You.starter == p2) {
			Rival.starter = p3;
		} else {Rival.starter = p1; }
		
		
		System.out.println("\nCongratulations! You chose " + YStarter + "!\n");
		Scan.nextLine();
		System.out.println("Oh, looks like your rival, " + Rival.nome + ", chose " + Rival.starter + "!\n\n");
		Scan.nextLine();
		
		Rival.desafiar();
		
		boolean WhoStarts = Random.nextBoolean();
		System.out.println((WhoStarts ? YName : Rival.nome) + " goes first!\n");
		Scan.nextLine();
		
		System.out.println(YName + " sends out " + You.starter.nome + "!\n");
		System.out.println(Rival.nome + " sends out " + Rival.starter.nome + "!\n");
		Scan.nextLine();
		
		while(You.starter.hp > 0 && Rival.starter.hp > 0){
			
			
		if (WhoStarts) {
			System.out.println(You.starter.nome + ", attack!\n");
			You.starter.atacar(Rival.starter);
			Scan.nextLine();
		} else { 
			System.out.println(Rival.starter.nome + ", attack!\n");
			Rival.starter.atacar(You.starter);
			Scan.nextLine();
		} WhoStarts = !WhoStarts;
		
		}
		if(You.starter.hp == 0) {
			System.out.println(Rival.nome + " wins!");
		} else { System.out.println(YName + " wins!"); }
	}

}
