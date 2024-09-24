package Inheritance.LibraryManagement;

public class Main {
    public static void main(String[] args) {
        
        EBook oops = new EBook();

        oops.title="OOPS1";
        oops.author="Kamran";
        oops.fileSize="23Mb";
        oops.bookDetails="HelloWorld";
        oops.main();

        PrintedBooks dataStructure = new PrintedBooks();
        dataStructure.title="Data Structure";
        dataStructure.author="Mosh";
        dataStructure.details="hello to DS";
        dataStructure.pages=223;
        dataStructure.main();
    }
}
