package chapter08;

import java.util.Arrays;

public class StudentSortExample {
   public static void main(String[] args) {
      Student[] students = {
            new Student("�̽¿�", 20),
            new Student("�迬��", 21),
            new Student("������", 23),
            new Student("������", 15),
            new Student("�谭��", 40),
            new Student("���ٿ�", 53),
            new Student("������", 26),
            new Student("�̵���", 6),
            new Student("����ȯ", 28),
            new Student("�漱��", 77),
      };
      
      Arrays.sort(students);
      for (Student student : students) {
         System.out.println(student);
      }
      
   }
}