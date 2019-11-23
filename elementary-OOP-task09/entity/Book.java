package by.htp.task9.entity;

public class Book {
	
	private int id;
	private String author;
	private String publishing;
	private int publicationDate;
	private int numberOfPages;
	private double price;
	private String bindingType;
	
	public Book() {
		this.id = 0;
		this.author = "author";
		this.publishing = "publishing";
		this.publicationDate = 1900;
		this.numberOfPages = 0;
		this.price = 0;
		this.bindingType = "binding type";
	}
	
	public Book(int id, String author, String publishing, int publicationDate, int numberOfPages, double price, String bindingType) {
		this.id = id;
		this.author = author;
		this.publishing = publishing;
		this.publicationDate = publicationDate;
		this.numberOfPages = numberOfPages;
		this.price = price;
		this.bindingType = bindingType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublishing() {
		return publishing;
	}

	public void setPublishing(String publishing) {
		this.publishing = publishing;
	}

	public int getPublicationDate() {
		return publicationDate;
	}

	public void setPublicationDate(int publicationDate) {
		this.publicationDate = publicationDate;
	}

	public int getNumberOfPages() {
		return numberOfPages;
	}

	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((author == null) ? 0 : author.hashCode());
		result = prime * result + ((bindingType == null) ? 0 : bindingType.hashCode());
		result = prime * result + id;
		result = prime * result + numberOfPages;
		long temp;
		temp = Double.doubleToLongBits(price);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + publicationDate;
		result = prime * result + ((publishing == null) ? 0 : publishing.hashCode());
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
		Book other = (Book) obj;
		if (author == null) {
			if (other.author != null)
				return false;
		} else if (!author.equals(other.author))
			return false;
		if (bindingType == null) {
			if (other.bindingType != null)
				return false;
		} else if (!bindingType.equals(other.bindingType))
			return false;
		if (id != other.id)
			return false;
		if (numberOfPages != other.numberOfPages)
			return false;
		if (Double.doubleToLongBits(price) != Double.doubleToLongBits(other.price))
			return false;
		if (publicationDate != other.publicationDate)
			return false;
		if (publishing == null) {
			if (other.publishing != null)
				return false;
		} else if (!publishing.equals(other.publishing))
			return false;
		return true;
	}
	
}
