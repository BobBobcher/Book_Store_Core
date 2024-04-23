package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BookAdditional {

    public BookGanre ganre;
    public int count;

    public BookAdditional(BookGanre ganre, int count) {
        this.ganre = ganre;
        this.count = count;
    }
}
