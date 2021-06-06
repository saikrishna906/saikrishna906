package L4com.cg.eis.service;
import L4com.cg.eis.bean.*;

public class User extends Employee{


	public User(long id, String name, double salary, String designation, String insuranceScheme) {
		super(id, name, salary, designation, insuranceScheme);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] e=new Employee[3];
		e[0]=new Employee(16126,"krishna",45000,"Manager","health");
		e[1]=new Employee(16126,"krishna",45000,"Manager","insurance");
		e[2]=new Employee(16126,"krishna",45000,"Manager","car");
		
		
		for(Employee i:e) {
			i.display();
		}
}
}
