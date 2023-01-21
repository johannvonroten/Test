import java.util.Scanner;
public class Ch2Ex7ExamensReussis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner (System.in);
				
		double ex1, ex2, ex3, ex4, ex5, moy;
		int reussis=0, rate=0;
		
		System.out.println ("Veuillez indiquer votre première note : ");
		ex1 = scan.nextDouble();
		
		System.out.println ("Veuillez indiquer votre seconde note : ");
		ex2 = scan.nextDouble();
		
		System.out.println ("Veuillez indiquer votre troisième note : ");
		ex3 = scan.nextDouble();
		
		System.out.println ("Veuillez indiquer votre quatrième note : ");
		ex4 = scan.nextDouble();
		
		System.out.println ("Veuillez indiquer votre cinquième note : ");
		ex5 = scan.nextDouble();
		
		moy = (ex1+ ex2+ ex3+ ex4+ ex5)/5;
				

		
		if ((ex1>=4) && (ex2>=4) && (ex3>=4) && (ex4>=4) && (ex5>=4))	
			System.out.println ("Vous avez réussis tous vos examens !");
		else
			System.out.println ("Malheureusement, vous n'avez pas réussis tous vos examens");	
		
		
		
		if (ex1>= 4) {
			reussis = ++ reussis;
			System.out.println ("Bravo, vous avez réussis votre premier examen");

		}else {
			System.out.println ("Malheureusement, vous n'avez pas réussis votre premier examens");
		rate = ++rate;
		
		}if (ex2>= 4) {
			System.out.println ("Bravo, vous avez réussis votre second examen");
		reussis = ++reussis;

		}else {
			System.out.println ("Malheureusement, vous n'avez pas réussis votre second examens");
		rate = ++rate;

		}if (ex3>= 4) {
			System.out.println ("Bravo, vous avez réussis votre troisième examen");
		reussis = ++reussis;

		}else {
			System.out.println ("Malheureusement, vous n'avez pas réussis votre troisième examens");
		rate = ++rate;

		}if (ex4>= 4) {
			System.out.println ("Bravo, vous avez réussis votre quatrième examen");
		reussis = ++reussis;

		}else {
			System.out.println ("Malheureusement, vous n'avez pas réussis votre quatrième examens");
		rate = ++rate;

		}if (ex5>= 4) {
			System.out.println ("Bravo, vous avez réussis votre cinquième examen");
		reussis = ++reussis;

		}else {
			System.out.println ("Malheureusement, vous n'avez pas réussis votre cinquième examens");
		rate = ++rate;
		}

		
	
		if (moy>= 4)
			System.out.println ("Bravo, votre moyenne est supérieur à 4, elle s'élève à : " +moy);
		else
			System.out.println ("Malheureusement, vous allez devoir plus travailler, votre moyenne est en dessous de 4, elle s'élève à : " +moy);
		
		System.out.println ("Vous avez réussis " + reussis + " examens, et vous en avez raté " + rate);

		
		
	}

}
