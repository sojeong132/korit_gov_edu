package loop;

import java.util.List;

public class Main4 {
    public static void main(String[] args) {
        // 학생들 중 가장 점수가 높은 학생의 이름을 출력하시오.
        List<Student> students = List.of(
                new Student("김일", 80),
                new Student("김이", 94),
                new Student("김삼", 75),
                new Student("김사", 99),
                new Student("김오", 85)
        );

        Student s = students.getFirst();
        for(Student student : students) {
            if(student.getScore() > s.getScore()) s = student;
        }
        System.out.println(s.getName());
    }
}
