class Last_digit {
	public static void main(String[]args) {
		int numbers[]= {123 ,456 ,789};
        int sum =0;
		for(int i=0;i<=2;i++){
			int last_no =numbers[i]%10;
			sum = sum+last_no;
		}

		System.out.println("Sum is: "+sum);
	}
}