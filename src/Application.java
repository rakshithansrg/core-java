import com.sun.org.apache.bcel.internal.generic.FLOAD;

public class Application {

    int id;
    String name;
    ApplicationType type;
    float version;
    String developer;
    int date;

    Application()
    {
        System.out.println("No argument const in Application");
    }

    Application(int id,String name,ApplicationType type,float version,String developer,int date)
    {
        this.id=id;
        this.name=name;
        this.type=type;
        this.version=version;
        this.developer=developer;
        this.date=date;
    }
    void run()
    {
        System.out.println("running run in Application");
    }
    void stop()
    {
        System.out.println("running stop in Application");
    }
    void execute()
    {
        System.out.println("running execute in Application");
    }
    void collectInfo()
    {
        System.out.println("running Collect Info in Application");
    }
    void displayInfo()
    {
        System.out.println("running Display info in Application");
    }

}
