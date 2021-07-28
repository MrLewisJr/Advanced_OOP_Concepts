import java.util.ArrayList;
import java.util.List;

public class Resume {
/* TODO */
    public class Education {
         String school;
         String major;

        public Education( String schoolName, String major){
            this.school = schoolName;
            this.major = major;
        }
        void setSchoolName( String schoolName ){
            this.school = schoolName;
        }
        void setMajor( String major ){
            this.major = major;
        }
        String getSchoolName() {
            return this.school;
        }
        String getMajor() {
            return this.major;
        }
        @Override
        public String toString() {
            return getMajor()+" at "+getSchoolName();
        }
    }

/* TODO */
    public static class Experience {
         String title;
         int startYear, toYear;

    public Experience(String title, int startYear, int toYear){
        this.title = title;
        this.startYear = startYear;
        this.toYear = toYear;
    }
        @Override
        public String toString() {
            return this.startYear+"-"+this.toYear+":"+ this.title;
        }
    }
    /* TODO */

    private Person p;
    private ArrayList<Education> educationList;
    private ArrayList<Experience> experienceList;

    /* TODO */
    public Resume(Person p) {
        this.p = p;
        this.educationList= new ArrayList<Education>();
        this.experienceList = new ArrayList<Experience>();
    }

/* TODO */

    public void addEducation(Education education){
        this.educationList.add(education);
    }
    public void addExperience(Experience experience){
        this.experienceList.add(experience);
    }
    @Override
    public String toString(){
        String resume = this.p.toString() + "\n"+"Experience" + "\n";
        for(Experience e: experienceList){
            resume += e.toString()+"\n";
        }
        resume += "Education" + "\n";
        for(Education e: educationList){
            resume += e.toString()+"\n";
        }
        return resume;
    }
}
