
public class AutreManièreAnagrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				String ch1 = "aacd";
				String ch2 = "badc";
				int []stat = new int [256];
				
				for (int i=0 ; i<256 ; i++)
					System.out.println(i + ": " +(char)i);
				
			
				System.out.println(estAnagrame(ch1,ch2));
				

			}
			
			public static boolean estAnagrame(String ch1, String ch2){

				if (ch1.length()!=ch2.length())
					return false;
				
				int []stat = new int [256];
				
				for (int i=0; i< ch1.length(); i++){
					char c = ch1.charAt(i);
					stat[c]++;
				}
					
				for (int i=0; i< ch2.length(); i++){
					char c = ch2.charAt(i);
					stat[c]--;
				}
				
				for (int i=0; i<stat.length; i++)
					if (stat[i] != 0)
						return false;
				
				
				return true;
			}
				
		}