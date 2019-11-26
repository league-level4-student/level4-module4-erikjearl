package _04_hospital;

import java.util.ArrayList;

public class Doctor {
	
	Boolean isSurgeon;
	Boolean isGPractitioner;
	ArrayList<Patient> pats;
	Boolean fullPatients;
	
	public Doctor() {
		pats = new ArrayList<>();
		isSurgeon = false;
		isGPractitioner = false;
		fullPatients = false;
	}
	
	
	public boolean performsSurgery() {
		// TODO Auto-generated method stub
		if(isSurgeon) {
			return true;
		}
		return false;
	}

	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		if(isGPractitioner) {
			return true;
		}
		return false;
	}

	public void assignPatient(Patient patient) throws DoctorFullException {
		// TODO Auto-generated method stub
		if (pats.size() < 3) {
			pats.add(patient);
		}else {
			fullPatients = true;
			throw new DoctorFullException();
		}
		if(pats.size() >= 3) {
			fullPatients = true;
		}
		
	}
	
	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return pats;
	}

	public void doMedicine() {
		// TODO Auto-generated method stub
		for(Patient p : pats) {
			p.checkPulse();
		}
	}


}
