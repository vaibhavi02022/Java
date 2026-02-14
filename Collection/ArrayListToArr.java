import java.util.ArrayList;
class TestColor{
	public static void main(String[]args){
		ArrayList<String> color_list=new ArrayList<String>();
		color_list.add("White");
		color_list.add("Black");
		color_list.add("Red");
		color_list.add("Purple");
		color_list.add("Yellow");

		System.out.println("Total number of colors: "+color_list.size());

		for(String color:color_list){
			System.out.println(color);
		}

		//create a array from arraylist
		Object obj[]=color_list.toArray();
		for(Object value:color_list){
			System.out.println(value);
		}

	}
}