package ArrayBasic;   
 
public class arrayBasics { 

	public static void main(String[] args) {
		int a[] = {2, 1, 4, 6, 5};
		int  key = 6;
		 
		int result = -1; 
		// search for k
		for(int i= 0; i<a.length; i++) {
			if(a[i] == key) {
				result = i;
				break;
				
			}
		}
		}
		
		if(result == -1) {
			System.out.println("Not found");
		} 
		else {
			String result;
			System.out.println("Key is present at "+ result);
		}
 
	}




