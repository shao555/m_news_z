/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/7.0.47
 * Generated at: 2020-11-07 02:32:09 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
        throws java.io.IOException, javax.servlet.ServletException {

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Title</title>\r\n");
      out.write("    <script src=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/js/jquery-1.12.4.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(document).ready(function () {\r\n");
      out.write("            alert(\"asdfasf\");\r\n");
      out.write("            //id选择器  失去焦点事件\r\n");
      out.write("            $(\"#select\").blur(checkSelect);\r\n");
      out.write("            $(\"#title\").blur(function () {\r\n");
      out.write("                    var title = $(\"#title\").val();\r\n");
      out.write("                    alert(title);\r\n");
      out.write("                }\r\n");
      out.write("            );\r\n");
      out.write("            $(\"#mytab\").submit(function () {\r\n");
      out.write("                if (!checkSelect() || !checkTitle()) {\r\n");
      out.write("                    return false;\r\n");
      out.write("                } else {\r\n");
      out.write("                    alert(\"修改成功\");\r\n");
      out.write("                    return true;\r\n");
      out.write("                }\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("        function ba() {\r\n");
      out.write("            history.back();\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        function checkSelect() {\r\n");
      out.write("            var select = $(\"#select\").val();\r\n");
      out.write("            if (select == null || select == \"\" || select == \"0\") {\r\n");
      out.write("                alert(\"分类不能为空\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        function checkTitle() {\r\n");
      out.write("            var title = $(\"#title\").val();\r\n");
      out.write("            if (title == null || title == \"\") {\r\n");
      out.write("                alert(\"标题不能为空\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            return true;\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<form action=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${pageContext.request.contextPath}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("/update.do\" method=\"get\" id=\"mytab\">\r\n");
      out.write("    <table width=\"600\" align=\"center\" border=\"1px\">\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td align=\"center\" colspan=\"2\"><h1>更新新闻内容</h1></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>新闻编号</td>\r\n");
      out.write("            <td>");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\r\n");
      out.write("                <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${n.id}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null, false));
      out.write("\"></td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>新闻分类</td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <select name=\"select\" id=\"select\" >\r\n");
      out.write("                    <option value=\"0\">全部</option>\r\n");
      out.write("                    <option value=\"1\">军事</option>\r\n");
      out.write("                    <option value=\"2\">国际</option>\r\n");
      out.write("                    <option value=\"3\">国内</option>\r\n");
      out.write("                </select>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>新闻标题(*)</td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"title\" id=\"title\" value=\"\">\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>新闻摘要</td>\r\n");
      out.write("            <td>\r\n");
      out.write("                ");
      out.write("\r\n");
      out.write("                <textarea name=\"summary\" id=\"summary\">\r\n");
      out.write("\r\n");
      out.write("                </textarea>\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td>作者</td>\r\n");
      out.write("            <td>\r\n");
      out.write("                <input type=\"text\" name=\"author\" id=\"author\" value=\"\">\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("        <tr>\r\n");
      out.write("            <td align=\"center\" colspan=\"2\">\r\n");
      out.write("                <input align=\"center\" type=\"submit\" value=\"提交\">\r\n");
      out.write("                <input align=\"center\" type=\"button\" value=\"返回\" onclick=\"ba()\">\r\n");
      out.write("            </td>\r\n");
      out.write("        </tr>\r\n");
      out.write("    </table>\r\n");
      out.write("</form>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
