//Change

public class HospitalManager{
	private Patient patientListStart = null;

	public static void main(String[] args) {

		HospitalManager hm = new HospitalManager();
		hm.launch();
	}

	public void launch(){


		createList();
		traverseList();

		Patient toBeDeletedPatient = new Patient("Mike", 33, "Tuberculosis");
		if (!patientListStart.deletePatient(toBeDeletedPatient)){
			System.out.println("The patient does not exist");
		}

		toBeDeletedPatient.name = "Bill";
		if (!patientListStart.deletePatient(toBeDeletedPatient)){
			System.out.println("The patient does not exist");
		}
		toBeDeletedPatient.name = "Ron";
		if (!patientListStart.deletePatient(toBeDeletedPatient)){
			System.out.println("The patient does not exist");
		}
		traverseList();
		patientListStart.addPatient(new Patient ("Carlos",32, "Z Virus"));
		toBeDeletedPatient.name = "Carles";
		if (!patientListStart.deletePatient(toBeDeletedPatient)){
			System.out.println("The patient does not exist");
		}
		traverseList();

	}

	public void createList() {


		Patient firstPatient = new Patient ("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
		patientListStart.addPatient(new Patient ("Mike", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Bill", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Bri", 23, "Worms in her eyes"));
		patientListStart.addPatient(new Patient ("Juan", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Pepe", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Lola", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Pedro", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Uri", 33, "Tuberculosis"));
		patientListStart.addPatient(new Patient ("Ron", 33, "Tuberculosis"));
	}

	public void traverseList(){
		Patient currentPatient = new Patient("",0,"");
		currentPatient = patientListStart;
		boolean arrivedLastMember = false;
		boolean arrivedFirstMember = false;
		do{
			System.out.println (currentPatient.name);
			if(currentPatient.nextPatient.equals(patientListStart.firstPatient)){
				arrivedLastMember = true;
			} else {
				currentPatient = currentPatient.nextPatient;
			}
		} while(!arrivedLastMember);

	}
}

