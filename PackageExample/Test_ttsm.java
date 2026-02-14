import ttsm.*;
class Test{
	public static void main(String[]args){
		student s1=new student();
		s1.readData();
		s1.showData();
		s1.total_mark();
		s1.percentage();

		employee e1=new employee();
		e1.acceptData();
		e1.displayData();
		e1.payment();
	}
}