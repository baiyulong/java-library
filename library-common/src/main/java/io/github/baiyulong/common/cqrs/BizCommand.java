package io.github.baiyulong.common.cqrs;

import io.github.baiyulong.common.error.ErrorHandler;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
public class BizCommand {
    private transient final ErrorHandler errorHandler;

    public BizCommand() {
        this.errorHandler = new ErrorHandler();
    }

    public ErrorHandler handler() {
        return errorHandler;
    }
}
