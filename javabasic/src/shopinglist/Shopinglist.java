package shopinglist;

public class Shopinglist {

private String name;

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

@Override
public String toString() {
return "ShoppingList [name=" + name + "]";
}
}