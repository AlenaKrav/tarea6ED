/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed_tarea6;

/**
 *
 * @author babka
 */
public class Factura {

    private static final double PRIME_DISCOUNT = 0.95;
    private static final double BASIC_DISCOUNT = 0.8;
    private static final int DISCOUNT_PRODUCT_LIMIT = 3;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double total;
        if (numProductos > DISCOUNT_PRODUCT_LIMIT) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            total = precioProducto * BASIC_DISCOUNT;
            mostrarTotalEnviado(total);
        } else {
            total = precioProducto * PRIME_DISCOUNT;
            mostrarTotalEnviado(total);
        }
    }

    public void mostrarTotalEnviado(double total) {
        System.out.println("El total a pagar es: " + total);
        System.out.println("Enviado");
    }

}
