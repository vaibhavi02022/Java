import java.util.*;
class Rev{
	public static void main(String[]args){
	ArrayList<Integer> list=new ArrayList<Integer>();
	list.add(100);
	list.add(200);
	list.add(300);
	list.add(400);
	list.add(500);
	list.add(600);
	list.add(700);

	for(int i=0;i<list.size();i++){
		System.out.println(list.get(i));
	}
System.out.println("Reverse array");

  ArrayList<Integer>rev_num =new ArrayList<Integer>();

  for(int i=list.size()-1;i>=0;i--)
  {
  rev_num.add(list.get(i));
  }
  for(int i=0;i<rev_num.size();i++){
		System.out.println(rev_num.get(i));
	}

  


}
}