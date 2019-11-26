package _04_hospital;

import java.util.ArrayList;
import java.util.List;

public class Hospital {

	ArrayList<Doctor> doctors = new ArrayList<>();
	ArrayList<Patient> patients = new ArrayList<>();
	
	public List<Doctor> getDoctors() {
		// TODO Auto-generated method stub
		return doctors;
	}

	public void addDoctor(Doctor doc) {
		// TODO Auto-generated method stub
		doctors.add(doc);
	}

	public void addPatient(Patient pat) {
		// TODO Auto-generated method stub
		patients.add(pat);
	}

	public ArrayList<Patient> getPatients() {
		// TODO Auto-generated method stub
		return patients;
	}

	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for(Patient p : patients) {
			for(Doctor d : doctors) {
				if(!d.fullPatients) {
					try {
						d.assignPatient(p);
					} catch (DoctorFullException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					break;
				}
			}
		}
	}

}
