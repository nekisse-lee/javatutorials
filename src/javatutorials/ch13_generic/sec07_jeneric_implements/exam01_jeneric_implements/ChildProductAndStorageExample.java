package javatutorials.ch13_generic.sec07_jeneric_implements.exam01_jeneric_implements;

/**
 * Created by Nekisse_lee on 2017. 7. 13..
 */
public class ChildProductAndStorageExample {
    public static void main(String[] args) {
        ChildProduct<Tv, String, String> product = new ChildProduct<>();
        product.setKind(new Tv());
        product.setModel("SmartTV");
        product.setCompany("Samsung");

        Storage<Tv> storage = new StorageImpl<>(100);
        storage.add(new Tv(), 0);
        Tv tv = storage.get(0);




    }
}
