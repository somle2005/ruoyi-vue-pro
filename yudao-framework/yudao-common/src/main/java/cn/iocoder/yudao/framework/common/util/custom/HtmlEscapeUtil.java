package cn.iocoder.yudao.framework.common.util.custom;

/**
 * @description:
 * @author: LaoSan
 * @create: 2025-03-18 16:51
 **/
public class HtmlEscapeUtil {


    /**
     * 将字符串中的HTML标签内的特殊字符转换为HTML实体
     * @param input 原始字符串
     * @return 转义后的HTML字符串
     */
    public static String escapeHtmlInTags(String input) {
        if (input == null) return null;

        StringBuilder sb = new StringBuilder();
        boolean insideTag = false;

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);

            if (c == '<') {
                insideTag = true;
                sb.append(c);
            } else if (c == '>') {
                insideTag = false;
                sb.append(c);
            } else if (insideTag) {
                switch (c) {
                    case '&':
                        sb.append("&amp;");
                        break;
                    case '<':
                        sb.append("&lt;");
                        break;
                    case '>':
                        sb.append("&gt;");
                        break;
                    case '"':
                        sb.append("&quot;");
                        break;
                    case '\'':
                        sb.append("&apos;");
                        break;
                    default:
                        sb.append(c);
                }
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}
