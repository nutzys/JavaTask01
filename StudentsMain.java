public class StudentsMain {
    public static void main(String[] args) {
        StudentA studentA = new StudentA(92, 88, 81);
        StudentB studentB = new StudentB(75, 84, 90, 88);

        System.out.println("Percentage of Student A: " + studentA.getPercentage() + "%");
        System.out.println("Percentage of Student B: " + studentB.getPercentage() + "%");
    }
}
