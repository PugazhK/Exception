package methodReferences;

public class UseMethodReference {
	public static void main(String[] args) {
		int[] nums= {389,2038,3764,989,2667,98,648,-98};
		
		MethodClass mc=new MethodClass();
		
		MethodReference mr=mc::findMax;						// calling a non-static method using instance variable
	
//	MethodReference mrMax= new MethodClass()::findMax;		//calling a non-static method using instance(new)
//	
//	MethodReference mrMin=MethodClass::findMin;				// calling a static method using direct className
//	
//	System.out.println("The max is " +mrMax.maxOrMin(nums));
//	
//	System.out.println("The min is "+mrMin.maxOrMin(nums));
	
	System.out.println("The max using non static is "+mr.maxOrMin(nums));
	System.out.println(mr.printString("pugazh"));
	
	}
}
