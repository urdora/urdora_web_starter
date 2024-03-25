package com.urdora.bee.web.errorcodes;

import java.text.MessageFormat;

public interface IBeeErrorCode {
    String getErrorMessage();

    default String getErrorCodeStr() {
        return this.toString();
    }

    default String getErrorMessage(Object... params) {
        return MessageFormat.format(this.getErrorMessage(), params);
    }
}
