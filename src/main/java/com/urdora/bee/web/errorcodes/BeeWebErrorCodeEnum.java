package com.urdora.bee.web.errorcodes;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum BeeWebErrorCodeEnum implements IBeeSysErrorCode {
    ERROR01("系统未知错误");

    private String errMsg;

    @Override
    public String getErrorMessage() {
        return this.errMsg;
    }
}
