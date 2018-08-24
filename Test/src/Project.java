class Project {
	
	//attributes
	private double SWON;
	private String Project_Name;
	private String Project_Manager;
	private double Budget;
	private String Status;
	
	//getters and setters
	public double getSWON() {
		return this.SWON;
	}
	public void setSWON(double swon) {
		this.SWON=swon;
	}
	
	public String getProject_Name() {
		return this.Project_Name;
	}
	public void setProject_Name(String name) {
		this.Project_Name=name;
	}
	
	public String getProject_Manager() {
		return this.Project_Manager;
	}
	public void setProject_Manager(String name) {
		this.Project_Manager=name;
	}	
	
	public double getBudget() {
		return this.Budget;
	}
	public void setBudget(double budget) {
		this.Budget= budget;
	}
	
	public String getStatus() {
		return this.Status;
	}
	public void setStatus(String status) {
		if(status.equals("Blue") || status.equals("Green") || status.equals("Red")) {
			this.Status=status;
		}else throw new IllegalArgumentException("wrong colour");
	}
	
	//constructor
	public Project(double SWON, String Project_Name, String Project_Manager, double Budget, String Status){
		setSWON(SWON);
		setProject_Name(Project_Name);
		setProject_Manager(Project_Manager);
		setBudget(Budget);
		setStatus(Status);
	}
	// so object can be represented as a text value in a tabular format
	public String toString() {
		return "Project SWON found: "+ SWON + " " + "-- Project Name: " + Project_Name + " " + "-- Project Manager: " + Project_Manager + " " + "-- Budget: " + Budget + " " + "-- Status: " + Status;
	}

}