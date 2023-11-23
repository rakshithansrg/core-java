public class EdgeBrowser extends Browser{
    EdgeBrowser()
    {
        System.out.println("no arg const in EdgeBrowser");
    }
    @Override
    void settings()
    {
        System.out.println("Running Settings in EdgeBrowser");
    }
    @Override
    void displayHistory()
    {
        System.out.println("Running displayHistory in EdgeBrowser");
    }

}
