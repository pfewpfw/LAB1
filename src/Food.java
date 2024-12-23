import java.net.SocketOption;
public abstract class Food implements Consumable {
    String name = null;
    String ingredient = null;
    public Food(String name) {
        this.name = name;
    }
    public void Consist(String ingredient)
    {
        this.ingredient = ingredient;
    }

    public String getIngr() {
        return ingredient;
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof Food)) return false; // Шаг 1
        if (name==null || ((Food)arg0).name==null) return false; // Шаг 2
        return name.equals(((Food)arg0).name); // Шаг 3
    }
    public String toString() {
        return name;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
// Реализация метода consume() удалена из базового класса Food
// Это можно сделать, потому что сам Food - абстрактный

}
