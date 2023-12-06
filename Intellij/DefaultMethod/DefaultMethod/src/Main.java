public class Main {
    public static void main(String[] args)
    {
        Rice rice =new Rice();
        rice.setRice("white","rectangle","good");
        System.out.println(rice);
        String ref=rice.toString();
        System.out.println(ref);
        int ref1=rice.hashCode();
        System.out.println(ref1);


        Rice rice2 =new Rice();
        rice2.setRice("white","rectangle","good");
        System.out.println(rice);
        String ref2=rice.toString();
        int ref4=rice.hashCode();
        System.out.println(ref2);
        System.out.println(ref4);



        System.out.println("==============================");

        Bowl bowl=new Bowl();
        bowl.toUse("Square",200,20);
        System.out.println("Cost :"+bowl.cost);
        System.out.println("Shape :"+bowl.shape);
        System.out.println("Size :"+bowl.size);
        System.out.println(bowl.toString());
        System.out.println(bowl.hashCode());


        Bowl bowl1=new Bowl();
        bowl1.toUse("Square",200,20);
        System.out.println("Cost :"+bowl1.cost);
        System.out.println("Shape :"+bowl1.shape);
        System.out.println("Size :"+bowl1.size);
        System.out.println(bowl1.toString());
        System.out.println(bowl1.hashCode());


        System.out.println("==============================");

        Chain chain=new Chain();
        chain.design="link";
        chain.size=7;
        chain.cost=50000;
        System.out.println(chain.toString());
        System.out.println(chain.hashCode());


        Chain chain1=new Chain();
        chain1.design="link";
        chain1.size=7;
        chain1.cost=50000;
        System.out.println(chain1.toString());
        System.out.println(chain1.hashCode());


        System.out.println("==============================");

        Basket basket =new Basket();
        basket.setBasket("white","rectangle","good");
        System.out.println(rice);
        String basket1=basket.toString();
        int basket2=basket.hashCode();
        System.out.println(basket1);
        System.out.println(basket2);


        Basket basket5 =new Basket();
        basket5.setBasket("white","rectangle","good");
        System.out.println(rice);
        String basket9=basket.toString();
        int basket8=basket.hashCode();
        System.out.println(basket9);
        System.out.println(basket8);


        System.out.println("==============================");

        Bucket bucket=new Bucket();
        bucket.setUse("Square",200,20);
        System.out.println("Cost :"+bucket.cost);
        System.out.println("Shape :"+bucket.shape);
        System.out.println("Size :"+bucket.size);
        System.out.println(bucket.toString());
        System.out.println(bucket.hashCode());


        Bucket bucket1=new Bucket();
        bucket1.setUse("Square",200,20);
        System.out.println("Cost :"+bucket1.cost);
        System.out.println("Shape :"+bucket1.shape);
        System.out.println("Size :"+bucket1.size);
        System.out.println(bucket1.toString());
        System.out.println(bucket1.hashCode());


        System.out.println("==============================");

        Spoon spoon=new Spoon();
        spoon.toFeed("Steel",150,10);
        System.out.println("Cost :"+spoon.cost);
        System.out.println("Shape :"+spoon.meterial);
        System.out.println("Size :"+spoon.noOfSpoon);
        System.out.println(spoon.toString());
        System.out.println(spoon.hashCode());

        Spoon spoon1=new Spoon();
        spoon1.toFeed("Steel",150,10);
        System.out.println("Cost :"+spoon1.cost);
        System.out.println("Shape :"+spoon1.meterial);
        System.out.println("Size :"+spoon1.noOfSpoon);
        System.out.println(spoon1.toString());
        System.out.println(spoon1.hashCode());


        System.out.println("==============================");

        Money money=new Money();
        money.moneyUse("Eduaction");
        System.out.println("Cost :"+money.type);
        System.out.println("Shape :"+money.moneyFor);
        System.out.println("Size :"+money.moneyInCrore);
        System.out.println(spoon.toString());
        System.out.println(spoon.hashCode());


        Money money1=new Money();
        money1.moneyUse("Eduaction");
        System.out.println("Cost :"+money1.type);
        System.out.println("Shape :"+money1.moneyFor);
        System.out.println("Size :"+money1.moneyInCrore);
        System.out.println(spoon.toString());
        System.out.println(spoon.hashCode());


        System.out.println("==============================");

        Geyser gey=new Geyser();
        gey.toHeat("new",3000,3);
        System.out.println(gey.toString());
        System.out.println( gey.hashCode());


        Geyser gey2=new Geyser();
        gey2.toHeat("new",3000,3);
        System.out.println(gey2.toString());
        System.out.println( gey2.hashCode());



        System.out.println("==============================");

        Bandli band=new Bandli();
        band.toFry("Circle",400,"iron");
        System.out.println( band.toString());
        System.out.println( band.hashCode());


        Bandli band1=new Bandli();
        band.toFry("Circle",400,"iron");
        System.out.println( band1.toString());
        System.out.println( band1.hashCode());

    }
}
