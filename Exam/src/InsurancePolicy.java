import java.util.ArrayList;

public class InsurancePolicy {
	private String policyID;
	private String policyName;
	private int policyDuration;
	private int modeOfPayment;
	private String nominee;
	private double comittedAmmount;
	private int status;
	private ArrayList<InsuranceUsers> customers  = new ArrayList<InsuranceUsers>();
	

	InsurancePolicy(String Id,String name, int duration, int payment, String nominee, double comAmmount, int Status ){
		this.policyID=Id;
		this.policyName=name;
		this.policyDuration=duration;
		this.modeOfPayment= payment;
		this.nominee=nominee;
		this.comittedAmmount=comAmmount;
		this.status=Status;
	}
	
	InsurancePolicy(String Id,String name, int duration ){
		this.policyID=Id;
		this.policyName=name;
		this.policyDuration=duration;
	}
	
	public void addPol(InsuranceUsers p) {
		customers.add(p);
	}
	
	public void remove(InsuranceUsers p) {
		customers.remove(p);
	}
	
	public ArrayList<InsuranceUsers> show() {
		return customers;
	}
	
	public int getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(int modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public String getNominee() {
		return nominee;
	}
	public void setNominee(String nominee) {
		this.nominee = nominee;
	}
	public double getComittedAmmount() {
		return comittedAmmount;
	}
	public void setComittedAmmount(double comittedAmmount) {
		this.comittedAmmount = comittedAmmount;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}

	public String getPolicyID() {
		return policyID;
	}
	public void setPolicyID(String policyID) {
		this.policyID = policyID;
	}
	public String getPolicyName() {
		return policyName;
	}
	public void setPolicyName(String policyName) {
		this.policyName = policyName;
	}
	public int getPolicyDuration() {
		return policyDuration;
	}
	public void setPolicyDuration(int policyDuration) {
		this.policyDuration = policyDuration;
	}
	
	public String toString(){
		return ("Policy Id: " + policyID + ", " + "policy Name: " +  policyName + ", " + "policy Duration: " +  policyDuration + "\n" );
	}
}
