package pl.sda.pracaDomowa;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateBook extends Book{

    private LocalDate releaseDate;



    public LocalDateBook(String author, String title, int ISBN, LocalDate releaseDate) {
        super(author, title, ISBN);
        this.releaseDate = releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }
}
