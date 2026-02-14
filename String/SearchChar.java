class test{
	public static void main(String[]args){
		String s="PRASSANA";
		char ch[]=s.toCharArray();
		int res=0;

		for(int i=0;i<s.length();i++){
			if(ch[i]=='A'){
                 res=1;
                 break;
			}
		}
		if(res==1){
			System.out.println("A is found");
		}
		else{
			System.out.println("A is not found");

		}
	}
}