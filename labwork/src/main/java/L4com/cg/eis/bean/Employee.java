package L4com.cg.eis.bean;

public class Employee {
	public long id;
	public String name;
	public double salary;
	public String designation;
	public String insuranceScheme;
	
	public Employee(long id, String name,double salary,String designation,String insuranceScheme) {
		this.id=id;
		this.name=name;
		this.salary=salary;
		this.designation=designation;
		this.insuranceScheme=insuranceScheme;	
		
	}
	public void display() {
		System.out.println(id+"\n"+name+"\n"+salary+"\n"+designation+"\n"+insuranceScheme);
	}
	
	
	

}
