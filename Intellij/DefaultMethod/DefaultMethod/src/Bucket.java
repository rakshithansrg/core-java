public class Bucket {
    public String shape;
    public int cost;
    public int size;

    public Bucket() {
        System.out.println("no arg const");
    }

    protected void setUse(String shape, int cost, int size) {
        this.cost = cost;
        this.shape = shape;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Bucket{" + "shape='" + shape + '\'' + ", cost=" + cost + ", size=" + size + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("hash code of bucket :" + System.identityHashCode(3)+"\n hashcode :"+shape.hashCode());
        return 200;
    }
}