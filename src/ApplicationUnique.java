public class ApplicationUnique {
    public static void main(String... args)
    {
        System.out.println("Starting from main ApplicationUnique");
         Application app=new Application(12,"FaceBook",ApplicationType.SPREADSHEET,1.8f,"Raksha",13);
         app.run();
         app.stop();
         app.execute();
         app.collectInfo();
         app.displayInfo();
         System.out.println("ID :"+app.id);
         System.out.println("Name :"+app.name);
        System.out.println("Application type :"+app.type);
        System.out.println("Version :"+app.version);
        System.out.println("Developer :"+app.developer);
        System.out.println("Date :"+app.date);
        System.out.println("===================================");
        StandAloneApplication saa=new StandAloneApplication(30,"disk",StandAloneApplicationOs.MICROSOFTWINDOWS,12,"FaceBook",ApplicationType.SPREADSHEET,1.8f,"Raksha",13);
        System.out.println("Size :"+saa.size);
        System.out.println("Comapatible Wite :"+saa.compatibleWith);
        System.out.println("Disk :"+saa.os);
        System.out.println("ID :"+saa.id);
        System.out.println("Name :"+saa.name);
        System.out.println("Application type :"+saa.type);
        System.out.println("Version :"+saa.version);
        System.out.println("Developer :"+saa.developer);
        System.out.println("Date :"+saa.date);
        saa.consumerMemory();
        saa.consumeInternet();

        System.out.println("===================================");

        WebApplication wb=new WebApplication(true,12,"FaceBook",ApplicationType.SPREADSHEET,1.8f,"Raksha",13);
        System.out.println("Free :"+wb.free);
        System.out.println("ID :"+wb.id);
        System.out.println("Name :"+wb.name);
        System.out.println("Application type :"+wb.type);
        System.out.println("Version :"+wb.version);
        System.out.println("Developer :"+wb.developer);
        System.out.println("Date :"+wb.date);
        System.out.println("Support Browsers");
        String[] supp={"crome","google","firefox"};
        wb.support(supp);

        wb.connectioInternet();
        wb.sendUsage();

        System.out.println("===================================");

        Browser br=new Browser();
        String[] br1={"browser","website","local"};
        String[] br2={"web","site",".com",".mail"};
        br.setBrowser(br1,br2);
        br.settings();
        br.displayHistory();

        System.out.println("===================================");

        MultiMedia mm=new MultiMedia();
        String[] fav={"songs","img","videos"};
        mm.setFav(fav);
        mm.play();
        mm.delete();
        mm.dowload();

        System.out.println("===================================");

        ChromBrowser cb=new ChromBrowser();
        cb.settings();
        cb.displayHistory();
        System.out.println("===================================");
        EdgeBrowser eb=new EdgeBrowser();
        eb.settings();
        eb.displayHistory();
        System.out.println("===================================");
        FireFoxBrowser fb=new FireFoxBrowser();
        fb.displayHistory();
        fb.settings();

        System.out.println("===================================");
        System.out.println("Endnig main in Application Unique");



    }
}
