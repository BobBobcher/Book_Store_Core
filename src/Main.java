import model.*;

import java.util.ArrayList;
import java.util.HashMap;

public class Main {

    static ArrayList<Book> books = new ArrayList<>();
    static ArrayList<Customer> customers = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();
    static ArrayList<Order> orders = new ArrayList<>();

    public static  void main(String[] args) {

        String booksInfo = String.format("Общее количество проданных книг %d на сумму %f", getCountOfSoldBooks(), getAllPrice());
        System.out.println(booksInfo);

        for (Employee employee : employees){
            System.out.println(employee.getName() + "продал" + getProfitByEmployee(employee.getId()));
        }

        ArrayList<BookAdditional> soldBooksCount = new ArrayList<>(); //getCountOfSoldBooksByGanre();
        HashMap<BookGanre, Double> soldBooksPrices = gePriceOfSoldBooksByGanre();

        String soldBooksStr = "По жанру проданно % книг общей стоимостью %f";

        for (BookAdditional bookAdditional : soldBooksCount){
            double price = soldBooksPrices.get(bookAdditional.getGanre());
            System.out.println(String.format());
        }
    }

    private static HashMap<BookGanre, Double> gePriceOfSoldBooksByGanre() {
        return
    }

    private static HashMap<BookGanre, Double> getCountOfSoldBooksByGanre() {
        ArrayList<BookAdditional> soldBooksCount = new ArrayList<>();
        return new ArrayList<>(soldBooksCount);
    }

    private static String getProfitByEmployee(Long id) {
        return null;
    }

    private static Object getAllPrice () {
            return books.stream();
        }

        private static Object getCountOfSoldBooks () {
            return books.size();
        }


        public static void initData(){
        employees.add(new Employee(1L,"Ivan Ivanov", "+37521111111", "iivanov@mail.com"));
        employees.add(new Employee(2L, "Ivan Ivanov", "+37521111111", "iivanov@mail.com"));
        employees.add(new Employee(2L, "Ivan Ivanov", "+37521111111", "iivanov@mail.com"));

        }
}