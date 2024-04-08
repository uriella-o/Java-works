package SCHOOL;

public class Main {
        public static void main(String[] args) {

            Teacher teacher3 = new Teacher();
            teacher3.setfirstname("Charlie");
            System.out.println("The teacher's first name is " + teacher3.getfirstname());
            teacher3.setlastname("Cox");
            System.out.println("The teacher's last name is " + teacher3.getlastname());

            Teacher teacher = new Teacher();
            teacher.setfirstname("Charlie");
            teacher.setlastname("Cox");
            teacher.setdegree("Fishing");
            teacher.setsex("male");


            Teacher teacher2 = new Teacher();
            teacher2.setfirstname("Matthew");
            teacher2.setlastname("Murdock");
            teacher2.setdegree("Fighting");
            teacher.setsex("male");

            Student student1 = new Student();
            student1.setFirstname("Michael");
            System.out.println("The first student name is " + student1.getFirstname());
            student1.setBestTeacher(teacher);
            String bestTeachersName = student1.getBestTeacher().getfirstname();
            String teacherSex = student1.getBestTeacher().getsex();
            if (teacherSex.equals("male")){
                System.out.println("His best teacher is MR " + bestTeachersName);
            } else{
                System.out.println("His best teacher is MRS " + bestTeachersName);
            }
            student1.setLastname("James");
            System.out.println("The first student lastname is " + student1.getLastname());
            student1.setAge(12);
            System.out.println("The first student age is " + student1.getAge());
            student1.setSex("Male");
            System.out.println("The first student is " + student1.getSex());

            Student student2 = new Student();
            student2.setFirstname("Timothy");
            System.out.println("The second student name is " + student2.getFirstname());
            student2.setLastname("James");
            System.out.println("The second student lastname is " + student2.getLastname());
            student2.setAge(12);
            System.out.println("The second student age is " + student2.getAge());
            student2.setSex("Male");
            System.out.println("The second student is " + student2.getSex());

        }
}
