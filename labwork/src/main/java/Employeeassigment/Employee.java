package Employeeassigment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Employee {
             int id;
             String name;
             int salary;
             
         public Employee(int id,String name,int salary) {
        	 this.id= id;
        	 this.name=name;
        	 this.salary=salary;
         }
                 
         
         @Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
		}


		public static void main(String[] args) {
     		// TODO Auto-generated method stub
        	List<Employee> emp=new ArrayList<Employee>();
     		emp.add(new Employee(1,"saikrishna",20000));
    		emp.add(new Employee(2,"bhagath",19000));
    		emp.add(new Employee(3,"nandakumar",18000));
    		emp.add(new Employee(2,"shiva",18500));
    		System.out.println("sorting using id");
    		Collections.sort(emp,(e1,e2)->{ return e1.id-e2.id ;});
    		System.out.println(emp);
    		System.out.println("sorting using salary");
    		Collections.sort(emp,(e1,e2)->{ return e1.salary-e2.salary ;});
    		System.out.println(emp);
    		System.out.println("sorting using name");
    		Collections.sort(emp,(e1,e2)->{ return e1.name.compareTo(e2.name) ;});
    		System.out.println(emp);
    		
    		//System.out.println(emp.stream().filter(emp.salary->emp.salary>19000));
     		
       }
         
         
         
}