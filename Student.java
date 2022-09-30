public class Student {
    private final int id;
    private String firstName;
    private String lastName;

    public Student(int id, String firstName, String lastName) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public final int compareTo(Student anotherStudent) {
        int lastNameCp = this.lastName.compareTo(anotherStudent.getLastName());
        int firstNameCp = this.firstName.compareTo(anotherStudent.getFirstName());
        return lastNameCp != 0 ? lastNameCp : firstNameCp != 0 ? firstNameCp : this.id - anotherStudent.getId();
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    
    public final String getLastName() {
        return this.lastName;
    }

    public final void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public final int getId() {
        return this.id;
    }

    @Override
    public String toString() {
        return "Student [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
    }
}