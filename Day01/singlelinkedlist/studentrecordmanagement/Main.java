package Day01.singlelinkedlist.studentrecordmanagement;

public class Main {
    // Main method for testing
    public static void main(String[] args) {
        StudentRecordManagement srm = new StudentRecordManagement();

        // Adding records
        srm.addAtEnd(101, "Arjun", 21, "A+");
        srm.addAtEnd(102, "Shristy Mishra", 22, "A");
        srm.addAtBeginning(100, "Abhishek Patil", 20, "A");
        srm.addAtPosition(103, "Raj", 19, "C", 3);

        // Displaying all records
        System.out.println("All Student Records:");
        srm.displayAllRecords();

        // Searching for a record
        System.out.println("\nSearching for Roll Number 102:");
        srm.searchByRollNumber(102);

        // Updating a grade
        System.out.println("\nUpdating Grade for Roll Number 103:");
        srm.updateGradeByRollNumber(103, "D+");
        srm.displayAllRecords();

        // Deleting a record
        System.out.println("\nDeleting Record with Roll Number 100:");
        srm.deleteByRollNumber(100);
        srm.displayAllRecords();

        // Checking the size of the list
        System.out.println("\nTotal Records: " + srm.getSize());
    }
}
