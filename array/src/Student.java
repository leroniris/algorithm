/**
 * @author Leron
 * @version 1.0.0
 * @create 2020/2/18 15:15
 */
public class Student {
    private String name;
    private Integer age;

    public Student(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Array<Student> arr = new Array<>(20);
        Student student1 = new Student("里1", 22);
        Student student2 = new Student("里2", 22);
        Student student3 = new Student("里3", 22);
        arr.addLast(student1);
        arr.addLast(student2);
        arr.addLast(student3);
        System.out.println(arr);


    }
}
