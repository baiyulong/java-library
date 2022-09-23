package io.github.baiyulong.common.error;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
@Getter
@AllArgsConstructor
public enum ErrorHandler {
    /**
     * Get a single instance
     */
    INSTANCE(new CopyOnWriteArraySet<>());
    private final CopyOnWriteArraySet<BizError> errors;

    public void addError(BizError error) {
        this.errors.add(error);
    }

    public void addErrors(Collection<BizError> errors) {
        this.errors.addAll(errors);
    }

    public boolean hasError() {
        return this.errors.size() > 0;
    }

    public boolean noError() {
        return !hasError();
    }
}
