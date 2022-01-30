import java.util.Scanner;

public class Grader {
    public static void main(String[] args) {
        final int _entries = 6;

        final Scanner _scanner = new Scanner(System.in);
        _box(" ");
        int _grade = _scanner.nextInt();
        for (int _entry = 0; _entry < _entries; _entry++) {
            _gradeParser(_grade);
            _box("next ");
            _grade = _scanner.nextInt();
        }
        System.out.println("🚨 Exiting the program 🚨");
        _scanner.close();
    }

    public static void _box(String text) {
        System.out.println("\t -----------------------------");
        System.out.println("\t \t Enter the " + text + "grade");
        System.out.println("\t -----------------------------");
    }

    public static void _gradeParser(int grade) {
        if (grade <= 25) {
            System.out.println("run Grading: " + grade);
            System.out.println("Student's grate is F 😡");
        } else if (grade >= 25 && grade < 45) {
            System.out.println("run Grading" + grade);
            System.out.println(" -Student's grate is E 😖");
        } else if (grade >= 45 && grade < 50) {
            System.out.println("run Grading" + grade);
            System.out.println(" -Student's grate is D 😒");
        } else if (grade >= 50 && grade < 60) {
            System.out.println("run Grading" + grade);
            System.out.println(" -Student's grate is C 😕");
        } else if (grade >= 60 && grade < 80) {
            System.out.println("run Grading" + grade);
            System.out.println(" -Student's grate is B 🙂");
        } else if (grade >= 80 && grade <= 100) {
            System.out.println("run Grading" + grade);
            System.out.println(" -Student's grate is A 😀");
        }
    }
}