package Comparable;

public class Student implements Comparable<Student> {
    private String name;
    private float cgpa;

    public Student(String name, float cgpa) {
        this.name = name;
        this.cgpa = cgpa;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Student o) {
        return Float.compare(o.cgpa,this.cgpa);
    }


    public float getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return this.name+" : "+cgpa;
    }
}
