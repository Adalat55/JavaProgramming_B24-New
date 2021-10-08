package office_hours.practice_09_08_2021;

public class websites {
    public static void main(String[] args) {
        String [] websites = {"bing.com", "wikimedia.org", "twitter.com", "amazonaws.com", "japanpost.jp", "mysql.com", "nasa.gov", "linkedin.com", "ucla.edu", "github.io", "spotify.com", "mozilla.org", "nba.com", "comcast.net", "tamu.edu", "utexas.edu"};

        int com=0, org = 0, edu=0, other=0;

        for(String eachSite: websites){
            if(eachSite.endsWith(".com")){
                com++;
            }
            else if(eachSite.endsWith(".org")){
                org++;
            }
            else if(eachSite.endsWith(".edu")) {
                edu++;
            }
            else{
                other++;
            }
        }
        System.out.println(".com: "+com);
        System.out.println(".org: "+org);
        System.out.println(".edu: "+edu);
        System.out.println("other: "+other);



    }
}
