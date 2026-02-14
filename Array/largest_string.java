class strings{
	public static void main(String[]args){
		String s1="vaibhavi";
		String s2 ="vaishu";
        if(s1.length()==s2.length()){
        	System.out.println("Equal length string");
        }
		else if(s1.length()>s2.length()){
			System.out.println("largest string is"+s1);
		}
		else{
			System.out.println("largest string is"+s2);
		}
	}
}