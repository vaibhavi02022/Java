class Test{
	public static void main(String[]args){
		String s="PRASSANA";
		int count=0;
		char ch[]=s.toCharArray();
		for(int i=0;i<s.length();i++){
			System.out.print(ch[i]+" ");
			if(ch[i]!='A' && ch[i]!='S'){
				count++;
			}
		}
		System.out.println("count is"+count);
	}
}