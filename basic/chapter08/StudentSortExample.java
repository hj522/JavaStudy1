package chapter08;

import java.util.Arrays;

public class StudentSortExample {
   public static void main(String[] args) {
      Student[] students = {
            new Student("ÀÌ½Â¿¬", 20),
            new Student("±è¿¬¼ö", 21),
            new Student("ÇãÁöÇö", 23),
            new Student("ÀÌÁØÇõ", 15),
            new Student("±è°­»ê", 40),
            new Student("À±´Ù¿µ", 53),
            new Student("¼º¹ÎÁ¤", 26),
            new Student("ÀÌµ¿¹Î", 6),
            new Student("¹ÚÁ¾È¯", 28),
            new Student("±æ¼±ÁÖ", 77),
      };
      
      Arrays.sort(students);
      for (Student student : students) {
         System.out.println(student);
      }
      
   }
}