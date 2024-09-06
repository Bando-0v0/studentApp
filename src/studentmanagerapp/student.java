
package studentmanagerapp;
// improting functions from the library to help me create my program
import java.util.Scanner;

public class student {
    //declaring my variables that will be used throught the programs
    // options will be used to store the values for my case switch function
    int options;
    int start;
    // my student variable will be used to keep track of the number of students captured onto the program
    int students;
    // search will be used to locate elements inside the arrays
    String search;
    //the delete variables will be used to confirm if the user wants to delete the students details
    String delete;
    // declacring arrays to store student credentials 
    // the index variable is the lenght of the array
   int index = 10;
    String [] studentID = new String[index];
    String [] studentNames = new String [index];
    int [] studentAges = new int [index];
    String [] studentEmails = new String [index];
    String [] studentCourse = new String [index];
  //creating this method that will help the user navigate between the different functions  
  public void navigate(){
      
   Scanner kb = new Scanner(System.in);
   System.out.println("Enter 1 to open main menu and any other button to exit");
   System.out.print("Enter here:");
   start=kb.nextInt();
   switch(start){
       case 1:
           do{
               System.out.print("Please select one of the menu items\n"+
                       "1. Capture new student\n"+
                       "2. Search for a student\n"+
                       "3. delete a student\n"+
                       "4. Print student report\n"+
                       "5. Exit application\n"+
                       "Enter here:");
               options = kb.nextInt();
               switch(options){
                   case 1:
                       saveStudent();
                       navigate();
                       break;
                   case 2:
                       searchStudent();
                       navigate();
                       break;
                   case 3:
                       deleteStudent();
                       navigate();
                       break;
                   case 4:
                       studentReport();
                       navigate();
                       break;
                   default:
                   exitStudentApplication();
               }
           }while(start < 2);
           break;
       default:
           exitStudentApplication();
   }
      
  }
  //creating a function that will capture student details and store the in the arrays   
  public void saveStudent(){
  Scanner kb = new Scanner(System.in);
  System.out.println("CAPTURE NEW STUDENT");
  System.out.println("*******************************");
  System.out.print("Please enter the number of students your wish to capture:");
  students= kb.nextInt();
  for(int n = 0; n< students; n++){
   System.out.println("Student "+ (n + 1));
   System.out.println("---------------------------------");
   kb.nextLine();
  System.out.println("Enter the student id: ");
  studentID[n]= kb.nextLine();
  System.out.println("Please enter the students name: ");
  studentNames[n]= kb.nextLine();
  // loop will do checks of the validity of the age captured for the user
  do{
  System.out.println("Please enter the students age: ");
  studentAges[n]= kb.nextInt();
  if(studentAges[n]< 16){
      System.out.println("Invalid age entered");
  }else{
      System.out.println("Age successfully caputerd");
  }
  }
  while(studentAges[n]<16);
  //
  kb.nextLine();
  System.out.println("Please enter the students email: ");
  studentEmails[n]= kb.nextLine();
  System.out.println("Please enter the students course: ");
  studentCourse[n]= kb.nextLine();
  System.out.println("---------------------------------------");
  System.out.println("Student sucessfully captured");
  //
  
    
  }
  } 
  // creating a function that will search through the arrays and look for the index that matches the search
  // when then the search is found a report will be displayed. if not an error message will be displayed
  public void searchStudent(){
   Scanner kb = new Scanner(System.in);
   
     System.out.print("Please enter the student id: ");
    search = kb.nextLine();
   for(int i = 0; i < students; i ++){
    if(studentID[i].contains(search)){
        System.out.println("Student " + (i+1));
     System.out.println("--------------------------------");
     System.out.println("STUDENT ID: " +studentID[i]);
     System.out.println("STUDENT NAME: " +studentNames[i]);
     System.out.println("STUDENT AGE: " + studentAges[i]);
     System.out.println("STUDENT EMAIL: "+ studentEmails[i]);
     System.out.println("STUDENT COURSE: "+ studentCourse[i]);
     System.out.println("----------------------------------");   
    }else{
        System.out.println("This student"+search+" wasn't found");
    } 
   }
   
   
  }
  // this is my delete student function. it will use a for loop to fin an id that matches the id entered
  //if the id is found everything in that index will be set to " " if not an error message will be displayed 
  public void deleteStudent(){
      Scanner kb = new Scanner(System.in);
    System.out.print("Please enter the student id: ");
    search = kb.nextLine();
   for(int i = 0; i < students; i ++){
    if(studentID[i].contains(search)){
        System.out.println("Are you sure you want to delete this student\n"+ 
                "If yes please enter y");
        delete= kb.nextLine();
        if(delete.contains("y")){
            studentID[i] = " ";
        studentNames[i]=" ";
        studentAges[i]= 0;
        studentEmails[i]=" ";
        studentCourse[i]= " ";
        }
        
    }else{
        System.out.println("This student"+search+" wasn't found");
    } 
   }  
  
  }  
  // this function will display a report of the students captured 
  // it will use the student variable to keep track of the number of students in the system
  public void studentReport(){
    for(int x=0; x< students ; x++){
     System.out.println("Student " + (x+1));
     System.out.println("--------------------------------");
     System.out.println("STUDENT ID: " +studentID[x]);
     System.out.println("STUDENT NAME: " +studentNames[x]);
     System.out.println("STUDENT AGE: " + studentAges[x]);
     System.out.println("STUDENT EMAIL: "+ studentEmails[x]);
     System.out.println("STUDENT COURSE: "+ studentCourse[x]);
     System.out.println("----------------------------------");
    }
    
  }  
  // this function will display a message when the program exit is called 
  public void exitStudentApplication(){
   System.out.println("Goodbye");
  }  
}
