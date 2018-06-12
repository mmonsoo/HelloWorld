package mmonsoor.com;

import com.sun.prism.paint.Color;

public class HelloWorld {
	/* 
	  sqdsqd
	  sqdqs
	  dsqd
	*/
	
	//Déclaration des constantes, il faut utiliser le mot cle final . Le static c'est comme l'identifcation dans les bases de données, il peut être incrémenté.
	public static final double CM_PER_INCH=50;
	
	
	//################### Les fonctions
	
			static byte nombrePommesDeTerre;
			static byte nombrePatateEpluches;
			static short nombreFrites;
			static String couteau;
			static String friteuse;
			static String  huile;

	//Fonction principale
	public static void main(String[] args) {
		// System.out.print(args[0]);

		// TODO Auto-generated method stub
		// Tout le prog est execute dedans
		// Pour une constante, il faut final et majuscule

		// System.out.println("Bonjour\nDeuxieme ligne\\é");

		int i = 10, j = 10, k = 5; // j vaut 10 mais i et k ne valent rien et c'est pas bon
		String sortie = "Bonjour";
		// Pour la concaténation de chaines de caractère, on rajoute monsieur
		sortie += " monsieur";
		// Autre concaténation
		sortie += " " + i;
		// Le %s , ça désigne les entiers
		// System.out.println(String.format("%s %s %s",i,j,k));
		// System.out.println(sortie);
		Color c = Color.BLACK;
		double pi = Math.PI;

		// on déclare un tableau
		int[] tabint;
		// on déclare un tableau de taille 50 , avec une dimension
		// tabint=new int[50];
		// Ici, on indique les éléments dedans
		tabint = new int[] { 1, 2, 3, 4, 5, 6 };
		// ça commence par 0 la première position
		int resul = tabint[4] + 0;
		// System.out.println(resul);

		int[] monTableau2 = new int[20];
		monTableau2[0] = 5;
		// System.out.println(monTableau2[0]);

		// Tableau à deux dimensions à 2 colonnes et 10 lignes
		int[][] monTableau2dimensions = new int[2][10];

		// Affichage taille première dimension, le tableau est un objet
		System.out.println(monTableau2dimensions.length);
		// Affichage taille deuxième dimension
		System.out.println(monTableau2dimensions[0].length);
		// Modification des valeurs du tableau

		// Le voir comme une courbe, du bas vers le haut
		monTableau2dimensions[0][0] = 5;
		monTableau2dimensions[1][1] = 10;
		monTableau2dimensions[1][4] = 15;

		// un tableau de char
		char[] mot1 = new char[] { 'H', 'e', 'l', 'l', 'o' };
		System.out.println(mot1.length);
		System.out.println(mot1[4]);
		// Un String
		String mot2 = "Hello";
		// La taille d'un string
		System.out.println(mot2.length());
		// Accéder au dernier élement du String
		System.out.println(mot2.charAt(mot2.length() - 1));

		// Type primitif
		int a = 1, b = 1;
		// System.err.println(a==b);
		// Classe englobante
		Integer toto, titi;
		// C'est la meme chose que int, sauf que là on crée un objet entier avec des
		// propriétés
		toto = new Integer(1);
		titi = new Integer(1);
		toto = 5;
		// Toto et titi sont des objets uniques, ils ne peuvent pas être comparés.
		// System.err.println(toto==titi);
		System.out.println(toto.intValue());

		System.out.println("admin".equals("lol"));
		String var1 = "lol";
		String var2 = "lol";
		// System.err.println(var1==var2);

		/*
		 * 
		 * //Affichage du tableau tabint for(int m = 0; i < tabint.length; m++){
		 * 
		 * System.out.println(tabint[1]); System.out.println("À l'emplacement " + m
		 * +" du tableau nous avons = " + tabint[m]);
		 * 
		 * }
		 * 
		 **/

		/*
		 * char[]mot=new char[] {'B','O','N','J','O','U','R'}; for (int
		 * index=0;index<mot.length;index++) { System.out.println(mot[index]); }
		 **/
		byte[][] tableau2d = new byte[2][5];
		tableau2d[0][0] = 5;
		tableau2d[1][1] = 10;
		tableau2d[1][4] = 15;

		/*
		 * // Affichage résultat d'un tableau en deux dimensions
		 *  for (int
		 * xabs=0;xabs<tableau2d.length;xabs++) { for (int
		 * yabs=0;yabs<tableau2d[xabs].length;yabs++) {
		 * System.out.print(tableau2d[xabs][yabs]); } }
		 * 
		 **/

		// Affichage d'un tableau en mode ultrarapide
		// Là il récupère
		for (byte[] x : tableau2d) {
			// là il récupère le résultat de la cellule
			for (byte y : x) {
				System.out.println(y);
			}

		}

		byte[] tableau1D = new byte[5];
		int indexwhile = 0;
		while (indexwhile < tableau1D.length) {
			System.out.println(tableau1D[indexwhile]);
			indexwhile++;
		}

		short age = 40;
		do {
			System.out.println("J'ai pas 30 ans");
			age++;
		} while (age < 30);

		System.out.println("J'ai 40 ans");

		/*
		 * String prenom="Misharl"; if (prenom.equals("Victor")) {
		 * System.out.println("Je m'appelle Victor"); } else if
		 * (prenom.toUpperCase().equals("MISHARL")) {
		 * System.out.println("Je m'appelle Misharl yeahh"); } else {
		 * System.out.println("Je m'appelle"+prenom); }
		 * 
		 */

		
		/*
		String[] listeInvite = new String[] { "Barbara", "Macron", "Misharl", "Jean", "Sarkozy" };

		// Affichage rapide d'une liste de string
		for (String x : listeInvite) {
			// On veut tous les prénoms qui ne sont pas Misharl
			if (!x.equals("Misharl")) {
				System.out.println(x);
			}
			else {
				System.out.println("Misharl a été trouvé, on arrête");
				//break;
				continue; //Il quitte le bloque et revient en arrière
			
			}
			
		}
		**/
		
		
		/*
		String [][] tab= {{"a","b","c"},{"1","2","3"},{"A","B","C"}};
		for (int za=0;za< tab.length;za++) {
			for (int zy=0;zy<tab[za].length;zy++) {
				if (za==zy) {
					//revient  à son for
					continue;
					//break : revient au premier for
				}
				System.out.println(tab[za][zy]);
			}
		}
		
		**/
	
//#######Les switch	demandent moins d'instruction, et on teste que des cas uniques et ON TESTE que des entiers!!
		
		byte nbarguments = (byte) args.length;
		System.out.println(nbarguments);
		switch(nbarguments){
			case -1:
				System.out.println("pas possible d'avoir un nb argument négatif");
				break;
				
			case 0:
				System.out.println("pas d'argument rentré");
				break;
			//Dans tous les autres cas, on passe dedans, comme le else du if	
			default:
				System.out.println("Il se peut qu'il y a des arguments");
				break;			
		}
			

	}
	

}

