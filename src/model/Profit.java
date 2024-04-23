package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Profit {

    private int count;
    private double prise;

    public Profit(int count, double prise) {
        this.count = count;
        this.prise = prise;
    }
}
