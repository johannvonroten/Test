import java.util.Random;
import java.util.Scanner;

import javax.swing.Spring;

public class JeuOie {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
		Random random = new Random ();

		String joueur1, joueur2;
		int score1=0, score2=0, total1 = 0, total2 = 0, j=0, i=0, k=0, total = 0;
		
		System.out.println ("Veuillez indiquer le nom du joueur 1");		
		joueur1 = scan.next();
		System.out.println ("Veuillez indiquer le nom du joueur 2");		
		joueur2 = scan.next();
		
		while (total1<23 && total2 <23) {
			System.out.println ();
			System.out.println ("_ _ _ _ _ _ _ _ _ _");
			System.out.println ();		
			j++;
			if (j%2 == 1) {

				score1 = random.nextInt(6)+1;
				total1 += score1;
				System.out.println (joueur1 + " tire un dé et fait un score de : " + score1 + ", tu te trouve à la case numéro " + total1);		
				
				switch (total1) {
				case 2 :
					total1 = total1+2;
					System.out.println (joueur1 + " arrive sur une case qui lui permet d'avancer de deux et se trouve à la case numéro " + total1);		
					break;
				
				case 8 :
					total1 = total1-2;
					System.out.println (joueur1 + " arrive sur une case qui le fait reculer de deux et se trouve à la case numéro " + total1);		
							
					break;
				
				case 10 :
					System.out.println (joueur1 + " arrive sur une case qui le fait rejouer !");
					score1 = random.nextInt(6)+1;
					total1 += score1;
					System.out.println (joueur1 + " tire un dé et fait un score de : " + score1 + ", tu te trouve à la case numéro " + total1);
					break;
					
				case 15 :
					System.out.println (joueur1 + " arrive sur une case qui lui fait passer son tour !");
					--j;
					break;
					
				case 19 :
					System.out.println (joueur1 + " arrive sur une case qui lui fait passer son tour !");
					--j;
					break;
					
				case 22 :
					System.out.println (joueur1 + " arrive sur une case qui le fait rejouer !");
					score1 = random.nextInt(6)+1;
					total1 += score1;
					System.out.println (joueur1 + " tire un dé et fait un score de : " + score1 + ", tu te trouve à la case numéro " + total1);				
					break;
				}
			}
			
				else {
				score2 = random.nextInt(6)+1;
				total2 += score2;
				System.out.println (joueur2 + " tire un dé et fait un score de : " + score2 + ", tu te trouve à la case numéro " + total2);		
				
			switch (total2) {
			case 2 :
				total2 = total2+2;
				System.out.println (joueur2 + " arrive sur une case qui lui permet d'avancer de deux et se trouve à la case numéro " + total2);		
				break;
			
			case 8 :
				total2 = total2-2;
				System.out.println (joueur2 + " arrive sur une case qui le fait reculer de deux et se trouve à la case numéro " + total2);		
						
				break;
			
			case 10 :
				System.out.println (joueur2 + " arrive sur une case qui le fait rejouer !");
				score2 = random.nextInt(6)+1;
				total2 += score2;
				System.out.println (joueur2 + " tire un dé et fait un score de : " + score2 + ", tu te trouve à la case numéro " + total2);
				break;
				
			case 15 :
				System.out.println (joueur2 + " arrive sur une case qui lui fait passer son tour !");
				--j;
				break;
				
			case 19 :
				System.out.println (joueur2 + " arrive sur une case qui lui fait passer son tour !");
				--j;
				break;
				
			case 22 :
				System.out.println (joueur2 + " arrive sur une case qui le fait rejouer !");
				score2 = random.nextInt(6)+1;
				total2 += score2;
				System.out.println (joueur2 + " tire un dé et fait un score de : " + score2 + ", tu te trouve à la case numéro " + total2);				
				break;
			}
		}

	}	
		if (total1 >= 23)
			System.out.println (joueur1 + " gagne !");
		else if (total2 >= 23)
			System.out.println (joueur2 + " gagne !");
		
		}
	}