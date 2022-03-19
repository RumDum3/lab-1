package labaskhsh1;
import java.util.Scanner;


public class Main {
    
    public static void compareThreeStudentMarks(Student s1, Student s2, Student s3) {
        float bathmos1 = s1.computeFinal();
        float bathmos2 = s2.computeFinal();
        float bathmos3 = s3.computeFinal();
        
        float[] sList = {bathmos1, bathmos2, bathmos3};
        
        float mid = 0.0f;
        
        float max = sList[0];
        
        for (float f : sList) {
            if (f > max) {
                max = f;
            }
        }
        
        float min = sList[0];
        
        for (float f : sList) {
            if (f < min) {
                min = f;
            }
        }
        
        if (bathmos1 < max && bathmos1 > min) {
            mid = bathmos1;
        } else if (bathmos2 < max && bathmos2 > min) {
            mid = bathmos2;
        } else if (bathmos3 < max && bathmos3 > min) {
            mid = bathmos3;
        }
        
        float[] newList = {max, mid, min};
        
        int index = 1;
        for (float f : newList) {
            System.out.println("Βαθμος " + index + " : " + f);
            index += 1;
        }
    }
    
    /*public static void main(String[] args) {
        Student student = new Student(2021210, "Σάββας", "Ζάχος"); // 7.0 & 6.0
        Student student2 = new Student(2019123, "John", "Doe"); // 0.0
        Student student3 = new Student(2018123, "Test", "Test", 5, 10.0f, 10.0f); // 10.0
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Εισαγωγή τιμής απουσιών: ");
        int absence = scanner.nextInt();
        
        System.out.println("Εισαγωγή τιμής εργαστηρίου: ");
        float labScore = scanner.nextFloat();
        
        System.out.println("Εισαγωγή τιμής θεωρίας: ");
        float theoryScore = scanner.nextFloat();
        
        student.setAbsence(absence);
        student.setLabScore(labScore);
        student.setTheoryScore(theoryScore);
        
        System.out.println(student.toString());
        
        System.out.println("------------------------");
        
        compareThreeStudentMarks(student, student2, student3);
    }*/
    
}
