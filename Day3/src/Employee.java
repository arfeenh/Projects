
public class Employee {
	
	private int empId;
	private String empName;
	private double empSal;
	private String project;
	
	
	public String getProject() {
		return project;
	}

	public void setProject(String project) {
		this.project = project;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(double empSal) {
		this.empSal = empSal;
	}
	
	public Employee(int id, String name, double salary){
		this.empId= id;
		this.empName=name;
		this.empSal=salary;
	}

	public Employee(){
		
	}
	
    public String toString() {
    	
    	return "id: " + empId + " name: " + empName + " salary: " + empSal;
    }
}
