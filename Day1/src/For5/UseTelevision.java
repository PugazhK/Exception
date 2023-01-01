package For5;

public class UseTelevision {
	public static void main(String[] args) {
		Television tv1 = new Television();
		tv1.brand = "LG";
		tv1.price = 26000;
		tv1.size = 32;
		tv1.rating = 3.5f;
		tv1.isSmart = false;
		
		Television tv2 = new Television();
		tv2.brand = "Sony";
		tv2.price = 46000;
		tv2.size = 40;
		tv2.rating = 4.5f;
		tv2.isSmart = true;
		
		Television tv3 = new Television();
		tv3.brand = "Micromax";
		tv3.price = 24000;
		tv3.size = 42;
		tv3.rating = 4.0f;
		tv3.isSmart = true;
		
		Television [] tv = {tv1,tv2,tv3};
		
		int highestPrice = tv[0].price; int highObject = 0;
		
		for (int i=0; i<tv.length; i++) {
			if (highestPrice <= tv[i].price) {
				highestPrice = tv[i].price;
				highObject = i;
			}
		}
		System.out.println(highestPrice + " " + tv[highObject].brand);
		
		int lenBrand = 0;
		String brandUp = " ";
		
		for(int i=0; i<tv.length; i++) {
			if (lenBrand < tv[i].brand.length()) {
				brandUp = tv[i].brand.toUpperCase();
			}
		}
		System.out.println(brandUp);
	}		
}

