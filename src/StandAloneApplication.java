public class StandAloneApplication extends  Application{
    int size;
    String compatibleWith;
    StandAloneApplicationOs os;

    StandAloneApplication()
    {
        System.out.println("no arg const in Stand Alone application");
    }
    StandAloneApplication(int size,String compatibleWith,StandAloneApplicationOs os,int id,String name,ApplicationType type,float version,String developer,int date)
    {
        super( id, name, type, version, developer, date);
        this.size=size;
        this.compatibleWith=compatibleWith;
        this.os=os;
    }
    void consumerMemory()
    {
        System.out.println("Running Consumer Memory in Stand Alone Application");
    }
    void consumeInternet()
    {
        System.out.println("Running consumeInternet in Stand Alone Application");
    }



}
