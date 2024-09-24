package Inheritance.LibraryManagement;

public class EBook extends Book {
    String fileSize;  
    String bookDetails;

    void main (){
        System.out.println("Title: " + title + " author: "+ author + " fileSize: " + fileSize + " BookDetails " + bookDetails);
    }
}