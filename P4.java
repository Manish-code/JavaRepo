class AddArgs{
	public static void main(String[] args) {
		int sum = 0;
		if(args.length> 0){
			System.out.println("All the args");
			for(int i=0; i <args.length;i++){
				sum += Integer.parseInt(args[i]);
			}
				System.out.println("After adding all the args :" +sum);


			
		}
		else 
			System.out.println("No arguments entered");
		}
	}
