package kingSoldierSum;

public class FindSumofSoldiers {
	
	public int[] getIndexAndSum(int num, int[] values){
		int[] result = new int[] {0 , 0};
		for(int i = 0; i< values.length; i++){
			int temp = 0;
			if(i-1 >= 0) {
				temp += values[i-1]; 
			}
			
			if(i-2 >=0) {
				temp += values[i-2];
			}
			
			if (i+1 < num){
				temp += values[i+1];
			}
			
			if(i+2 < num) {
				temp += values[i+2];
			}
			
			if(temp > result[0]){
				result[0] = temp;
				result[1] = values[i];
			}
		}
		
		System.out.println("[ "+ result[0]+ " , "+ result[1] + " ] ");
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		FindSumofSoldiers fs = new FindSumofSoldiers();
		fs.getIndexAndSum(5, new int[] {1,2,4,9,10});

	}

}
