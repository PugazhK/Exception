package CustomException;

public class AcPurchase {
	public static void main(String[] args) throws PriceNotFound {
		int price =20000;
		try {
			if(price<=25000) {
				throw new PriceNotFound ("-------");
			}
			else {
				System.out.println("product purchasable");
			}
		}catch (PriceNotFound pnf) {
			System.out.println(pnf);
		}
	}
}
