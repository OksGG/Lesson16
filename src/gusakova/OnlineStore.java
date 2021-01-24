package gusakova;


import java.util.*;

public class OnlineStore implements Basket {


    public static void main(String[] args) {

    }

    Map<String, Integer> productsMap = new HashMap<>();

    @Override
    public void addProduct(String product, int quantity) {
        productsMap.put(product, quantity);
    }

    @Override
    public void removeProduct(String product) {
        productsMap.remove(product);
    }

    @Override
    public void updateProductQuantity(String product, int quantity) {
        productsMap.put(product, quantity);
    }

    @Override
    public void clear() {
        productsMap.clear();
    }

    @Override
    public List<String> getProducts() {
        List<String> result = new ArrayList<String>();
        result.addAll(productsMap.keySet());
        return result;
    }

    @Override
    public int getProductQuantity(String product) {
        return productsMap.get(product);
    }
}



interface Basket {

    void addProduct(String product, int quantity);

    void removeProduct(String product);

    void updateProductQuantity(String product, int quantity);

    void clear();

    List<String> getProducts();

    int getProductQuantity(String product);

}



