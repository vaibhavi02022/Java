import java.util.ArrayList;
import java.util.ListIterator;

class Test{
	public static void main(String[]args){
		ArrayList<String>lang =new ArrayList<>();

		lang.add("Java");
		lang.add("Javascript");
		lang.add("Python");

		System.out.println("ArrayList: "+lang);

		System.out.println("Accessing Arraylist using ListIterator Interface");

		ListIterator<String>x=lang.listIterator();
		 while(x.hasNext()){
		 	System.out.println(x.next()+" ");
		 }
      //REMOVE JAVASCRIPT
		ListIterator<String>y=lang.listIterator();
        
		while(y.hasNext()){
			String current=y.next();

			if(current.equals("Javascript")){
				y.remove();
			}
		}

		System.out.println("ArrayList: "+lang);



	}
}