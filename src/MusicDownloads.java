public class MusicDownloads {

    private DownloadInfo dL1;
    private DownloadInfo dL2;
    private DownloadInfo dL3;
    private DownloadInfo dL4;

    public MusicDownloads() {
        dL1 = null;
        dL2 = null;
        dL3 = null;
        dL4 = null;
    }

    public MusicDownloads(DownloadInfo d1, DownloadInfo d2, DownloadInfo d3) {
        this.dL1 = d1;
        this.dL2 = d2;
        this.dL3 = d3;

    }

    public DownloadInfo getDownloadInfo(String title) {
        //this is part a of the FR
//search for the title, then return the downloadInfo object that has the title
        if (dL1.getTitle().equals(title)) {
            return dL1;
        } else if (dL2.getTitle().equals(title)) {
            return dL2;
        } else if (dL3.getTitle().equals(title)) {
            return dL3;
        }
        else  {
            return dL4;
        }
    }

    public void updateDownloads(String title1, String title2) {
        // this is part b of the FR
        //update dLs with information from titles, @param a list of song titles
        //increment the times downloaded by 1
        getDownloadInfo(title1).incrementTimesDownloaded();
        getDownloadInfo(title2).incrementTimesDownloaded();
    }

    //This added method is to help you test and debug
    public String toString() {
        String toReturn = "the list of download info: ";
        if (dL1 != null && dL2 != null && dL3 != null) {

            toReturn += dL1.getTitle() + " " + dL1.getTimesDownloaded() + " ";
            toReturn += dL2.getTitle() + " " + dL2.getTimesDownloaded() + " ";
            toReturn += dL3.getTitle() + " " + dL3.getTimesDownloaded() + " ";
        }
        return toReturn;
    }
}


