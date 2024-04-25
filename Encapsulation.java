package OOPSConcepts;

public class Encapsulation {
	private int EmpId;
	private String EmpName;
	private int EmpAge;
	
    public int getEmpId() {
    	return EmpId;
    }
    public String getEmpName() {
    	return EmpName;
    }
    public int getEmpAge() {
    	return EmpAge;
    }
    public void setEmpId(int Id) {
    	EmpId = Id;
    }
    public void setEmpName(String Name) {
    	EmpName = Name;
    	
    }
    public void setEmpAge(int Age) {
    	EmpAge = Age;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation e = new Encapsulation();
		e.setEmpId(101);
		e.setEmpName("Smith");
		e.setEmpAge(28);
		System.out.println("Employee Id is:"+e.getEmpId());
		System.out.println("Employee Name is:"+e.getEmpName());
		System.out.println("Employee Age is:"+e.getEmpAge());
	}

}
