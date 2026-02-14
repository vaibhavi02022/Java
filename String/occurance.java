class test{
	public static void main(String[]args){
		String s="PRASSANA";
		char ch[]=s.toCharArray();
		int res=0;
		int count=0;

		for(int i=0;i<s.length();i++){
			if(ch[i]=='A'){
                 res=1;
                 count++;
                 
			}
		}
		if(res==1){
			System.out.println("A is found");
			System.out.println("A is found at "+count +"this times");


		}
		else{
			System.out.println("A is not found");

		}
	}
}