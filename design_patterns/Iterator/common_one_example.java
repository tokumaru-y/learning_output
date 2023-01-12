public class MyTeacher extends Teacher {
    private StudentList studentList;

    public void createStudentList() {
        studentList = new StudentList(5);
        studentList.add(new Student("one", 1));
        studentList.add(new Student("two", 1));
        studentList.add(new Student("three", 1));
        studentList.add(new Student("four", 2));
        studentList.add(new Student("five", 2));        
    }

    public void callStudents() {
        int size = studentList.getLastNum();
        for(int n=0;n<size;n++) {
            System.out.println(studentList.getStudentAt(n).getName());
        }
    }
}
// この問題点は、studentListがStudentListの内容と密結合になっている事。
//　このStudentListの実装が変更次第ではこちらの実装も変更してしまう事になる。