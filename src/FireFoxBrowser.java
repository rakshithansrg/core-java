public class FireFoxBrowser extends Browser{
    FireFoxBrowser()
    {
        System.out.println("no arg const in FireFoxBrowser");
    }
    @Override
    void settings()
    {
        System.out.println("Running Settings in FireFoxBrowser");
    }
    @Override
    void displayHistory()
    {
        System.out.println("Running displayHistory in FireFoxBrowser");
    }

}
