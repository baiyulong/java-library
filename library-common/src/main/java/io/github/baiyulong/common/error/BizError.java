package io.github.baiyulong.common.error;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@EqualsAndHashCode(of = {"code", "message"})
public class BizError {
    private Integer code;
    private String message;
    private String longMessage;

    public BizError(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public BizError bind(Object... args) {
        if (args.length > 0) {
            this.message = String.format(message, args);
        }
        return this;
    }

    public BizError longMessage(String message) {
        this.longMessage = message;
        return this;
    }
}
