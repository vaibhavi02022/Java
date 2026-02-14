class TestCountA{
	public static void main(String[]args){
		String s ="MAHABHARAT";
		System.out.println("String is"+s);
		int counter=0,i;
		for(i=0;i<s.length();i++){
			if(s.charAt(i)=='A'){
				counter++;
			}
		}
		System.out.println("Total count"+counter);
	}
}