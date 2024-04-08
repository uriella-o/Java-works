package SCHOOL;

public class Student {
    private String firstname;
    private String lastname;
    private String sex;
    private int age;
    private Teacher bestTeacher;

    public void setFirstname(String firstname){
        this.firstname = firstname;
    }
    public void setLastname(String lastname){
        this.lastname = lastname;

    }
    public void setSex(String sex){
        this.sex = sex;

    }
    public void setAge(int age){
        this.age = age;

    }
    public String getFirstname(){
        return this.firstname;
    }
    public String getLastname(){
        return this.lastname;
    }
    public String getSex(){
        return this.sex;
    }
    public int getAge(){
        return this.age;
    }

    public void setBestTeacher(Teacher teacher){
        this.bestTeacher = teacher;
    }

    public Teacher getBestTeacher(){
        return this.bestTeacher;
    }

}
//


