class Patient {
    String diagnosis;

    Patient(String diagnosis) {
        this.diagnosis = diagnosis;
    }
}

public class HospitalPatient {
    static void updateDiagnosis(Patient p) {
        p.diagnosis = "Recovered";
    }

    public static void main(String[] args) {
        Patient p = new Patient("Fever");
        updateDiagnosis(p);
        System.out.println("Diagnosis: " + p.diagnosis);
    }
}
