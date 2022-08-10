package xray;

public class MainClass {
    public static void main(String[] args) {
        XrayAPI xrayAPI = new XrayAPI();
        String accessToken = xrayAPI.login();
        accessToken = accessToken.replaceAll("\"", "");
        xrayAPI.uploadTestExecution(accessToken);
    }
}