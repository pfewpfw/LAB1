public class Main  {
    // Конструктор класса отсутствует!!!
    // Главный метод главного класса

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        // Определение ссылок на продукты завтрака
        Food[] breakfast = new Food[20];
        // Анализ аргументов командной строки и создание для них
        // экземпляров соответствующих классов для завтрака


        IceCream icecream = new IceCream("Шоколадный");
        int itemsSoFar = 0;
        for (String arg: args) {
            String[] parts = arg.split("/");
            if (parts[0].equals("Cheese")) {
// У сыра дополнительных параметров нет
                breakfast[itemsSoFar] = new Cheese();
            } else
            if (parts[0].equals("Apple")) {
// У яблока – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new Apple(parts[1]);
            }else
            if (parts[0].equals("IceCream")) {
// У мороженного – 1 параметр, который находится в parts[1]
                breakfast[itemsSoFar] = new IceCream(parts[1]);
            }
// ... Продолжается анализ других продуктов для завтрака
            itemsSoFar++;
        }
// Перебор всех элементов массива
        for (Food item: breakfast)
            if (item!=null)
// Если элемент не null – употребить продукт
                item.consume();
            else
// Если дошли до элемента null – значит достигли конца
// списка продуктов, ведь 20 элементов в массиве было
// выделено с запасом, и они могут быть не
// использованы все
                break;
        System.out.println("Всего хорошего!");
        int cheeseCount = countItems(breakfast, new Cheese());
        int appleCount = countItems(breakfast, new Apple(""));
        int IceCount = countItems (breakfast, new IceCream(""));

        System.out.println("Количество сыров: " + cheeseCount);
        System.out.println("Количество  яблок: " + appleCount);
        System.out.println("Количество мороженных: " + IceCount);
    }
    public static int countItems(Food[] breakfast, Food sample)
    {
        int count =0;
        for (Food foodItem : breakfast)
        {
            if (foodItem != null && foodItem.equals(sample))
            {
                count++;
            }
        }
        return count;
    }


}


