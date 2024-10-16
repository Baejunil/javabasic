package shopinglist;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SLRepo {
    List<ShoppingList> SLs = new ArrayList<>();

    public void printSLs(Consumer<List<ShoppingList>> consumer) {
        consumer.accept(SLs);
    }

    public void addSL(String name) {
        ShoppingList sl = new ShoppingList();
        sl.setName(name);
        SLs.add(sl);
    }
    
}
