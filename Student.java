public class Student implements UniversityStudent{


    @Override
    public void registerCourse(String course) {
        System.out.println(course);
    }

    @Override
    public void attendLecture(String subj) {
        System.out.println(subj);
    }

    @Override
    public void takeExam(int valuation, String name) {
        System.out.println("Student: " + name + " Valuation: " + valuation);
    }
    
}
