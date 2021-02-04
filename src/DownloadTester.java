public class DownloadTester {
    public static void main(String[] args) {


        DownloadInfo dL1 = new DownloadInfo("Hey Jude");
        DownloadInfo dL2 = new DownloadInfo("Soul Sister");
        DownloadInfo dL3 = new DownloadInfo("Aqualung");

        MusicDownloads webMusicA = new MusicDownloads(dL1, dL2, dL3);
        System.out.println(webMusicA.toString());

        webMusicA.updateDownloads("Hey Jude", "Aqualung");
        webMusicA.updateDownloads("Hey Jude", "Soul Sister");
        webMusicA.updateDownloads("Aqualung", "Aqualung");
        webMusicA.updateDownloads("Aqualung", "Hey Jude");

        System.out.println(webMusicA);
    }

}
