package jay.chd123.global.customException;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException{
    private final Integer code;

    public BusinessException(Integer code, String message) {
        super(message);
        this.code = code;
    }

}
