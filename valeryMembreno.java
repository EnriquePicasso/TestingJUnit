package metodosED;

public class valeryMembreno {
	
	public static double agregarKmDiaros (double kmDiarios, double kilometrosActuales) {
		double sumaKm=0;
		sumaKm =  kilometrosActuales + kmDiarios;
		System.out.println("Se han agregado correctamente " + kmDiarios + "km :D");
		return sumaKm;
	}
	    
	private static final double CONSUMO_POR_KM = 0.083; // Litros consumidos por 1 km
	private static final double PRECIO_POR_LITRO = 0.1; // Precio por 1 litro de gasolina
	    
	public static double calcularGasolinaPorKilometro(double kmRecorridos) {
		double litrosConsumidos = kmRecorridos * CONSUMO_POR_KM;
		double costoTotal = litrosConsumidos * PRECIO_POR_LITRO;
		return costoTotal;
	}
	
	
	public static double coste(String tamanyo, String tipo) {
		//precios
		double costeMediana = 5;
		double costeFamiliar = 7.5;
		double costeIngrediente = 1;
		
		//Numero de ingredientes
		double margaritaIngredientes = 2;
		double funghiIngredientes = 3;
		double cuatroQuesosIngredientes = 4;
		
		
        // Posibles tamaños y tipos
        String posibleTamanyo1 = "mediana";
        String posibleTamanyo2 = "familiar";
        String posibleTipo1 = "margarita";
        String posibleTipo2 = "cuatro quesos";
        String posibleTipo3 = "funghi";
		
		double masa=0;
		double noIngredientes=0;
		
		if (tamanyo.equals(posibleTamanyo1) ) {
			masa=costeMediana;
		}else {
			masa=costeFamiliar;
		}
		
		if(tipo.equals(posibleTipo1)){
			noIngredientes=costeIngrediente*margaritaIngredientes;
		}else if(tipo.equals(posibleTipo2)) {
			noIngredientes=costeIngrediente*cuatroQuesosIngredientes;
		}else {
			noIngredientes=costeIngrediente*funghiIngredientes;
		}
		
		//calculo
		double costeFinal=0;
		costeFinal=masa+noIngredientes;
	
		return costeFinal;
	}
}
