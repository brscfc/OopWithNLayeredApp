package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager = new CustomerManager(new Customer(), new CarCreditManager());
		customerManager.giveCredit();
				
	}
}



//1 Class sadec 1 Clası inherit edebilir.
//1 Clas birden fazla interface'yi implemente edebilir. 
//Abstractlar class özelliği gösterir bu yüzden 1 class sadece bir abstract classı inherit edebilir.
//1 clas sadece bir abstract classı veya başka bir clası inherit edebilir.Yani hem abstract clas hem de normal bir clası
//aynı anda inherit edemeyiz.
//Abstract sınıflarda ve interfaceler asla newlenemezler referans tip özelliğine sahiptir.