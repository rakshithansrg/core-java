public class Chain {

    public String design;

    public double cost;

    public  int size;

    public Chain()
    {
        System.out.println("Chain as no arg-const");
    }
    public void chainInfo(String design,double cost,int size)
    {
        this.design=design;
        this.cost=cost;
        this.size=size;
        System.out.println("running chainInfo in Chain");
    }

    @Override
    public String toString() {
        return "Design:"+this.design+"\nCost:"+this.cost+"\nSize:"+this.size;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
