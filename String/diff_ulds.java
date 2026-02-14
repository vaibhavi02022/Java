class Test{
	public static void main(String[]args){
		String s="India#@1234";
		char[]ch=s.toCharArray();
		int counta=0;
		int countA=0;
		int countd=0;
		int counts=0;

		for(int i=0;i<ch.length;i++){
			if(ch[i]>='A'&& ch[i]<='Z'){
				countA++;
			}
			else if(ch[i]>='a'&& ch[i]<='z'){
				counta++;
			}
			else if(ch[i]>='0'&& ch[i]<='9'){
				countd++;
			}
			
			else{
				counts++;
			}
		}
		System.out.println("UPPERCASE LETTERS"+countA);
		System.out.println("LOWERCASE LETTERS"+counta);
		System.out.println("DIGITS LETTERS"+countd);
		System.out.println("SPECIAL LETTERS"+counts);

	}
}