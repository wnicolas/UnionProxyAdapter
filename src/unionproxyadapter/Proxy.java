package unionproxyadapter;

public class Proxy implements Subject{
	
	private int opcion;
	
	public Proxy(int x) {
		
		opcion=x;
		
	}

	@Override
	public void doAction() {
		
		if(opcion==1) {
			CarroGasolina miCarroGasolina=new CarroGasolina();
			
			miCarroGasolina.doAction();
		}else
			if(opcion==2) {
				AdaptadorCarroElectrico miCarroElectrico=new AdaptadorCarroElectrico();
				
				miCarroElectrico.doAction();
			}
		
		
	}

}
