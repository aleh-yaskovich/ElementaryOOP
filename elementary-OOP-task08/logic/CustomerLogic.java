package by.htp.task8.logic;

import java.util.ArrayList;
import java.util.List;

import by.htp.task8.entity.Customer;

public class CustomerLogic {

	public List<Customer> sortBySurname(List<Customer> customers) {
		int i = 0;
		while (i < customers.size()-1) {
			if (customers.get(i).getSurname().compareTo(customers.get(i+1).getSurname()) > 0) {
				Customer tmp = customers.get(i+1);
				customers.set(i+1, customers.get(i));
				customers.set(i, tmp);
				i = 0;
			}
			else if (customers.get(i).getSurname().compareTo(customers.get(i+1).getSurname()) == 0) {
				if (customers.get(i).getName().compareTo(customers.get(i+1).getName()) > 0) {
					Customer tmp = customers.get(i+1);
					customers.set(i+1, customers.get(i));
					customers.set(i, tmp);
					i = 0;
				}
				else if (customers.get(i).getName().compareTo(customers.get(i+1).getName()) == 0) {
					if (customers.get(i).getPatronymic().compareTo(customers.get(i+1).getPatronymic()) > 0) {
						Customer tmp = customers.get(i+1);
						customers.set(i+1, customers.get(i));
						customers.set(i, tmp);
						i = 0;
					}
					else if (customers.get(i).getPatronymic().compareTo(customers.get(i+1).getPatronymic()) == 0) {
						i++;
					}
					else {
						i++;
					}
				}
				else {
					i++;
				}
			}
			else {
				i++;
			}
		}
		return customers;
	}
	
	public int minNumberCard(List<Customer> customers) {
		int minNumberCard = customers.get(0).getNumberCard();
		for (int i = 0; i < customers.size(); i++) {
			if (minNumberCard > customers.get(i).getNumberCard()) {
				minNumberCard = customers.get(i).getNumberCard();
			}
		}
		return minNumberCard;
	}
	
	public int maxNumberCard(List<Customer> customers) {
		int maxNumberCard = customers.get(0).getNumberCard();
		for (int i = 0; i < customers.size(); i++) {
			if (maxNumberCard < customers.get(i).getNumberCard()) {
				maxNumberCard = customers.get(i).getNumberCard();
			}
		}
		return maxNumberCard;
	}
	
	public List<Customer> customersNumberCard(List<Customer> customers, int minNumberCard, int maxNumberCard) {
		List<Customer> customersCard = new ArrayList<Customer>();
		for (int i = 0; i < customers.size(); i++) {
			if (customers.get(i).getNumberCard() >= minNumberCard && customers.get(i).getNumberCard() <= maxNumberCard) {
				customersCard.add(customers.get(i));
			}
		}
		return customersCard;
	}
	
}
