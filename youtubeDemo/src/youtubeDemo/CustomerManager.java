package youtubeDemo;

public class CustomerManager {
	
	private Customer customer;								//interfaceler referans tiptir bu yüzden kullanıldığı verilerin referansını tutar.
	private ICreditManager creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager)  {
		this.customer=customer;
		this.creditManager=creditManager;
	}

	public void save () {
		System.out.println("Müşteri Kaydedildi : " + this.customer.city);
		
	}
	public void delete () {
		System.out.println("Müşteri Silindi : " + this.customer.city);
	}
	public void giveCredit() {
			
		this.creditManager.calculate();
		System.out.println("Kredi Verildi");
	
	}
}  
 