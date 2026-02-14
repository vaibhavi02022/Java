class Test{
	public static void main(String[]args){
		String s="MAHABHaRaTa";

		int counta=0;
		int countA=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			System.out.print(ch[i]+" \n");

			if(ch[i]=='A'){
				countA++;
			}
			if(ch[i]=='a'){
				counta++;
			}
		}
		System.out.println("A"+countA);
		System.out.println("a"+counta);
	}
}