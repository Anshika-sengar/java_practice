package collectionQuestion;

import java.util.*;

class PriorityQueueExample {

    public static void main(String[] args) {

        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                return s1.getGrade() - s2.getGrade(); // ascending order
            }
        });

        queue.add(new Student("Anshika", 'A'));
        queue.add(new Student("Rahul", 'C'));
        queue.add(new Student("Neha", 'B'));

      //   while (!queue.isEmpty()) {
      //       Student s = queue.poll();
      //       System.out.println(s.getName() + " : " + s.getGrade());
      //   }
        System.out.printf("%s",queue.poll());
         System.out.printf("%s",queue.poll());
         System.out.printf("%s",queue.poll());
    }

    static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }
      public String toString() {
         return name + " : " + grade;
      }

     
    }
}
