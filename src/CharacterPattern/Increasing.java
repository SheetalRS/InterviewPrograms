package CharacterPattern;

public class Increasing {

	public static void main(String[] args) {
		String s="CODER";
		for (int i = 0; i < s.length(); i++) {
			
			for (int j = 0; j <=i; j++) {
				System.out.print(s.charAt(j) + " ");
				
			}
		System.out.println();	
			
		}
		
		
		System.out.println("-------------------------------------");
		
		for (int i = s.length()-1; i >=0 ; i--) {
			
			for (int j = s.length()-1; j >=i; j--) {
				System.out.print(s.charAt(j) + " ");
				
			}
		System.out.println();	
			
		}

	}

}
