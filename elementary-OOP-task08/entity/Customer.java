package by.htp.task8.entity;

public class Customer {
	
	private int id;
	private String name;
	private String patronymic;
	private String surname;
	private String address;
	private int numberCard;
	private int numberAccount;
	
	public Customer() {
		this.id = 0;
		this.name = "Name";
		this.patronymic = "Patronymic";
		this.surname = "Surname";
		this.address = "";
		this.numberCard = 0;
		this.numberAccount = 0;
	}
	
	public Customer(int id, String name, String patronymic, String surname, String address, int numberCard, int numberAccount) {
		this.id = id;
		this.name = name;
		this.patronymic = patronymic;
		this.surname = surname;
		this.address = address;
		this.numberCard = numberCard;
		this.numberAccount = numberAccount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPatronymic() {
		return patronymic;
	}

	public void setPatronymic(String patronymic) {
		this.patronymic = patronymic;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getNumberCard() {
		return numberCard;
	}

	public void setNumberCard(int numberCard) {
		this.numberCard = numberCard;
	}

	public int getNumberAccount() {
		return numberAccount;
	}

	public void setNumberAccount(int numberAccount) {
		this.numberAccount = numberAccount;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + numberAccount;
		result = prime * result + numberCard;
		result = prime * result + ((patronymic == null) ? 0 : patronymic.hashCode());
		result = prime * result + ((surname == null) ? 0 : surname.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (id != other.id)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (numberAccount != other.numberAccount)
			return false;
		if (numberCard != other.numberCard)
			return false;
		if (patronymic == null) {
			if (other.patronymic != null)
				return false;
		} else if (!patronymic.equals(other.patronymic))
			return false;
		if (surname == null) {
			if (other.surname != null)
				return false;
		} else if (!surname.equals(other.surname))
			return false;
		return true;
	}
	
}
