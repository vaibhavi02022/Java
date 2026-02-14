class Test {
	public static void main(String[]args){
		int[] arr ={1,2,3,4,5};
int cnt=0;
		for(int i=0;i<arr.length;i++){
			int curr =arr[i];

        for(int j=i+1 ;j<arr.length;j++){
        	System.out.println(curr+", "+arr[j]);

        	int sum =curr+arr[j];
        	System.out.println(sum);
        	cnt++;

        	
        }
		}
		System.out.println(cnt);
	}
}