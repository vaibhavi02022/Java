class Test{
	public static void main(String[]args){
		String s="How Are You";
		System.out.println("String"+s);
		char ch[]=s.toCharArray();
        int z,x=0;
		for(int i=0;i<s.length();i++){
			if(ch[i]>='A' && ch[i]<='Z'){
				x=((int)ch[i])+32;  //convert to lower
			}
			if(ch[i]>='a' && ch[i]<='z'){
				x=((int)ch[i])-32;  //convert to upper
			}
			if(ch[i]==' '){
				x=((int)ch[i]);   //for space
			}
			System.out.print((char)x);
		}
	}
}