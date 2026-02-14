class StaticEx2{

	public static int square(int n){
		return n*n;
	}

	public static int cube(int n){
		return n*n*n;
	}

	public static void maxNum(int a, int b){
		if(a>b){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}

	public static void largestString(String a ,String b){
		if(a.length()>b.length()){
			System.out.println(a);
		}
		else{
			System.out.println(b);
		}
	}

}

class Test{
	public static void main(String[]args){
		int square= StaticEx2.square(2);
		int cube= StaticEx2.cube(2);

		System.out.println("square "+square);
		System.out.println("cube "+cube);

		StaticEx2.maxNum(7,8);
		StaticEx2.largestString("vaibhu","vIBHvu");






	}
}