package io.github.baiyulong.common.error;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
class ErrorHandlerTest {

    @Test
    void addError() {
        ErrorHandler handler1 = ErrorHandler.INSTANCE;
        handler1.addError(CommonError.ERROR.get("Error message 1"));
        ErrorHandler handler2 = ErrorHandler.INSTANCE;
        handler2.addError(CommonError.ERROR.get());

        Assertions.assertEquals(handler1, handler2);
        Assertions.assertEquals(handler1.getErrors().size(), 2);
    }
}