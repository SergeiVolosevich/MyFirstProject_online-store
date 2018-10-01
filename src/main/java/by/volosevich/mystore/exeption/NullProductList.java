package by.volosevich.mystore.exeption;


@SuppressWarnings("serial")
public class NullProductList extends Exception{
    public NullProductList() {
    }

    public NullProductList(String message) {
        super(message);
    }
}
