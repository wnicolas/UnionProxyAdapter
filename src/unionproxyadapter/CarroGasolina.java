package unionproxyadapter;

public class CarroGasolina extends Carro implements Subject{

	public CarroGasolina() {
		
	}
	
	@Override
	public void tanquear() {
		System.out.println("Tanqueando carro a gasolina.");
		
	}

	@Override
	public void encender() {
		System.out.println("Encendiendo carro a gasolina.");
		
	}

	@Override
	public void acelerar() {
		System.out.println("Acelerando carro a gasolina;");
		
	}

	@Override
	public void frenar() {
		System.out.println("Frenando carro a gasolina");
		
	}

	@Override
	public void apagar() {
		System.out.println("Apagando carro a gasolina");
		
	}

	@Override
	public 	void doAction() {
		tanquear();
		encender();
		acelerar();
		frenar();
		apagar();
	}

}
