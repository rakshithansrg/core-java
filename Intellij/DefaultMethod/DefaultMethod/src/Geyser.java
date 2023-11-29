import com.sun.management.VMOption;

public class Geyser {
    public String brand;
    public int cost;
    public int warranty;
    public Geyser()
    {
        System.out.println("no arg const");
    }
    public void toHeat(String brand,int cost,int warranty)
    {
        this.cost=cost;
        this.brand=brand;
        this.warranty=warranty;
    }

    @Override
    public String toString() {
        return "Geyser{" +
                "brand='" + brand + '\'' +
                ", cost=" + cost +
                ", warranty=" + warranty +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("original hashcode :"+System.identityHashCode(4));
        return 20;
    }
}
