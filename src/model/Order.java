package model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Order {

    private Long id;
    private Long customer_id;
    private Long employee_id;
    private Integer book_id;
    private String order_date;
    private long[] books;  //писок номеров проданных книг

    public Order(Long id, Long customer_id, Long employee_id, Integer book_id, String order_date, long[] books) {
        this.id = id;
        this.customer_id = customer_id;
        this.employee_id = employee_id;
        this.book_id = book_id;
        this.order_date = order_date;
        this.books = books;
    }
}
