public class LibraryMain {
    public static void main(String[] args){
        Author author1=new Author("JRR","Tolkien",1892);
        Author author2=new Author("Frank","Herbert",1920);
        Book book=new Book("Le Seigneur des Anneaux",author1,1954 );
        Book book1=new Book("Bilbo le Hobbit",author1,1937);
        Book book2=new Book("Dune",author2,1965);
        Library library=new Library();
        library.addBook(book);
        library.addBook(book1);
        library.addBook(book2); 
        System.out.println(book);
        System.out.println(book1);
        System.out.println(book2);

    
    }
}