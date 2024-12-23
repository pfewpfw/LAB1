public class IceCream extends Food {

    public IceCream(String sirup) {
        super("IceCream");
        if(sirup.equals("Шоколадный")||sirup.equals("Карамельный")) {
            super.Consist(sirup);
        }else
        {
            super.Consist("Шоколадный");
        }
    }
    public void consume() {
        System.out.println(this + " съеден");
    }

}
