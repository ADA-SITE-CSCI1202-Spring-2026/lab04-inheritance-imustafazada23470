package week06;

public class Person {
    private String firstName;
    private String lastName;
    private String gender;

public Person(String firstName, String lastName,String gender ) {
    this.firstName=firstName;
    this.lastName=lastName;
    this.gender=gender;
}
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public String toString() {
    return "Person[firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender + "]";
    }

    public boolean equals(Person p) {
        if (p == null) {
            return false;
        }

        return this.firstName.equals(p.firstName) && this.lastName.equals(p.lastName) && this.gender.equals(p.gender);
    }
}

class Teacher extends Person {

    private String department;
    private String[] courses;

    public Teacher(String firstName, String lastName, String gender, String department, String[] courses) {

        super(firstName, lastName, gender);   
        this.department = department;
        this.courses = courses;
    }

    public Teacher() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public String[] getCourses() {
        return courses;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public void setCourses(String[] courses) {
        this.courses = courses;
    }

    public String toString() {

        String courseList = "";
        if (courses != null) {
            for (int i = 0; i < courses.length; i++) {
                courseList += courses[i] + " ";
            }
        }

        return super.toString() + ", department=" + department + ", courses=" + courseList;
    }
    
    public boolean equals(Teacher t) {

        if (t == null) {
            return false;
        }

        if (!super.equals(t)) {
            return false;
        }

        if (!this.department.equals(t.department)) {
            return false;
        }

        if (this.courses.length != t.courses.length) {
            return false;
        }

        for (int i = 0; i < courses.length; i++) {
            if (!this.courses[i].equals(t.courses[i])) {
                return false;
            }
        }

        return true;
    }
}

class Student extends Person {

    private String studentId;

    public Student(String firstName, String lastName, String gender, String studentId) {
        super(firstName, lastName, gender);  
        this.studentId = studentId;
    }

    public Student() {
        super();
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    @Override
    public String toString() {
        return super.toString() + ", studentId=" + studentId;
    }

    public boolean equals(Student s) {

        if (s == null) {
            return false;
        }

        if (!super.equals(s)) {
            return false;
        }

        return this.studentId.equals(s.studentId);
    }
}