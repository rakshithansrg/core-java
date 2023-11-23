public class WebApplication extends Application{
    String[] supportedBrowsers;
    boolean free;
    WebApplication()
    {
        System.out.println("no arg const in WebApplication");
    }
    WebApplication(boolean free,int id,String name,ApplicationType type,float version,String developer,int date)
    {
        super(id, name, type, version, developer, date);
        this.free=free;
    }
    void support(String[] supportedBrowsers)
    {
        this.supportedBrowsers=supportedBrowsers;
        System.out.println("***** supported Browsers *****");
        for (int i = 0; i <supportedBrowsers.length; i++)
        {
            String info = supportedBrowsers[i];
            System.out.println("supportedBrowsers with index=" + i + "\tNames=" + info);
        }

    }
    void connectioInternet()
    {
        System.out.println("Running connectioInternet in WebApplication ");
    }
    void sendUsage()
    {
        System.out.println("Running sendUsage in WebApplication ");
    }


}
