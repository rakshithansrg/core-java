public class Bowl {

    public String shape;
    public int cost;
    public int size;

    public Bowl()
    {
        System.out.println("no arg const");
    }
    public void toUse(String shape,int cost,int size)
    {
        this.cost=cost;
        this.shape=shape;
        this.size=size;
    }

    @Override
    public String toString() {
        return "Bowl{" + "shape='" + shape + '\'' +", cost=" + cost + ", size=" + size + "}";
    }

    @Override
    public int hashCode() {
        System.out.println("hash code of bowl :"+System.identityHashCode(3));
        return 200;
    }
}
