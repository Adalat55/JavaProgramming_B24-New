package day45_constructors;

public class TV {

    String brand;
    int size;
    String screenResolution;
    double price;

    public TV(String inputBrand, int inputSize, String resolution, double inputPrice ){
        brand= inputBrand;
        size= inputSize;
        screenResolution=resolution;
        price= inputPrice;
    }
    @Override
    public String toString() {
        return "TV " +
                "brand: " + brand  +
                ", size: " + size +
                ", screenResolution: " + screenResolution +
                ", price: " + price;
    }
    public static void main(String[] args) {
        TV tvOne= new TV("LG", 65, "4K", 650.0);
        System.out.println(tvOne);
    }
}
