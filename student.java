class Student {
    String name;
    int age;

    Student() {
        this.name = "Chandan";
        this.age = 25;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(Student s) {
        this.name = s.name;
        this.age = s.age;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.display();

        Student s2 = new Student("shakeeb", 24);
        s2.display();

        Student s3 = new Student(s2);
        s3.display();
    }
}
