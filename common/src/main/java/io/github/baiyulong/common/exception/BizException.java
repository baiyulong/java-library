package io.github.baiyulong.common.exception;

import io.github.baiyulong.common.error.BizError;
import lombok.Getter;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
@Getter
public class BizException extends RuntimeException {
    private final BizError error;

    public BizException(BizError error) {
        super(error.getLongMessage());
        this.error = error;
    }
}
