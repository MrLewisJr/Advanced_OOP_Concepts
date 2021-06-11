import java.util.ArrayList;

public class AdultPatient extends Person implements Diagnosable, Employable {
    double temperature;
    int systolic;
    int diastolic;
    ArrayList<String> jobs = new ArrayList<>();

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public boolean hasFever() {
        return getTemperature() > 100.4;
    }

    @Override
    public int getSystolic() {
        return systolic;
    }

    @Override
    public int getDiastolic() {
        return diastolic;
    }

    @Override
    public void setTemperature(double t) {
        temperature = t;
    }

    @Override
    public void setSystolic(int s) {
        systolic = s;
    }

    @Override
    public void setDiastolic(int d) {
        diastolic = d;
    }

    @Override
    public ArrayList<String> getPreviousJobs() {
        return this.jobs;
    }

    @Override
    public void addJob(String job) {
        jobs.add( job );
    }
}
