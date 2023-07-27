import javax.swing.JOptionPane;

public class ConvertidorDivisas1 {
	
	public static void main(String[] args) {
		boolean repetir=true;
		
		do{
			String opcion = (JOptionPane.showInputDialog(null, "Selecciona una opción de conversión", "Conversión", 
					JOptionPane.PLAIN_MESSAGE,null,new Object[] {"Conversor de monedas","Conversor de temperatura"},
					"Conversor de monedas")).toString();		

			if(opcion == "Conversor de monedas") {
				System.out.println("Monedas");
				double cantidad = Double.parseDouble(JOptionPane.showInputDialog(null, "Introduce la cantidad de dinero que deseas convertir: ", "Cantidad", JOptionPane.PLAIN_MESSAGE));
			
				String moneda = (JOptionPane.showInputDialog(null, "Elije la moneda a la que deseas convertir tu dinero", "Monedas", 
						JOptionPane.PLAIN_MESSAGE,null,new Object[] {"De Pesos Mexicanos a Dólar","De Pesos Mexicanos a Euro", "De Pesos Mexicanos a Libras", "De Pesos Mexicanos a Yen", "De Pesos Mexicanos a Won Coreano",
																		"De Dólar a Pesos Mexicanos", "De Euro a Pesos Mexicanos", "De Libras a Pesos Mexicanos", "De Yen a Pesos Mexicanos", "De Won Coreano a Pesos Mexicanos"},
						"De Pesos Mexicanos a Dólar")).toString();
				
				switch (moneda) {
				case "De Pesos Mexicanos a Dólar": {
					System.out.println(cantidad);
					double resultado = cantidad / 17.06;
					JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos = " + resultado + " dolares", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Pesos Mexicanos a Euro": {
					System.out.println(cantidad);
					double resultado = cantidad / 18.63;
					JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos = " + resultado + " euros", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Pesos Mexicanos a Libras": {
					System.out.println(cantidad);
					double resultado = cantidad / 0.55;
					JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos = " + resultado + " libras", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Pesos Mexicanos a Yen": {
					System.out.println(cantidad);
					double resultado = cantidad / 0.12;
					JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos = " + resultado + " yen", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Pesos Mexicanos a Won Coreano": {
					System.out.println(cantidad);
					double resultado = cantidad / 0.013 ;
					JOptionPane.showMessageDialog(null, cantidad + " pesos mexicanos = " + resultado + " won coreano", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Dólar a Pesos Mexicanos": {
					System.out.println(cantidad);
					double resultado = cantidad * 17.06;
					JOptionPane.showMessageDialog(null, cantidad + " dolares = " + resultado + " pesos mexicanos", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Euro a Pesos Mexicanos": {
					System.out.println(cantidad);
					double resultado = cantidad * 18.63;
					JOptionPane.showMessageDialog(null, cantidad + " euros = " + resultado + " pesos mexicanos", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Libras a Pesos Mexicanos": {
					System.out.println(cantidad);
					double resultado = cantidad * 0.55;
					JOptionPane.showMessageDialog(null, cantidad + " libras = " + resultado + " pesos mexicanos", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Yen a Pesos Mexicanos": {
					System.out.println(cantidad);
					double resultado = cantidad * 0.12;
					JOptionPane.showMessageDialog(null, cantidad + " yen = " + resultado + " pesos mexicanos", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				case "De Won Coreano a Pesos Mexicanos": {
					System.out.println(cantidad);
					double resultado = cantidad * 0.013;
					JOptionPane.showMessageDialog(null, cantidad + " won coreano = " + resultado + " pesos mexicanos", "Conversión De Pesos Mexicanos a Dólar", 1);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + moneda);
				}
				
			}else {
				System.out.println("Temperatura");
			}
			
			int continuar=JOptionPane.showConfirmDialog(null, "Desea continuar?","Cancelar",
					JOptionPane.YES_NO_OPTION);
			
			if(continuar==JOptionPane.YES_OPTION) {
				System.out.println("El usuario seleccionó 'Sí'");
				
				repetir=true;
				
			}else if(continuar==JOptionPane.NO_OPTION) {
				System.out.println("El usuario seleccionó 'No'");
				repetir=false;
			}else if(continuar==JOptionPane.CANCEL_OPTION){
				System.out.println("El usuario cerró el diálogo sin seleccionar una opción");
				repetir=false;
			}else {
                System.out.println("El usuario seleccionó 'Salir'");
                repetir = false; 
            }
			
		}while(repetir);
	}
}

