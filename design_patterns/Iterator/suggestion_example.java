public interface Aggregate {
    public iterator iterator();
}

public interface Iterator {
    public boolean hasNext();
    public Object next();
}

public class MyStudentList extends StudentList implements Aggregate {
    public MyStudentList() {
        super();
    }

    public MyStudentList(int studentCount) {
        super(studentCount);
    }

    public Iterator iterator() {
        return new MyStudentListIterator(this);
    }
}

public class MyStudentListIterator implements Iterator {
    private MyStudentList myStudentList;
    private int index;

    public MyStudentListIterator(MyStudentList list) {
        this.myStudentList = list;
        this.index=0;
    }

    public boolean hasNext() {
        if(myStudentList.getLastNum() > index) {
            return true;
        } else {
            return false;
        }
    }

    public Student next() {
        Student s = myStudentList.getStudentAt(index);
        index++;
        return s
    }
}