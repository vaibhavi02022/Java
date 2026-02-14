import javax.swing.*;

class Test{
	public static void main(String[]args){
		String num1=JOptionPane.showInputDialog("Enter the number 1").trim();
		String num2=JOptionPane.showInputDialog("Enter the number 2").trim();

		int n1=Integer.parseInt(num1);
		int n2=Integer.parseInt(num2);

		int z=n1+n2;
		System.out.println("Sum is"+z);


	}
}