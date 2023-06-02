/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author tokiro
 */
public class Producto
        extends Ropa
        implements Pantalon, Gorra {

    private String vestimenta;
    private String precio;

    @Override
    public String getNombre() {
        return vestimenta + " | " + precio + " Soles";
    }

    /**
     * @return the vestimenta
     */
    public String getVestimenta() {
        return vestimenta;
    }

    /**
     * @param producto the vestimenta to set
     */
    public void setVestimenta(String producto) {
        this.vestimenta = producto;
    }

    /**
     * @return the precio
     */
    public String getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(String precio) {
        this.precio = precio;
    }

    @Override
    public void guardarObjeto() {

    }

    @Override
    public void darSombra() {

    }
}
