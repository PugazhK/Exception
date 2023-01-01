package Day1;

public class UseShirt {
	public static void main (String [] args){
		Shirt shirt = new Shirt();
		shirt.material = "cot@ton";
		shirt.color = "red";
		shirt.isFullHand = true;
		shirt.size = 40;
		Shirt shirt1 = new Shirt();
		shirt1.material = "cot@ton";
		shirt1.color = "red";
		shirt1.isFullHand = true;
		shirt1.size = 40;
		Shirt shirt2 = new Shirt();
		shirt2.material = "cot@ton";
		shirt2.color = "red";
		shirt2.isFullHand = true;
		shirt2.size = 40;
		Shirt[] s= {shirt1,shirt2,shirt};
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].material.contains("@")) {
				count++;
			}
			
		}
		System.out.println(count);
		
	//System.out.println("Materail = " + shirt.material+", Color = "+shirt.color+", Is full hand = "+shirt.isFullHand+", size "+ shirt.size);
	}
}
