package pl.pp;
import java.util.*;

public class myEleventhApp {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
                new Student("12345", "Jan", "Kowalski", Arrays.asList(4, 5, 3, 5)),
                new Student("67890", "Anna", "Nowak", Arrays.asList(5, 5, 4, 4)),
                new Student("54321", "Paweł", "Wiśniewski", Arrays.asList(2, 3, 2, 4)),
                new Student("09876", "Katarzyna", "Kowalczyk", Arrays.asList(5, 4, 4, 5))
        );

        // En yüksek ortalamayı bulan
        Student topStudent = Collections.max(students, Comparator.comparingDouble(Student::getAverageGrade));
        System.out.printf("Student with the highest average: %s %s (%s) - Average: %.2f%n",
                topStudent.getFirstName(), topStudent.getLastName(), topStudent.getIndexNumber(), topStudent.getAverageGrade());

        // Soyadına göre sıralama
        students.sort(Comparator.comparing(Student::getLastName));
        System.out.println("\nStudents sorted by last names:");
        for (Student s : students) {
            System.out.printf("%s %s (%s) - Average: %.2f%n",
                    s.getFirstName(), s.getLastName(), s.getIndexNumber(), s.getAverageGrade());
        }

        // Tüm öğrencilerin ortalamasını hesaplama
        double totalAvg = students.stream().mapToDouble(Student::getAverageGrade).average().orElse(0);
        System.out.printf("\nAverage grade of all students: %.2f%n", totalAvg);
    }
}