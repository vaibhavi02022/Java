class Desc{
	public static void re(int n){
	if(n==1){
		System.out.print(n);
		return;
	}
		System.out.print(n);
        re(n-1);

}
}
class Mn{
	public static void main(String[]args){
		int n=10;
		Desc.re(n);
	}
}