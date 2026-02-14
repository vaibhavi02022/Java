class TestFinally{
	public static void main(String[]args){
		int a[] ={100,200,300,400,500};

		try{
			System.out.println("Elements are" +a[6]);
		}
		catch(ArrayIndexOutOfBoundsException ai){
			System.out.println("elements are outside array size");
		}
		finally{
       System.out.println("Finally block will execute successfully");
		}
	}
}