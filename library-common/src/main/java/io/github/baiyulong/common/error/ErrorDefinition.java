package io.github.baiyulong.common.error;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
public interface ErrorDefinition {

    /**
     * Error Code
     *
     * @return int
     * @author YuLong.Bai
     * @since 0.1.0
     */
    int getCode();

    /**
     * Error Message
     *
     * @return java.lang.String
     * @author YuLong.Bai
     * @since 0.1.0
     */
    String getMessageTemplate();

    /**
     * Get a new error
     *
     * @return io.github.baiyulong.common.error.BizError
     * @author YuLong.Bai
     * @since 0.1.0
     */
    default BizError get() {
        return new BizError(getCode(), getMessageTemplate());
    }

    /**
     * Get a new error and bind params
     *
     * @param args java.lang.Object
     * @return io.github.baiyulong.common.error.BizError
     * @author YuLong.Bai
     * @since 0.1.0
     */
    default BizError get(Object... args) {
        return get().bind(args);
    }
}
