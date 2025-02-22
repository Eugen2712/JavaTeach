package homework4;

class Cat {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Student {
    private String name;
    private int age;
    private int groupNumber;

    public Student(String name, int age, int groupNumber) {
        this.name = name;
        this.age = age;
        this.groupNumber = groupNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }
}

class StudentService {
    public int countStudentsInGroup(Student[] students, int groupNumber) {
        int count = 0;
        for (Student student : students) {
            if (student.getGroupNumber() == groupNumber) {
                count++;
            }
        }
        return count;
    }
}

public class homework4 {
    public static void main(String[] args) {
        // Task 1: Method to return the maximum of two integers
        int max = getMax(10, 20);
        System.out.println("Max number: " + max);

        // Task 2: Overloaded print methods
        Cat cat = new Cat("Whiskers");
        Dog dog = new Dog("Buddy");
        System.out.println("Cat's name: " + print(cat));
        System.out.println("Dog's name: " + print(dog));

        // Task 3: Student and StudentService
        Student[] students = {
                new Student("Alice", 20, 1),
                new Student("Bob", 21, 2),
                new Student("Charlie", 22, 1)
        };
        StudentService studentService = new StudentService();
        int count = studentService.countStudentsInGroup(students, 1);
        int count2 = studentService.countStudentsInGroup(students, 2);
        System.out.println("Number of students in group 1: " + count);
        System.out.println("Number of students in group 2: " + count2);
    }

    public static int getMax(int a, int b) {
        return a > b ? a : b;
    }

    public static String print(Cat cat) {
        return cat.getName();
    }

    public static String print(Dog dog) {
        return dog.getName();
    }
}