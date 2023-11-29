public class Bandli {
    public String shape;
    public int cost;
    public String metal;

    public Bandli()
    {
        System.out.println("no arg const");
    }
    public void toFry(String shape,int cost,String metal)
    {
        this.cost=cost;
        this.shape=shape;
        this.metal=metal;
    }

    @Override
    public String toString() {
        return "Bandli{" +
                "shape='" + shape + '\'' +
                ", cost=" + cost +
                ", metal='" + metal + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        System.out.println("original hashcode :"+System.identityHashCode(4));
        return 100;
    }
}
