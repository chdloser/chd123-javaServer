package jay.chd123.global.entity;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

@Data
public class BaseViewParam {
    private Integer id;
    @SerializedName(value = "code",alternate = {"problemId"})
    private String code;
}
