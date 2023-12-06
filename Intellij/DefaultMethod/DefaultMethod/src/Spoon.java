public class Spoon {

        public String meterial;
        public int cost;
        public int noOfSpoon;

        public Spoon() {
            System.out.println("no arg const");
        }

        public void toFeed(String meterial, int cost, int noOfSpoon) {
            this.cost = cost;
            this.meterial = meterial;
            this.noOfSpoon = noOfSpoon;
        }

        @Override
        public String toString() {
            return "Spoon{" + "Meterial='" + meterial + '\'' + ", cost=" + cost + ", No of Spoons=" + noOfSpoon + "}";
        }

        @Override
        public int hashCode() {
            System.out.println("hash code of spoon :" + System.identityHashCode(3)+"\n hashcode :"+super.hashCode());
            return super.hashCode();
        }
    }


