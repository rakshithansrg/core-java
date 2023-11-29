public class Main {
    public static void main(String[] args) {
        Rice rice =new Rice();
        rice.setRice("white","rectangle","good");
        System.out.println(rice);
        String ref=rice.toString();
        int ref1=rice.hashCode();
        Object obj=new Rice();
         obj.toString();
         obj.hashCode();

        System.out.println("==============================");

        Bowl bowl=new Bowl();
        bowl.toUse("Square",200,20);
        System.out.println("Cost :"+bowl.cost);
        System.out.println("Shape :"+bowl.shape);
        System.out.println("Size :"+bowl.size);
        System.out.println(bowl);
        System.out.println(bowl.hashCode());
        Object obj1=new Bowl();

        System.out.println("==============================");

        Chain chain=new Chain();
        Object obj2= new Chain();
        chain.design="link";
        chain.size=7;
        chain.cost=50000;
        System.out.println(chain);
        System.out.println(chain.hashCode());
        System.out.println(obj2);
        System.out.println(obj2.hashCode());

        System.out.println("==============================");

        Basket basket =new Basket();
        rice.setRice("white","rectangle","good");
        System.out.println(rice);
        String basket1=basket.toString();
        int basket2=basket.hashCode();
        Object obj4=new Rice();
        obj.toString();
        obj.hashCode();

        System.out.println("==============================");

        Bucket bucket=new Bucket();
        bucket.setUse("Square",200,20);
        System.out.println("Cost :"+bucket.cost);
        System.out.println("Shape :"+bucket.shape);
        System.out.println("Size :"+bucket.size);
        System.out.println(bucket);
        System.out.println(bucket.hashCode());
        Object obj5=new Bucket();

        System.out.println("==============================");

        Spoon spoon=new Spoon();
        spoon.toFeed("Steel",150,10);
        System.out.println("Cost :"+spoon.cost);
        System.out.println("Shape :"+spoon.meterial);
        System.out.println("Size :"+spoon.noOfSpoon);
        System.out.println(spoon);
        System.out.println(spoon.hashCode());
        Object obj6=new Spoon();

        System.out.println("==============================");

        Money money=new Money();
        money.moneyUse("Eduaction");
        System.out.println("Cost :"+money.type);
        System.out.println("Shape :"+money.moneyFor);
        System.out.println("Size :"+money.moneyInCrore);
        System.out.println(spoon);
        System.out.println(spoon.hashCode());
        Object obj7=new Money();

        System.out.println("==============================");

        Geyser gey=new Geyser();
        gey.toHeat("new",3000,3);
        System.out.println(gey.toString());
        System.out.println( gey.hashCode());
        Object obj8=new Money();

        System.out.println("==============================");

        Bandli band=new Bandli();
        band.toFry("Circle",400,"iron");
        System.out.println( band.toString());
        System.out.println( band.hashCode());
        Object obj9=new Bandli();

    }
}
