]class Test{
	public static void main(String[]args){
		String str="Welcome To Boston City";
		System.out.println(str);
		char ch[]=str.toCharArray();
		int countA=0;
		int counta=0;

		for(int i=0;i<str.length();i++){
			if(ch[i]>='A'&& ch[i]<='Z'){
				countA++;
			}
			if(ch[i]>='a'&& ch[i]<='z'){
				counta++;
			}

		}

		System.out.println("UC:"+countA);
		System.out.println("LC:"+counta);


	}
}