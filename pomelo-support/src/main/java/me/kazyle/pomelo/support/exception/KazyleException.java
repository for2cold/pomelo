package me.kazyle.pomelo.support.exception;

/**
 * <p>pomelo</p>
 * <p>
 * <b>KazyleException</b> is 基础异常，国际化
 * </p>
 *
 * @version 1.0
 * @since 1.0
 * Created by Kazyle on 2016/11/10 16:25
 */
public class KazyleException extends RuntimeException {

    private Object[] args;

    public KazyleException(Object[] args) {
        this.args = args;
    }

    public KazyleException(String message, Object[] args) {
        super(message);
        this.args = args;
    }

    public KazyleException(String message, Throwable cause, Object[] args) {
        super(message, cause);
        this.args = args;
    }

    public KazyleException(Throwable cause, Object[] args) {
        super(cause);
        this.args = args;
    }

    @Override
    public String getLocalizedMessage() {
        return super.getLocalizedMessage();
    }
}
