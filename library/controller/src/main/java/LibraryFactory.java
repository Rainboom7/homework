import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

final class LibraryFactory {
    @NotNull
    Library setLibrary(@NotNull ArrayList<book> books){
        return new Library(books);

    }
}
