package lk.ijse.alpha.jdbc;

import lk.ijse.beta.zip.api.MyZip;
import lk.ijse.beta.zip.security.MySecurityConfig;
import lk.ijse.beta.zip.util.AppUtils;

public class AppInitializer {

    public static void main(String[] args) {
        new MyZip();
        new AppUtils();
        new MySecurityConfig();
    }
}
