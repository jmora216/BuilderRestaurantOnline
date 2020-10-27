package co.edu.unicauca.builder;

/**
 * Plato italiano que usa herencia
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class ItalianDish extends Dish {

    /**
     * Atributo
     */
    private String italianName;

    /**
     * Constructor
     *
     * @param name Nombre del plato
     * @param description Descripción del plato
     * @param image Imagen del plato
     * @param price Precio del plato
     * @param size Tamaño del plato
     * @param italianName Nombre italiano del plato
     */
    public ItalianDish(String name, String description, String image, int price, EnumSize size, String italianName) {
        super(name, description, image, price, size);
        this.italianName = italianName;
    }

    /**
     * Getters y setters
     */
    
    public String getItalianName() {
        return italianName;
    }

    public void setItalianName(String italianName) {
        this.italianName = italianName;
    }

}
