
package courseregistration;


public class Student {
    
    String ID;
    String name;
    
      public Student(String ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    public void printStudentInfo() {
        System.out.println("Student ID: " + ID + ", Name: " + name);
    }

  
}
