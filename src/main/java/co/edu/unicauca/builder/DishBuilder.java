package co.edu.unicauca.builder;

/**
 * Clase abstracta que representa el builder
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public abstract class DishBuilder {

    /**
     * Atributos
     */
    protected Dish dish;

    /**
     * Método que construye un plato principal
     */
    public abstract void setCore();

    /**
     * Método que adiciona partes a un plato
     */
    public abstract void addParts();

    /**
     * Método que configura el tamaño de un plato y sus partes
     */
    public abstract void setSize();

    /**
     * Getters y setters
     */
    
    public Dish getDish() {
        return dish;
    }

    public void setDish(Dish dish) {
        this.dish = dish;
    }
}
