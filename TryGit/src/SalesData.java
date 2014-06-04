
/*
 * Represents the sales data 
 */
public class SalesData {
	int data [] = {0, 4, 42};
	
	public void display() {
		int sum = 0;
		for (int i=0; i<data.length;i++){
			System.out.println("next value:"+ data[i]);
			sum = sum +data[i];
		}
		System.out.println("Sum is: "+sum);
	}

}
