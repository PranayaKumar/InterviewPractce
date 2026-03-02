package Collections.Basic;

import java.awt.*;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.stream.StreamSupport;

public class WeakHashMaDemo {
    public static void main(String[] args) {

        WeakHashMap<String, Image> imageCache = new WeakHashMap<>();
        imageCache.put("img1", new Image("Image1"));
        imageCache.put("img2", new Image("Image2"));
        System.out.println(imageCache);
        simulateAppliaction();
        System.gc();
         System.out.println("cache after runnning (Some entries may be cleared): "+imageCache);
    }

    private  static  void  simulateAppliaction(){
        try {
            System.out.println("simulating aapplication running ...");
            Thread.sleep(10000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
    }
}
//    public static void main(String[] args) {
//        WeakReference<Phone> phoneWeakReference = new WeakReference<>(new Phone("Apple", "16 pro max"));
//        System.out.println(phoneWeakReference.get());
//
//        try{
//            Thread.sleep(1000);
//        } catch (Exception ignored) {
//
//        }
//        System.out.println(phoneWeakReference.get());
//    }
//
//}
//
//class Phone{
//    String brand;
//    String model;
//
//    @Override
//    public String toString() {
//        return "Phone{" +
//                "brand='" + brand + '\'' +
//                ", model='" + model + '\'' +
//                '}';
//    }
//
//    public Phone(String brand, String model) {
//        this.brand = brand;
//        this.model = model;
//    }

class Image{
    private String name;

    @Override
    public String toString() {
        return "Image{" +
                "name='" + name + '\'' +
                '}';
    }

    public Image(String name) {
        this.name = name;

    }
}
