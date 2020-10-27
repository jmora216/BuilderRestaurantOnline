package co.edu.unicauca.builder;

/**
 * Builder concreto
 *
 * @author Juliana Mora López, Yeferson Benavides Marín
 */
public class ItalianDishBuilder extends DishBuilder {

    @Override
    public void setCore() {
        this.setDish(new OrientalDish("Pizza Napolitana", "Pizza al mejor estilo italiano, de masa fina y bordes crujientes. Ingredientes: Queso mozzarella, tomate, perejil, aceitunas", "", 24000, EnumSize.ALL, "Pizza napoletana"));
    }

    @Override
    public void addParts() {
        this.getDish().addPart(new Dish("Vino tinto", "Vino tinto Tribu Bonarda 2007", "", 50000, EnumSize.ALL));
        this.getDish().addPart(new Dish("Gelato", "Helado italiano", "", 7500, EnumSize.HALF));
        this.getDish().addPart(new Dish("Panna cotta", "Postre de leche con nata o crema, azucar, vainilla y gelatina, acompañado de frutos rojos", "", 10000, EnumSize.HALF));
    }

    @Override
    public void setSize() {
        dish.setSize(EnumSize.ALL);
    }

}
