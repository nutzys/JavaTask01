abstract class Marks {
    public abstract double getPercentage();
}

class StudentA extends Marks {
    private int marks1, marks2, marks3;

    public StudentA(int m1, int m2, int m3) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
    }

    @Override
    public double getPercentage() {
        int total = marks1 + marks2 + marks3;
        return (double) total / 3;
    }
}

class StudentB extends Marks {
    private int marks1, marks2, marks3, marks4;

    public StudentB(int m1, int m2, int m3, int m4) {
        this.marks1 = m1;
        this.marks2 = m2;
        this.marks3 = m3;
        this.marks4 = m4;
    }

    @Override
    public double getPercentage() {
        int total = marks1 + marks2 + marks3 + marks4;
        return (double) total / 4;
    }
}

