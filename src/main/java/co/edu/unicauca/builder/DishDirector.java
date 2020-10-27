package co.edu.unicauca.builder;

/**
 * Representa el Director
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class DishDirector {

    private DishBuilder dishBuilder;

    /**
     * Constructor que inyecta la dependencia
     *
     * @param dishBuilder
     */
    public void setDishBuilder(DishBuilder dishBuilder) {
        this.dishBuilder = dishBuilder;
    }

    /**
     * Getter
     */
    public Dish getDish() {
        return dishBuilder.getDish();
    }

    /**
     * Método que construye un plato y le adiciona sus partes
     */
    public void buildDish() {
        dishBuilder.setCore();
        dishBuilder.addParts();
    }

}
