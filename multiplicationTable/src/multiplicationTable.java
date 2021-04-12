public class multiplicationTable {

	public static void main(String[] args) {

	
				int i = 0;
				int n = 1;
				
				for(n = 1; n <= 10; n++) {
					
					for(i = 1; i <= 10; i++) {
						
						if(n * i >= 10) {
						System.out.print((n * i) + "  ");
						}
						
						else {
							System.out.print((n * i) + "   ");
						}
				}
					System.out.print("\n");
				}
			}
	}

