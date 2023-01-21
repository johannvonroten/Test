public class Exo1_2022Paterne {

	 public static void main(String[] args) {
	        char [][]picture = {{'x','x','x','x','x','x','x','x','x','x'},
	                {'x','.','.','.','.','.','.','.','.','x'},
	                {'x','.','o','o','o','o','o','o','.','x'},
	                {'x','.','o','.','.','.','.','o','.','x'},
	                {'x','.','o','.','x','x','.','o','.','x'},
	                {'x','.','o','.','x','x','.','o','.','x'},
	                {'x','.','o','.','.','.','.','o','.','x'},
	                {'x','.','o','o','o','o','o','o','.','x'},
	                {'x','.','.','.','.','.','.','.','.','x'},
	                {'x','x','x','x','x','x','x','x','x','x'}};
	        char [][]pattern = {{'.','.','.','o','.','x'},
	                {'x','x','.','o','.','x'},
	                {'x','x','.','o','.','x'},
	                {'.','.','.','o','.','x'}};
	        char [][]patternFaux = {{'.','.','.','o','.','x'},
	                {'.','x','.','o','.','x'},
	                {'x','.','.','o','.','.'},
	                {'.','.','.','o','.','x'}};
	        boolean egal = equals(picture,picture);
	        System.out.println(egal);
	        boolean OK = eqals(picture,pattern, 3, 4);
	        System.out.println(OK);
	        detect(picture, pattern, 3, 4);
	    }
	    public static boolean equals(char[][]tab1, char[][]tab2){
	        if (tab1.length != tab2.length ||tab1[0].length != tab2[0].length )
	            return false;
	        for (int i = 0; i<tab1.length; i++){
	            for (int j = 0; j<tab1[0].length; j++){
	                if (tab1[i][j] != tab2[i][j])
	                    return false;
	            }
	        }
	        return true;
	    }
	    public static boolean eqals(char[][]picture, char[][]pattern, int col, int li){
	        if (picture.length < pattern.length ||picture[0].length < pattern[0].length)
	            return false;
	        if (col> picture.length- pattern.length+1||li> picture[0].length- pattern[0].length+1)
	            return false;
	        boolean check = false;
	        int indiceli = 0;
	        int indicecol = 0;
	        if (picture[col][li] == pattern[0][0])
	            check = true;
	        else
	            return false;
	        for (indicecol = 0; indicecol<pattern.length; indicecol++){
	            for (indiceli = 0; indiceli<pattern[0].length; indiceli++){
	                if (picture[col+indicecol][li+indiceli] != pattern[indicecol][indiceli])
	                    check = false;
	            }
	        }
	        if (check == true)
	            return true;
	        return false;
	    }
	    public static void detect(char[][]picture, char[][]pattern, int col, int li){
	        boolean test = eqals(picture, pattern, col, li);
	        if (test == true)
	            System.out.println(col + "\t" + li);
	        else
	            System.out.println("Wrong Pattern");
	    }
	}