package day9;

public class task1{
    public static void main(String[] args) {
         Student student0 = new Student("John Smith", "144_C");
         Teacher teacher = new Teacher("Mr. Brown", "Math");
         student0.printInfo();
         teacher.printInfo();

    }
}

class Human {
    String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void printInfo() {
        System.out.println("Human`s name is " + name);
    }
}

class Student extends Human {
    String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public void printInfo() {
        System.out.println("Student`s name is " + name);
        System.out.println("Group name is " + groupName);
    }

}

class Teacher extends Human {
    String subjectName;

    public Teacher(String name, String subjectName) {
        super(name);
        this.subjectName = subjectName;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public void printInfo() {
        System.out.println("Teacher`s name is " + name);
        System.out.println("Subject is " + subjectName);
    }

}
