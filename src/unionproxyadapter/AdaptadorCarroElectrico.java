package unionproxyadapter;

public class AdaptadorCarroElectrico extends Carro implements Subject {

	private CarroElectrico carroElectrico;
	
	public AdaptadorCarroElectrico() {
		super();
		
		carroElectrico=new CarroElectrico();
	
	}
	
	@Override
	public void tanquear() {
		carroElectrico.cargar();
		
	}

	@Override
	public void encender() {
		carroElectrico.activar();
		carroElectrico.iniciarSistemaOperativo();
	}

	@Override
	public void acelerar() {
		carroElectrico.acelerar();		
	}

	@Override
	public void frenar() {
		carroElectrico.frenar();		
	}

	@Override
	public void apagar() {
		carroElectrico.detenerSistemaOperativo();
		carroElectrico.desactivar();
	}

	@Override
	public void doAction() {
		tanquear();
		encender();
		acelerar();
		frenar();
		apagar();
	}

}
