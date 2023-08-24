
package ventas;

import javax.swing.JOptionPane;

public class VentasNegocio {
    public static void main(String[] args) {
        double[] ventas = new double[10];

        for (int i = 0; i < 10; i++) {
            String input = JOptionPane.showInputDialog("Ingrese el monto de la venta " + (i+1) + " : ");
              double venta = Double.parseDouble(input);
            ventas[i] = venta;
        }

        // Algoritmo de ordenamiento de burbuja
        for (int i = 0; i < ventas.length - 1; i++) {
            for (int j = 0; j < ventas.length - i - 1; j++) {
                if (ventas[j] >ventas[j + 1]) {
           //Intercambio de elementos
                    double temp = ventas[j];
                    ventas[j] = ventas[j + 1];
                    ventas[j + 1] = temp;
                }
            }
        }

String reporteVentas = "Reporte de ventas:\n";
for (double venta : ventas) {
    reporteVentas += venta + "\n";
}

JOptionPane.showMessageDialog(null, reporteVentas, "Reporte de Ventas", JOptionPane.INFORMATION_MESSAGE);
        }
}
    