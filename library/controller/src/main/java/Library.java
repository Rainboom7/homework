import lombok.Data;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;

@Data
final class Library {
    Library(@NotNull ArrayList<book> books) {
        this.books = books;
    }

    @NotNull

    private ArrayList<book> books;
}
