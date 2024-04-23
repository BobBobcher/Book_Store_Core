package model;

public class Employee extends Person {
    public Employee(Long id,
                    String name,
                    String phone,
                    String email_address) {
        super(id, name, phone, email_address);
    }
}
