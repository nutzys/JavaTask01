package hw2;

public abstract class Student {
    protected String studentName;
    protected double grades;

    public Student(String name, double grade){
        this.studentName = name;
        this.grades = grade;
    }

    public String getLetterGrade(double avg){
        if(avg >= 70){
            return "F";
        }
        return "a";
    };
}
