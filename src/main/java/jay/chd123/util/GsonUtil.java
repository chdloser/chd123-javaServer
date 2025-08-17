package jay.chd123.util;

import com.google.gson.Gson;
import lombok.Getter;

public class GsonUtil {
    @Getter
    private static final Gson gson;
    static {
        gson = new Gson();
    }
    private GsonUtil(){}
}
