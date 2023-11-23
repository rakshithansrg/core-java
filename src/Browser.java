public class Browser extends StandAloneApplication{

    String[] downloads;
    String[] browserHistorySites;
    void setBrowser(String[] downloads, String[] browserHistorySites)
    {
        this.downloads=downloads;
        this.browserHistorySites=browserHistorySites;
        System.out.println("***********Downloads***********");
        for (int i = 0; i <downloads.length; i++)
        {
            String info = downloads[i];
            System.out.println("downloads with index=" + i + "\tNames=" + info);
        }
        System.out.println("***********browserHistorySites***********");
        for (int i = 0; i <browserHistorySites.length; i++)
        {
            String info = browserHistorySites[i];
            System.out.println("browserHistorySites with index=" + i + "\tNames=" + info);
        }

    }

    void settings()
    {
        System.out.println("Running Settings in Browser");
    }
    void displayHistory()
    {
        System.out.println("Running displayHistory in Browser");
    }



}
