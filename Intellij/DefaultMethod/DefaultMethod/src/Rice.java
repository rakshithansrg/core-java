public class Rice {
    public String color;
    public  String shape;
    public String quality;

    public  Rice()
    {
        System.out.println("No arg constructor");
    }

    public void setRice(String color,String shape,String quality)
    {
        this.quality=quality;
        this.color=color;
        this.shape=shape;
        System.out.println("Running setRice in Rice");
    }

    @Override
    public String toString() {
        return "Shape:"+this.shape+"\nColor:"+this.color+"\nQuantity:"+this.quality;
    }

    @Override
    public int hashCode() {
        System.out.println("print original hash code :"+System.identityHashCode(1)+"\n hashcode :"+shape.hashCode());
        return 100;
    }
}
