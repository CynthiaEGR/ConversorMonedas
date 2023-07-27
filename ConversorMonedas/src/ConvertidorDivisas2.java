import javax.swing.JOptionPane;

public class ConvertidorDivisas2 {
	
	public static void operacion(double cantidad, double divisa, String monedaInicial, String monedaFinal){
		double resultado = 0;
		if(monedaInicial == "Pesos Mexicanos") {resultado = cantidad / divisa;}
		else if(monedaFinal == "Pesos Mexicanos") {resultado = cantidad * divisa;}
		JOptionPane.showMessageDialog(null, cantidad + " " + monedaInicial + " = " + resultado + " " + monedaFinal, "Conversión De Divisas", 1);
	}
	
	public static void main(String[] args) {
		boolean repetir=true;
		
		do{
			String opcion = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Conversión", 
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de monedas","Conversor de temperatura"},
					"Conversor de monedas")).toString();		

			if(opcion == "Conversor de monedas") {
				try {
					double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad de dinero que deseas convertir: ", "Cantidad", JOptionPane.PLAIN_MESSAGE));
					if (cantidad < 0 ) {
						throw new IllegalArgumentException("Número de cuenta inválido");
					}
					
					String moneda = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
							JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Pesos Mexicanos a Dólar","De Pesos Mexicanos a Euro", "De Pesos Mexicanos a Libras", "De Pesos Mexicanos a Yen", "De Pesos Mexicanos a Won Coreano",
																			"De Dólar a Pesos Mexicanos", "De Euro a Pesos Mexicanos", "De Libras a Pesos Mexicanos", "De Yen a Pesos Mexicanos", "De Won Coreano a Pesos Mexicanos"},
							"De Pesos Mexicanos a Dólar")).toString();
					
					switch (moneda) {
					case "De Pesos Mexicanos a Dólar": {
						operacion(cantidad, 17.12, "Pesos Mexicanos", "Dolares");
						break;
					}
					case "De Pesos Mexicanos a Euro": {
						operacion(cantidad, 18.63, "Pesos Mexicanos", "Euros");
						break;
					}
					case "De Pesos Mexicanos a Libras": {
						operacion(cantidad, 0.55, "Pesos Mexicanos", "Libras");
						break;
					}
					case "De Pesos Mexicanos a Yen": {
						operacion(cantidad, 0.12, "Pesos Mexicanos", "Yen");
						break;
					}
					case "De Pesos Mexicanos a Won Coreano": {
						operacion(cantidad, 0.013, "Pesos Mexicanos", "Won Coreano");
						break;
					}
					case "De Dólar a Pesos Mexicanos": {
						operacion(cantidad, 17.12, "Dolares", "Pesos Mexicanos");
						break;
					}
					case "De Euro a Pesos Mexicanos": {
						operacion(cantidad, 18.63, "Euros", "Pesos Mexicanos");
						break;
					}
					case "De Libras a Pesos Mexicanos": {
						operacion(cantidad, 0.55, "Libras", "Pesos Mexicanos");
						break;
					}
					case "De Yen a Pesos Mexicanos": {
						operacion(cantidad, 0.12, "Yen", "Pesos Mexicanos");
						break;
					}
					case "De Won Coreano a Pesos Mexicanos": {
						operacion(cantidad, 0.013, "Won Coreano", "Pesos Mexicanos");
						break;
					}
					default:
						throw new IllegalArgumentException("Unexpected value: " + moneda);
					}
				
				}catch(Exception exception){
					System.out.println(exception.getMessage());
					exception.printStackTrace();
					JOptionPane.showMessageDialog(null, "Error al digitalizar la cantidad");
				}
			}else {
				System.out.println("Temperatura");
				JOptionPane.showMessageDialog(null, "Opción no disponible por el momentos");
			}
			
			int continuar = JOptionPane.showConfirmDialog(null, "¿Desea continuar?","Cancelar",JOptionPane.YES_NO_OPTION);
			if(continuar == JOptionPane.YES_OPTION) {repetir = true;}
			else if(continuar == JOptionPane.NO_OPTION) {repetir = false;}
			else if(continuar == JOptionPane.CANCEL_OPTION){repetir = false;}
			else {
                System.out.println("El usuario seleccionó 'Salir'");
                repetir = false; 
            }
			
		}while(repetir);
	}
}

