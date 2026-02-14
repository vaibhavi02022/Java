import java.util.HashSet ;


class CommonElements {
	public static void main(String[] args){
		String []arr1 ={"apple" ,"banana" ,"mango" ,"orange"};
		String []arr2 ={"grape" ,"apple" ,"kiwi" ,"mango"};

		HashSet<String> set1 =new HashSet<>();
		HashSet<String>common =new HashSet<>();

		for(String str :arr1) {
			set1.add(str);
		}

		for(String str :arr2) {
			if(set1.contains(str)){
				common.add(str);
			}
		}


		System.out.println("Common elements :"+common);
		
	}
}