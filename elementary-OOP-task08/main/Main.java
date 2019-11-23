package by.htp.task8.main;

import java.util.ArrayList;
import java.util.List;

import by.htp.task8.entity.Customer;
import by.htp.task8.logic.CustomerLogic;
import by.htp.task8.view.ViewCustomers;

public class Main {

	public static void main(String[] args) {
		
		Customer customer1 = new Customer(1, "Михаил", "Александрович", "Врубель", "Омск", 1856, 1910);
		Customer customer2 = new Customer(2, "Иван", "Николаевич", "Крамской", "Острогожск", 1837, 1887);
		Customer customer3 = new Customer(4, "Алексей", "Кондратьевич", "Саврасов", "Москва", 1830, 1897);
		Customer customer4 = new Customer(5, "Илья", "Ефимович", "Репин", "Куоккала", 1844, 1930);
		Customer customer5 = new Customer(3, "Карл", "Павлович", "Брюллов", "Санкт-Петербург", 1799, 1852);
		Customer customer6 = new Customer(6, "Виктор", "Михайлович", "Васнецов", "Лопьял", 1848, 1926);
		
		List<Customer> customers = new ArrayList<Customer>();
		customers.add(customer1);
		customers.add(customer2);
		customers.add(customer3);
		customers.add(customer4);
		customers.add(customer5);
		customers.add(customer6);
		
		ViewCustomers view = new ViewCustomers();
		view.viewCustomers(customers);
		
		CustomerLogic logic = new CustomerLogic();
		customers = logic.sortBySurname(customers);
		view.viewCustomers(customers);
		
		// Поиск по значениям кредитной карты
		int min = logic.minNumberCard(customers);
		int max = logic.maxNumberCard(customers);
		int minNumberCard = view.enterMinNumberCard(customers, min, max);
		int maxNumberCard = view.enterMaxNumberCard(customers, minNumberCard, max);
		List<Customer> customersCard = logic.customersNumberCard(customers, minNumberCard, maxNumberCard);
		view.viewCustomers(customersCard);

	}

}
