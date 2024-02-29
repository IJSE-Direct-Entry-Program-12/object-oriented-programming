public class LibraryApp {
    static Member[] members;
    static Book[] books;
    static IssueRecord[] records;

    static void registerNewMember(Member member){}
    static void addNewBook(Book book){}
    static void issueBook(Member member, Book... books){
        
    }

    public static void main(String[] args) {

    }
}

class Member{
    String nic;
    String name;
    String contact;
    public Member(String nic, String name, String contact) {
        this.nic = nic;
        this.name = name;
        this.contact = contact;
    }
}
class Book{
    String isbn;
    String name;
    String author;
    int copies;
}
class IssueRecord{
    int issueId;
    Member member;
    String dateTime;
    Book[] issuedBooks;
}

