import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;

public class Promotion {
    private ArrayList<Student> studentList;

    public Promotion() {
        this.studentList = new ArrayList<>();
    }

    public int add(String firstName, String lastName) {
        int newStudentId = this.newId();
        Student addedStudent = new Student(newStudentId, firstName, lastName);
        this.studentList.add(addedStudent);
        return newStudentId;
    }
    private void swap(int i, int j) {
        Collections.swap(this.studentList, i, j);
    }

    private int partition(int g, int d) {
        Student keyStudent = this.studentList.get(g);
        int i = g + 1;
        int j = d;
        while( i <= j) {
            while(this.studentList.get(i).compareTo(keyStudent) <= 0) i++;
            while(this.studentList.get(j).compareTo(keyStudent) > 0) j--;
            if (i < j) {
                this.swap(i, j);
                i++;
                j--;
            }
        }
        this.swap(g, j);
        return j;
    }

    public void quickSort() {
        this.quickSort(0, this.studentList.size() - 1);
    }

    private void quickSort(int g, int d) {
        if (g < d) {
            int j = this.partition(g, d);
            this.quickSort(g, j-1);
            this.quickSort(j+1, d);
        }
    }

    public void selectionSort() {
        for (int i = 0; i < this.studentList.size(); i++) {
            int smallIndex = i;
            Student minStudent = this.studentList.get(i);
            for (int j = i + 1; j < this.studentList.size(); j++) {
                if (this.studentList.get(j).compareTo(minStudent) < 0) {
                    smallIndex = j;
                    minStudent = this.studentList.get(j);
                }
            }
            this.swap(i, smallIndex);
        }
    }

    public void printToConsole() {
        Iterator<Student> i = this.studentList.iterator();
        while (i.hasNext()) {
            System.out.println(i.next().toString());
        }
    }

    public int newId() {
        Iterator<Student> i = this.studentList.iterator();
        int maxId = -1;
        while (i.hasNext()) {
            Student currentStudent = i.next();
            int currentStudentId = currentStudent.getId();
            maxId = currentStudentId > maxId ? currentStudentId : maxId;
        }
        return maxId + 1;
    }
}
