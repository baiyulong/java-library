package io.github.baiyulong.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
@Getter
@AllArgsConstructor
public enum CommonError implements ErrorDefinition {
    /**
     * Common error template
     */
    ERROR(1000, "%s");

    private final int code;
    private final String messageTemplate;
}
