package io.github.baiyulong.common.response;

import io.github.baiyulong.common.error.BizError;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.concurrent.CopyOnWriteArraySet;

/**
 * @author YuLong.Bai
 * @version 0.1.0
 * @since 0.1.0
 **/
@Getter
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class BizResponse<T> {
    private boolean success;
    private T data;
    private final Collection<BizError> errors = new CopyOnWriteArraySet<>();
    private String requestId;

    private BizResponse(T data) {
        this.success = Boolean.TRUE;
        this.data = data;
    }

    private BizResponse(Collection<BizError> errors) {
        this.data = null;
        this.errors.addAll(errors);
    }

    private BizResponse(BizError error) {
        this.data = null;
        this.errors.add(error);
    }

    public static <R> BizResponse<R> build(R data) {
        return new BizResponse<>(data);
    }

    public static <R> BizResponse<R> build(Collection<BizError> errors) {
        return new BizResponse<>(errors);
    }

    public static <R> BizResponse<R> build(BizError error) {
        return new BizResponse<>(error);
    }

    public BizResponse<T> data(T data) {
        this.data = data;
        return this;
    }

    public BizResponse<T> error(Collection<BizError> errors) {
        this.errors.addAll(errors);
        return this;
    }

    public BizResponse<T> error(BizError error) {
        this.errors.add(error);
        return this;
    }

    public BizResponse<T> requestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
}
