public class MultiMedia extends StandAloneApplication{
    String[] favouriets;
    void setFav(String [] favouriets)
    {
        this.favouriets=favouriets;
        System.out.println("*********** Favouriets ***********");
        for (int i = 0; i <favouriets.length; i++)
        {
            String info = favouriets[i];
            System.out.println("favouriets with index=" + i + "\tNames=" + info);
        }
    }
    void play()
    {
        System.out.println("Running play in Stand Alone Application");
    }
    void delete()
    {
        System.out.println("Running delete in Stand Alone Application");
    }
    void dowload()
    {
        System.out.println("Running dowload in Stand Alone Application");
    }
}
