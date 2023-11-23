public class ChromBrowser extends Browser{
    ChromBrowser()
    {
        System.out.println("no arg const in ChromBrowser");
    }
    @Override
    void settings()
    {
        System.out.println("Running Settings in ChromBrowser");
    }
    @Override
    void displayHistory()
    {
        System.out.println("Running displayHistory in ChromBrowser");
    }
}
