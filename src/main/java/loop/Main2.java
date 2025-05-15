package loop;

import java.util.List;

class Student {
    private String name;
    private int score;

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
}

public class Main2 {
    public static void main(String[] args) {
        // 학생 리스트에서 점수가 85점 이상인 학생들의 이름을 출력하시오.
        List<Student> students = List.of(
                new Student("김일", 80),
                new Student("김이", 94),
                new Student("김삼", 75),
                new Student("김사", 99),
                new Student("김오", 85)
        );
        for(Student student : students) {
            if(student.getScore() > 84) {
                System.out.println(student.getName());
            }
        }

    }
}
