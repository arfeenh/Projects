import java.util.ArrayList;

public class InsuranceUsers {
	
	private String name;
	private String address;
	private String idProof;
	private String date;
	private int contactNumber;
	private String CusID;
	private String policyId;
	private ArrayList<InsurancePolicy> policy  = new ArrayList<InsurancePolicy>();

	
	public InsuranceUsers(String name, String address, String idProof, String date, String policyId, int num){
		this.name=name;
		this.address=address;
		this.idProof=idProof;
		this.date=date;
		this.contactNumber=num;
		this.CusID="101"+name.substring(0, 3);
	}
	
	
	public void addUser(InsurancePolicy u) {
		policy.add(u);
	}
	
	public void remove(InsurancePolicy r) {
		policy.remove(r);
	}
	
	public ArrayList<InsurancePolicy> getUsers() {
		return policy;
	}
	
	public String getName() {
		return name;
	}
	
	public String getCusID() {
		return CusID;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIdProof() {
		return idProof;
	}
	public void setIdProof(String idProof) {
		this.idProof = idProof;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getPolicyId() {
		return policyId;
	}
	public void setPolicyId(String policyId) {
		this.policyId = policyId;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String toString(){
		return ("Cus ID: " + CusID + ", " + "Address: " +  address + ", " + "id Proof: " +  idProof + "date: " +  date + ", " + "Policy Id: " +  policyId + "contact Number: " + contactNumber + "CusID: " + CusID+"\n" );
	}
}
