package youtubeDemo;

abstract class BaseCreditManager implements ICreditManager {

	@Override
	public abstract void calculate();
														//abstract'ı her yerde değişken olabilecek olan verileri tutabiliriz örn:calculate.
	@Override											//aynı şekilde tamamlanmış ve her yerde aynı olan i de tutar örneğin: save
	public void save() {
		System.out.println("Müşteri Kaydedildi");
	}	

}
