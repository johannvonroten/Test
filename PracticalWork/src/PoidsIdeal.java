import java.util.Scanner;
public class PoidsIdeal {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner scan = new Scanner (System.in);

double poids, poidsI, taille, poidsLourd, poidsLeger;
int genre,age;

System.out.println (" Veuillez indiquer votre poids :");
poidsI = scan.nextDouble();

System.out.println (" Veuillez indiquer votre taille en cm :");
taille = scan.nextDouble();

System.out.println (" Veuillez indiquer votre genre : 0 = Homme 1 = Femme");
genre = scan.nextInt();

System.out.println (" Veuillez indiquer votre âge");
age = scan.nextInt();

poidsLourd = (poidsI*15/100)+poidsI;
poidsLeger = poidsI-(poidsI*10/100);


switch (genre) {
case 0 :
	poids = ((taille-100) - ((taille-150)/4)+((age-20)/4));
	if (poids >= poidsLeger)
	System.out.println (" Veuillez faire attention, votre poids est trop bas par rapport à votre taille et votre âge ! Il vous manque " + (poidsI - poids) + " kilos !");
	else if  (poids <= poidsLourd)
	System.out.println (" Veuillez faire attention, votre poids est trop haut par rapport à votre taille et votre âge !  Vous avez  " + (poids - poidsI) + " kilos en trop !");
	else
	System.out.println (" Bravo ! Vous avez le poids parfait par rapport à votre taille et votre âge ! Votre poids idéal est de " + poids + " kilos !");

	break;

case 1 :
	poids = ((taille-100) - ((taille-150)/2.5)+((age-20)/6));	
	if (poids >= poidsLourd)
	System.out.println (" Veuillez faire attention, votre poids est trop bas par rapport à votre taille et votre âge ! " + (poids - poidsI) + " kilos en trop");
	else if  (poids <= poidsLeger)
	System.out.println (" Veuillez faire attention, votre poids est trop haut par rapport à votre taille et votre âge ! "+ (poidsI - poids) + " kilos !");
	else
	System.out.println (" Bravo ! Vous avez le poids parfait par rapport à votre taille et votre âge ! Votre poids idéal est  " + poids + " kilos !");
	break;


}
}
}
