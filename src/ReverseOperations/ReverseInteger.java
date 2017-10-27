package ReverseOperations;

public class ReverseInteger {
	
	public static void reverseInt(int inputInt) {
		int resultInt = 0;
		
		while(inputInt != 0){
			int tail = inputInt%10;
			int newResultInt = resultInt*10 + tail;
			
			
			//key is checking the previous result with (current value - tail)/10
			//System.out.println((newResultInt - tail) + "    " +resultInt);
			
			if((newResultInt - tail)/10 != resultInt){
				resultInt = 0;
				break;
			}
			resultInt = newResultInt;
			inputInt = inputInt/10;
		}
		
		System.out.println(resultInt);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//call the method to reverse the input Integer
		reverseInt(1000000004);

	}

}
