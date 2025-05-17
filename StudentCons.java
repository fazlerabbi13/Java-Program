public class StudentCons {
    String name;
    int age;
    String department;

    public StudentCons() {
        name = "Rabbi";
        age = 0;
        department = "CSE";
    }

    public StudentCons(String name) {
        this.name = name;
        this.age = 0;
        this.department = "CSE";
    }


    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Department: " + department);
    }

    public static void main(String[] args) {
        StudentCons s1 = new StudentCons();
        StudentCons s2 = new StudentCons("Ali");


        s1.displayInfo();
        s2.displayInfo();
    }
}
