package alibaba;
public class Company{
	private String company_name;
	private String city;
	protected String tollfreeno;


	public Company(String company_name,String city){
		this.company_name=company_name;
		this.city=city;
		tollfreeno="190020202020";

	}

	public String show(){
		return company_name+" "+city; 
	}
} //end of class