package OOPSConcepts;

//subclass Student extending the Person class
class Student extends Person {
public void playing() {
	System.out.println("Student's usally play in playground");
            }

@Override 
public void teacher() {
	System.out.println("teacher guides the students...");
       }
public static void main(String[] args) {
	Student s = new Student();
	s.school();
	s.teacher();
	s.playing();
    }
}