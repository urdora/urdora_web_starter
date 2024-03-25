package com.urdora.bee.web.entry;

import com.urdora.bee.web.errorcodes.IBeeErrorCode;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(access = AccessLevel.PRIVATE)
public class BeeResponseEntity<T> {

    private String returnCode;

    private String errorMsg;

    private T body;

    public static <T> BeeResponseEntity<T> success(T body) {
        return BeeResponseEntity.<T>builder()
                .returnCode("ok")
                .body(body)
                .build();
    }

    public static <T> BeeResponseEntity<T> success() {
        return BeeResponseEntity.<T>builder()
                .returnCode("ok")
                .build();
    }

    public static <T> BeeResponseEntity<T> failed(IBeeErrorCode errorCode, Object... params) {
        return BeeResponseEntity.<T>builder()
                .returnCode(errorCode.getErrorCodeStr())
                .errorMsg(errorCode.getErrorMessage(params))
                .build();
    }

    @Override
    public String toString() {
        return "BeeResponseEntity{returnCode='" + this.returnCode + '\'' +
                ", errorMsg='" + this.errorMsg + '\'' +
                ", body=" + this.body + '}';
    }
}
