//Encapsulation: binding data within the methods 

  class Employee
  
  {
	  private int empid;
	  private String name, dept; 
	  
	 
	public int getEmpid() {
		System.out.println("Emp ID is fecthed or accessed");
		
		return empid;
	}
	public void setEmpid(int empid) {
		System.out.println("Emp ID is updated");
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	  
	  
  }

public class EncapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee emp = new Employee();
		
		
		emp.setEmpid(7816);
		emp.setName("Chris");
		emp.setDept("Marketing");
		
		//emp.empid = 6213;
		//emp.name = "JOHN";
		//emp.dept = "HR";

		System.out.println(emp.getEmpid());
 	System.out.println(emp.getName());
	 System.out.println(emp.getDept());

		
	}

}
