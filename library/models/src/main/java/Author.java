import lombok.Data;
import org.jetbrains.annotations.NotNull;
@Data
public final class Author {
    private int birthYear;
    @NotNull
    private String name;
    @NotNull
    private String country;

    public Author(int birthYear, @NotNull String name, @NotNull String country) {
        this.birthYear = birthYear;
        this.name = name;
        this.country = country;
    }


    @NotNull
    book writeBook(@NotNull String bookTitle, int publicationYear) {
        return new book(bookTitle,name,publicationYear);
    }
}
