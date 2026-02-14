import java.util.*;

public class VectorCapacity{
	public static void main(String[]args){
		Vector<Integer>vector =new Vector<>();
		System.out.println("Initial Capacity :"+vector.capacity());


		for(int i=0;i<=12;i++){
			vector.add(i);
		System.out.println("added"+i+"Size"+vector.size()+"Initial Capacity :"+vector.capacity());


		}
	}
}