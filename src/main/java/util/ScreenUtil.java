package util;

import java.net.URL;
import java.util.Objects;

public class ScreenUtil {

    public static URL getURL(String path) {
        return Objects.requireNonNull(ScreenUtil.class.getClassLoader().getResource(path));
    }
}
