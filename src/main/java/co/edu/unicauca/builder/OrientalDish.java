package co.edu.unicauca.builder;

/**
 * Plato oriental que usa herencia
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class OrientalDish extends Dish {

    /**
     * Atributo
     */
    private String orientalName;

    /**
     * Constructor
     *
     * @param name Nombre del plato
     * @param description Descripción del plato
     * @param image Imagen del plato
     * @param price Precio del plato
     * @param size Tamaño del plato
     * @param orientalName Nombre oriental del plato
     */
    public OrientalDish(String name, String description, String image, int price, EnumSize size, String orientalName) {
        super(name, description, image, price, size);
        this.orientalName = orientalName;
    }

    /**
     * Getters y setters
     */
    
    public String getOrientalName() {
        return orientalName;
    }

    public void setOrientalName(String orientalName) {
        this.orientalName = orientalName;
    }

}
