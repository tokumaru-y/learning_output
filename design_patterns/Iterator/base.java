public class Student {
    private String name;
    private int sex;

    public Student(String name, int sex) {
        this.name = name;
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public int getSex() {
        return sex;
    }
}

public class StudentList {
    protected Student[] students;
    private int last = 0;

    public StudentList(){}
    public StudentList(int studentCount) {
        this.students = new Student[studentCount];
    }

    public void add(Student student) {
        students[last] = student;
        last++;
    }

    public Student getStudentAt(int index) {
        return students[index];
    }

    public int getLastNum() {
        return last;
    }
}


public abstract class Teacher {
    protected StudentList studentList;

    // 名簿作成
    public abstract void createStudentList();
    // 名簿の記載順に生徒の名前を呼ぶ
    public abstract void callStudents();
}