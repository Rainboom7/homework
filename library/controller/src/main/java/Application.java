import com.google.gson.Gson;
import org.jetbrains.annotations.NotNull;


import java.util.ArrayList;
import java.util.Scanner;

public final class Application {
    public static void main(@NotNull String[] args) {
        Gson gson = new Gson();
        String result;
        ArrayList<book> staticBooks = setStaticBooksInfo( );
       Library library= new LibraryFactory().setLibrary(staticBooks);
        String authorName;
        Scanner scanner = new Scanner( System.in );
        System.out.println("Enter author name" );
       authorName=scanner.nextLine();
       ArrayList<book>libraryInfo=library.getBooks();
        for (book bookElement:libraryInfo) {
            if(authorName.equals( bookElement.getAuthor() )){
                result=gson.toJson( bookElement );
                System.out.println(result );
            }

        }
        System.out.println();}


    @NotNull
    private static ArrayList<book> setStaticBooksInfo() {
        ArrayList<book> staticBooks = new ArrayList<>(  );
        staticBooks.add( new book( "book1","jack",1984 ) );
        staticBooks.add( new book( "book2","tom",2000 ) );
        staticBooks.add( new book( "book3","jack",2012 ) );
        return staticBooks;
    }

}
