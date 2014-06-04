
/*
 * Represents the sales data 
 */
public class SalesData {
	int data [] = {-1, 0, 4, 42, 84};
	
	public void display() {
		int sum = 0;
		for (int i: data){

			System.out.println("next value:"+ data[i]);
			sum = sum +data[i];
		}
		System.out.println("Sum is: "+sum);
	}

}
