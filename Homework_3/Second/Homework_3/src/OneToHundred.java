public class OneToHundred {

	public static void main(String[] args) {
		for(int number=1; number<101; number++){
			if(number % 7 == 0 || number % 11 == 0){
				System.out.println(number);
			}
		}
	}

}

//public class OneToHundred{
//	public static void main(String[] args) {
//		int number = 1;
//			while(number < 101){
//				if(number % 7 == 0 || number % 11 == 0){
//					System.out.println(number); 	
//			}
//			number++;
//		}
//	}
//}


//public class OneToHundred{
//	public static void main(String[] args) {
//		int number = 1;
//			do{
//				if(number % 7 == 0 || number % 11 == 0){
//					System.out.println(number); 	
//			}
//			number++;
//		}while(number < 101);
//	}
//}
