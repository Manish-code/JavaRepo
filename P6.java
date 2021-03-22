// Find factorial

class FindFact{
	public static void main(String[] args) {
		
		long num = Integer.parseInt(args[0]);
		int f = 1;
		for (int i =1 ; i<= num ; i++){
			f = f * i;
		}
		System.out.println("Fact of "+ num+ " is "+ f);
// above code only valid upto 12
		java.math.BigInteger f1 = new java.math.BigInteger("1");

		for (int i =1 ; i<= num ; i++){

			f1 = f1.multiply(new java.math.BigInteger(""+i));
		}
		System.out.println("Fact of "+ num+ " is "+ f1);

	}
}