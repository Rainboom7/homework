import lombok.Data;
import org.jetbrains.annotations.NotNull;

@Data

final class book {
    @NotNull
    private String title;
    @NotNull
    private String author;
    private int publicationYear;

    book(@NotNull String title, @NotNull String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }
}
