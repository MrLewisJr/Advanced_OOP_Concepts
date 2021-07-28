public class Task {
    public static void main(String[] args){
/* TODO */

        Person p = new Person("Kim Possible","2000-01-01");
        p.setPosition("Associate", 34000);
        Resume r = new Resume(p);

        Resume.Education edu = r.new Education("NEIU", "Computer Science");
        r.addEducation(edu);

        Resume.Experience experience = new Resume.Experience("Computer Science Instructor", 2018, 2023);
        r.addExperience(experience);

        r.addExperience(new Resume.Experience("Data Science Engineer I", 2023, 2025));
        r.addExperience(new Resume.Experience("Data Science Engineer II", 2025, 2030));
        r.addExperience(new Resume.Experience("Senior Data Science Engineer", 2030, 2035));
        r.addExperience(new Resume.Experience("Computer Science Curriculum Integration Specialist", 2035, 2050));
        System.out.println(r);
    }
}