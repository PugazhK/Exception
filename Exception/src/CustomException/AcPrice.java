package CustomException;

public class AcPrice {
	public static void main(String[] args) throws PriceNotFound {
		int price = 20000;
		try {
			if(price<=25000) {
				throw new PriceNotFound ("hi");
			}
			else {
				System.out.println("product purchasable");
			}
		}catch (PriceNotFound prf) {
			System.out.println(prf.getMessage());
		}
		
	}
}
