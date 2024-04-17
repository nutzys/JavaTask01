package hw2;

import java.util.Scanner;

public class GraduateStudent extends Student{
    

    public GraduateStudent(String name, double grade){
        super(name, grade);
    }

    @Override
    public String getLetterGrade(double avg) {
        if (avg < 70) {
            return "F";
        } else if (avg < 80) {
            return "C";
        } else if (avg < 90) {
            return "B";
        } else {
            return "A";
        }
    }

    public static void main(String[] args){

        double sum = 0;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter students name: ");
        String name = scanner.nextLine();

        System.out.println("Enter grade count: ");
        Integer count = scanner.nextInt();

        for(int x = 0; x <= count; x++){
            System.out.println("Grade " + x + " : ");
            Integer grade = scanner.nextInt();

            sum += grade;
        }

        GraduateStudent student = new GraduateStudent("TestStudent", sum);

        System.out.println(student.getLetterGrade(sum));
    }
}
