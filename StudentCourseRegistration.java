import java.util.Scanner;

class Student {

    String studentName;
    int rollNumber;
    double marks;
    String courseName;
    int courseCredits;

    Student(String name, int roll, double m, String course, int credits) {
        studentName = name;
        rollNumber = roll;
        marks = m;
        courseName = course;
        courseCredits = credits;
    }

    double calculateFee() {
        return courseCredits * 1500;
    }

    boolean checkEligibility() {
        return marks >= 50;
    }

    double calculateScholarship() {
        if (marks >= 85)
            return 20;
        else if (marks >= 70)
            return 10;
        else
            return 0;
    }

    double calculateFinalFee() {
        double fee = calculateFee();
        double scholarship = calculateScholarship();

        return fee - (fee * scholarship / 100);
    }

    void displayDetails() {

        double fee = calculateFee();
        double scholarship = calculateScholarship();

        System.out.println("--- Student Details ---");
        System.out.println("Name: " + studentName);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Marks: " + marks);
        System.out.println("Course: " + courseName);
        System.out.println("Credits: " + courseCredits);
        System.out.println("Eligibility: Eligible");
        System.out.println("Total Fee: Rs " + fee);
        System.out.println("Scholarship: " + scholarship + "%");
        System.out.println("Final Fee: Rs " + calculateFinalFee());
    }
}

public class StudentCourseRegistration {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        int roll = sc.nextInt();

        System.out.print("Enter marks: ");
        double marks = sc.nextDouble();

        sc.nextLine();

        System.out.print("Enter course name: ");
        String course = sc.nextLine();

        System.out.print("Enter course credits: ");
        int credits = sc.nextInt();

        Student s = new Student(name, roll, marks, course, credits);

        if (s.checkEligibility()) {
            s.displayDetails();
        } else {
            System.out.println("Not eligible for registration.");
        }

        sc.close();
    }
}