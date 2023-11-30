package com.AS.Method;



public class Guitor {
    public int id;
    public int price;
    public String material;

    public Guitor(int id, int price, String material) {
        this.id = id;
        this.price = price;
        this.material = material;
        System.out.println("String ,int ,int :" + id + "," + price + "," + material);
    }

    @Override
    public boolean equals(Object obj)
    {
        Guitor leftSide=this;
        if(obj!=null)
        {

            if(obj instanceof Object)
            {
                Guitor rightSide=(Guitor)obj;
                if(leftSide.id==rightSide.id && leftSide.price==rightSide.price)
                {
                    System.out.println("All the properties are same");
                    return true;
                }
                else
                {
                    System.err.println("not same");
                }
            }
            else
            {
                System.err.println("not same");
            }
        }
        else
        {
            System.err.println("obj is Null");;
        }

        return false;
    }
}









