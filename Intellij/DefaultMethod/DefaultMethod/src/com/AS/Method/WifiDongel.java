package com.AS.Method;

public class WifiDongel {
    public String brand;
    public  int transferRate;
     public int itemWeight;

     WifiDongel(String brand,int transferRate,int itemWeight)
     {
         this.brand=brand;
         this.transferRate=transferRate;
         this.itemWeight=itemWeight;
         System.out.println("String,int,int :"+brand+","+transferRate+","+itemWeight);
     }

    @Override
    public boolean equals(Object obj) {
         WifiDongel leftSide=this;

         if(obj!=null)
         {
             if(obj instanceof Object)
             {
                 WifiDongel reightSide=(WifiDongel)obj;
                 if(leftSide.itemWeight==reightSide.itemWeight && leftSide.transferRate==reightSide.transferRate)
                 {
                     System.out.println("Properties are Equal");
                     return true;
                 }
                 else
                 {
                     System.out.println("properties are not same");
                 }

             }
             else
             {
                 System.err.println("Not same");
             }
         }
         else
         {
             System.err.println("obj is null");
         }
        return false;
    }
}
