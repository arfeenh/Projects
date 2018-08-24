

public class OrganizationLogic {
	public Project[] findProject(Project [] prj, double SWON) {
		for(int i=0; i<prj.length; i++) {
			
			if(prj[i]!=null & prj[i].getSWON()==SWON) {
				return prj;
				
			}			
		}
		return null;
		
	}
	public Project findProjectByManager(Project [] prj, String projMan) {
		for(Project p:prj) {
			if(p!=null && p.getProject_Manager()==projMan) {
				return p;
			}
		}
	
		return null;
	}
	
	public double getProjectWithHighestBudget(Project [] prj) {
        double high=0;
        double swon=0;
		for(Project p:prj) {
			if(p!=null && p.getBudget()>high) {
				high =p.getBudget();
				swon=p.getSWON();
			}
		}
		return swon;
	}
	

	public Project [] getProjectWithinBudget(Project [] prj, double min, double max) {
       Project [] j= new Project[5];
       int i=0;
		for(Project p:prj) {
			if(p!=null && p.getBudget()>min && p.getBudget()<max ) {
				j[i]=p;
				i++;
			}
		}
		return j;
	}
	
	public Project [] getProjectWithStatus(Project [] prj, String Status) {
	    Project [] j= new Project[5];
		int i=0;
		
			for(Project p:prj) {
				if(p!=null && p.getStatus().toLowerCase().equals(Status)) {
					j[i]=p;
					i++;
				}
			}
			return j;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Project [] array = new Project[5];
		array[0] = new Project (10.0, "proj1", "Hamza", 500.0, "Red" );
		array[1] = new Project (11.0, "proj2", "arfeen", 630.0, "Blue" );
		array[3] = new Project (12.0, "proj3", "Jenn", 680.0, "Blue" );
		array[4] = new Project (13.0, "proj4", "Harry", 710.0, "Green" );

		OrganizationLogic ol = new OrganizationLogic();
		
		System.out.println("test for findProject: ");
		if(ol.findProject(array, 11)!=null) {  //test for findProject (find SWON: 11)
			//Project proj= ol.findProject(array, 11);
			//System.out.println( proj.toString());
		}
		else {
			System.out.println("Project wasn't found");
		}
		
		System.out.println("test for findProjectByManager: ");
		if(ol.findProjectByManager(array, "Hamza")!=null) {  //test for findProjectByManager Hamza
			Project proj= ol.findProjectByManager(array, "Hamza");
			System.out.println( proj.toString());
		}
		else {
			System.out.println("Project Manager doesn't have a project");
		}
		
		System.out.println("test for getProjectWithHighestBudget: ");
		if(ol.getProjectWithHighestBudget(array)>=0) {  //test for getProjectWithHighestBudget
			double swon= ol.getProjectWithHighestBudget(array);
			System.out.println("The SWON of the Project with highest budget: " + swon);
		}
		else {
			System.out.println("No Projects");
		}
		
		System.out.println("test for getProjectWithinBudget: ");
		if(ol.getProjectWithinBudget(array, 0,700)!=null) {  //test for getProjectWithinBudget
			Project [] proj= ol.getProjectWithinBudget(array, 400, 700);
			int i=0;
				for(Project p:proj) {
					if(proj[i]!=null) {
						System.out.println("projects: " + proj[i].toString());
						i++;
					}
				}
		}
		else {
			System.out.println("No Projects");
		}
		
		
		System.out.println("test for getProjectWithStatus: ");
		if(ol.getProjectWithStatus(array, "blue")!=null) {  //test for getProjectWithStatus
			Project [] proj= ol.getProjectWithStatus(array, "blue");
			int i=0;
				for(Project p:proj) {
					if(proj[i]!=null) {
						System.out.println("projects: " + proj[i].toString());
						i++;
					}
				}
		}
		else {
			System.out.println("No Projects");
		}
	}

}



