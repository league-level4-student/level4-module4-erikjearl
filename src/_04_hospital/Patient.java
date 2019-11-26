package _04_hospital;

public class Patient {
	
	Doctor assignedDoc;
	Boolean caredFor;
	
	public Patient() {
		caredFor = false;
	}

	public boolean feelsCaredFor() {
		// TODO Auto-generated method stub
		return caredFor;
	}

	public void checkPulse() {
		// TODO Auto-generated method stub
		caredFor = true;
	}
	
	
	
}
