package cn.iocoder.yudao.framework.common.util.custom;

/**
 * @description:
 * @author: LaoSan
 * @create: 2024-09-24 17:39
 **/

public class MyExceptionUtil {
    public static String getExceptionDetail(Throwable t) {
        // 获取异常类型
        String exceptionType = t.getClass().getName();

        // 获取异常消息
        String message = t.getMessage();

        // 获取堆栈跟踪
        StackTraceElement[] stackTrace = t.getStackTrace();

        // 记录异常信息
        StringBuilder sb = new StringBuilder();
        sb.append("Exception Type: ").append(exceptionType).append("\n");
        sb.append("Message: ").append(message).append("\n");
        sb.append("Stack Trace:\n");

        for (StackTraceElement element : stackTrace) {
            sb.append(element.toString()).append("\n");
        }
        return sb.toString();
    }
}
