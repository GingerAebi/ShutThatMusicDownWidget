package jeabong.nhnnext.org.shutthatmusicnotiwidget;

/**
 * Created by JaeBong on 16. 2. 20..
 */
public class CafeInfo {
    private String logoImageName;
    private String cafeName;

    public CafeInfo(String cafeName, String logoImageName) {
        this.cafeName = cafeName;
        this.logoImageName = logoImageName;
    }

    public String getCafeName() {
        return cafeName;
    }

    public String getLogoImageName() {
        return logoImageName;
    }
}
