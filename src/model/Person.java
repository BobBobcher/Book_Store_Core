package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Person {

    private Long id;
    private String name;
    private String phone;
    private String email_address;

    public Person(long id, String name, String phone, String email_address) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email_address = email_address;
    }
}
