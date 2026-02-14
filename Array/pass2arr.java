class Test{
	public static void show(int []a ,int[]b){
		int s=0;
		for(int i=0;i<a.length;i++){
			s=a[i]+b[i];
			System.out.println(s);
		}
	} 

	public static void main(String[]args){
		int a[]={10,20,30,40,50};
		int b[]={100,200,300,400,500};

		show(a,b);
	}
}