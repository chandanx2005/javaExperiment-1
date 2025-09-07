
  public class array {
	static int[] createArray() {
		int[]arr= {10,20,30,40};
		return arr;
	}
	public static void main(String[] args) {
		int[]result=createArray();
		System.out.println("ArrayElement");
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]+" ");
		}
	}
	
	
}
    

