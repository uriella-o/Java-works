package Hospital;

public class Patient {
    private String name;
    private String ailment;
    private String sex;
    private int age;

    private Doctor assigneddoctor;

    private Ward assignedward;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAilment() {
        return ailment;
    }

    public void setAilment(String ailment) {
        this.ailment = ailment;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Doctor getAssigneddoctor() {
        return assigneddoctor;
    }

    public void setAssigneddoctor(Doctor assigneddoctor) {
        this.assigneddoctor = assigneddoctor;
    }

    public Ward getAssignedward() {
        return assignedward;
    }

    public void setAssignedward(Ward assignedward) {
        this.assignedward = assignedward;
    }
}
