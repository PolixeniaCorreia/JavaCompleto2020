package curso;

public class FuncoesStrings {

	public static void main(String[] args) {
		
		String original = "poli XENIA CORR eia      ";
		System.out.println("Original: -" +original+ "-");
		
		
		String s01 = original.toLowerCase();
		System.out.println("toLowerCase: -" +s01+ "-");		
				
		String s02 = original.toUpperCase();
		System.out.println("toUpperCase: -" +s02+ "-");		
		
		String s03 = original.trim();
		System.out.println("trim: -" +s03+ "-");
		
		String s04 = original.substring(2);
		System.out.println("substring: -" +s04+ "-");
		
		String s05 = original.replace('a', 'x');
		System.out.println("replace: -" +s05+ "-");
		
		int s06 = original.indexOf("po");
		System.out.println("indexOf: " +s06);
		
		int s07 = original.lastIndexOf("bc");
		System.out.println("lastIndexOf: " +s07);

	}

}
