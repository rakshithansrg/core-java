public class Money {

    public String type;

    public String moneyFor;

    public int moneyInCrore;

    public Money()
    {
        System.out.println("Ruuning no-arg const in Money");
    }
 public void  moneyUse(String moneyFor)
 {
     this.moneyFor=moneyFor;
 }

    @Override
    public String toString() {
        return "Money[" + "Type :" +type+ "MoneyFor :" +moneyFor+ "MoneyInCrore :" +moneyInCrore+ "]";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
