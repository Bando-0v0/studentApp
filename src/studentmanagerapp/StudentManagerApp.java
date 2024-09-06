
package studentmanagerapp;


public class StudentManagerApp {

    // calling all my functions from my student class in my main program
    public static void main(String[] args) {
        student myObj = new student();
        System.out.println("STUDENT MANAGEMENT APPLICATION\n"+ 
           "*********************************\n");
        myObj.navigate();
       //myObj.saveStudent();
    }
    
}
