package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Book {

    private int book_id;
    private String book_name;
    private String book_author;
    private String book_date_publication;
    private double book_price;
    private String status;
    private BookGanre ganre;

    public Book(int book_id,
                String book_name,
                String book_author,
                String book_date_publication,
                double book_price,
                String status,
                BookGanre ganre) {
        this.book_id = book_id;
        this.book_name = book_name;
        this.book_author = book_author;
        this.book_date_publication = book_date_publication;
        this.book_price = book_price;
        this.status = status;
        this.ganre = ganre;
    }
}
