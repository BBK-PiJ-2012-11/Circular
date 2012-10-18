public class Patient {
	public String name;
	public int age;
	public String illness;
	public Patient nextPatient;
	public static Patient firstPatient = null;

	public Patient(String name, int age, String illness){
		this.name = name;
		this.age = age;
		this.illness = illness;
		if (firstPatient == null){
			firstPatient = this;
		}
		this.nextPatient = firstPatient;
	}

	public void addPatient(Patient newPatient) {
		if (this.nextPatient.equals(this.firstPatient)) {
			this.nextPatient = newPatient;
		} else {
			this.nextPatient.addPatient(newPatient);
		}
	}

	public boolean deletePatient(Patient patient){
		if (this.nextPatient.name.equals(firstPatient.name)) {
			return false;
		} else if (this.nextPatient.name.equals(patient.name)) {
			if (!this.nextPatient.nextPatient.name.equals(firstPatient.name)){
				this.nextPatient = nextPatient.nextPatient;
			} else {
				this.nextPatient = firstPatient;
			}
			return true;
		} else {
			return this.nextPatient.deletePatient(patient);
		}
	}
}
