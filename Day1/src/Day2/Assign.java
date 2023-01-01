package Day2;

public class Assign {
	public static void main(String [] args) {
		String name = "Pugazh";
		int nameIndex = name.indexOf("a");
		int nameLength = name.length();
		boolean nameStarts = name.startsWith("Pu");
		boolean nameEnds = name.endsWith("zh");
		boolean nameEquals = name.equals("pugazh");
		boolean nameEqualsIgnore = name.equalsIgnoreCase("pugazh");
		boolean nameContains = name.contains("ga");
		char nameCharAt = name.charAt(4);
		String nameConcat = name.concat(" Krish");
		String nameCaps = name.toUpperCase();
		String nameLower = name.toLowerCase();
		String nameSubString = name.substring(0,3);
		
		
		
		System.out.println(nameIndex);
		System.out.println(nameLength);
		System.out.println(nameStarts);
		System.out.println(nameEnds);
		System.out.println(nameEquals);
		System.out.println(nameEqualsIgnore);
		System.out.println(nameContains);
		System.out.println(nameCharAt);
		System.out.println(nameConcat);
		System.out.println(nameCaps);
		System.out.println(nameLower);
		System.out.println(nameSubString);
		
		char [] a = name.toCharArray();
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		System.out.println(a[3]);
		System.out.println(a[4]);
		System.out.println(a[5]);
	}
}
