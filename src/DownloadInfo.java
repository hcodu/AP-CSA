public class DownloadInfo {
    //attributes title as string, timesDownloaded as integer
    public String title;
    public int times;

    public DownloadInfo(String t){
        //initialize both of the attributes, initial value for timesDownloaded is 0;
        title = t;
        times = 0;
    }

    public String getTitle( ) {
        //complete this please
        return title;
    }

    public void incrementTimesDownloaded(){
        //complete this please
        times++;
    }

    //This added method is to help you test and debug
    public int getTimesDownloaded(){
        return times;
    }

}
