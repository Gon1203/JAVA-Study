package inheritance_interface;

public class Ex3 {

	public static void main(String[] args) {
		KRW krw = new KRW(1500);
		USD usd = new USD(100.50);
		EUR eur = new EUR(260.87);
		JPY jpy = new JPY(1400);
		
		Currency[] currencies = {krw,usd,eur,jpy};
		
		for(Currency c : currencies) {
			System.out.println(c.toString());
		}
	}

}


class Currency{
	protected double amount;
	public Currency(double amount) {
		this.amount =amount;
	}
	@Override
	public String toString() {
		return "해당화폐는 " +amount+" 만큼 있습니다.";
}
	
}

class KRW extends Currency{

	public KRW(double amount) {
		super(amount);
	}
	public String toString() {
		return "KRW: "+amount+" 원";
	}
	
}
class USD extends Currency{
	
	public USD(double amount) {
		super(amount);
	}
	public String toString() {
		return "USD: "+amount+" 달러";
	}
	
}
class EUR extends Currency{
	
	public EUR(double amount) {
		super(amount);
	}
	public String toString() {
		return "EUR: "+amount+" 유로";
	}
	
}
class JPY extends Currency{
	
	public JPY(double amount) {
		super(amount);
	}
	public String toString() {
		return "JPY: "+amount+" 엔"; 
	}
	
}



