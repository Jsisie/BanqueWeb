/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.0.23
 * Generated at: 2022-12-16 20:57:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import java.util.ArrayList;

public final class JListeOperations_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar", Long.valueOf(1671129894517L));
    _jspx_dependants.put("jar:file:/D:/Programs/Java/JEE/BanqueWeb/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/BanqueWeb/WEB-INF/lib/jakarta.servlet.jsp.jstl-3.0.1.jar!/META-INF/c.tld", Long.valueOf(1664446278000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("java.util.ArrayList");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("	<meta charset=\"UTF-8\">\n");
      out.write("	<title>Insert title here</title>\n");
      out.write("	<style>\n");
      out.write("		td,\n");
      out.write("		th {\n");
      out.write("		    border: 1px solid rgb(190, 190, 190);\n");
      out.write("		    padding: 10px;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		td {\n");
      out.write("		    text-align: center;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		tr:nth-child(even) {\n");
      out.write("		    background-color: #eee;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		th[scope=\"col\"] {\n");
      out.write("		    background-color: #696969;\n");
      out.write("		    color: #fff;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		th[scope=\"row\"] {\n");
      out.write("		    background-color: #d7d9f2;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		caption {\n");
      out.write("		    padding: 10px;\n");
      out.write("		    caption-side: bottom;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		table {\n");
      out.write("		    border-collapse: collapse;\n");
      out.write("		    border: 2px solid rgb(200, 200, 200);\n");
      out.write("		    letter-spacing: 1px;\n");
      out.write("		    font-family: sans-serif;\n");
      out.write("		    font-size: .8rem;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		.errorDiv {\n");
      out.write("			color: red;\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("		.msgDiv {\n");
      out.write("			color: blue;	\n");
      out.write("		}\n");
      out.write("	</style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	<div class=\"compteTables\">\n");
      out.write("		<div class=\"infosCompteTable\" align=\"center\"> \n");
      out.write("			<table>\n");
      out.write("				<tr>\n");
      out.write("					<th>N° de compte</th>\n");
      out.write("					<th>Nom</th>\n");
      out.write("					<th>Prénom</th>\n");
      out.write("					<th>Solde</th>\n");
      out.write("				</tr>\n");
      out.write("				<tr>\n");
      out.write("					<td>");
      out.print(session.getAttribute("NoDeCompte"));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(session.getAttribute("nom"));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(session.getAttribute("prenom"));
      out.write("</td>\n");
      out.write("					<td>");
      out.print(session.getAttribute("solde"));
      out.write("</td>\n");
      out.write("				</tr>\n");
      out.write("			</table>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"operationsListeTable\" align=\"center\">\n");
      out.write("				<table>\n");
      out.write("					<tr>\n");
      out.write("						<th>Date</th>\n");
      out.write("						<th>Opération:</th>\n");
      out.write("						<th>Valeur</th>\n");
      out.write("					</tr>\n");
      out.write("					");
      if (_jspx_meth_c_005fforEach_005f0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("				</table>\n");
      out.write("		</div>\n");
      out.write("		<form class=\"operationForm\" method=\"post\">\n");
      out.write("			<div id=\"retourButton\" align=\"center\">\n");
      out.write("				<input id=\"Demande\" name=\"Demande\" type=\"submit\" value=\"Retour\">\n");
      out.write("			</div>\n");
      out.write("		</form>\n");
      out.write("	</div>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fforEach_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_005fforEach_005f0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    boolean _jspx_th_c_005fforEach_005f0_reused = false;
    try {
      _jspx_th_c_005fforEach_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fforEach_005f0.setParent(null);
      // /JListeOperations.jsp(81,5) name = var type = java.lang.String reqTime = false required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setVar("operation");
      // /JListeOperations.jsp(81,5) name = items type = jakarta.el.ValueExpression reqTime = true required = false fragment = false deferredValue = true expectedTypeName = java.lang.Object deferredMethod = false methodSignature = null
      _jspx_th_c_005fforEach_005f0.setItems(new org.apache.jasper.el.JspValueExpression("/JListeOperations.jsp(81,5) '${opParDate}'",_jsp_getExpressionFactory().createValueExpression(_jspx_page_context.getELContext(),"${opParDate}",java.lang.Object.class)).getValue(_jspx_page_context.getELContext()));
      int[] _jspx_push_body_count_c_005fforEach_005f0 = new int[] { 0 };
      try {
        int _jspx_eval_c_005fforEach_005f0 = _jspx_th_c_005fforEach_005f0.doStartTag();
        if (_jspx_eval_c_005fforEach_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write("\n");
            out.write("						<tr>\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operation[1]}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operation[3]==\"+\"?\n								\"Crédit (+)\":\n								\"Débit (-)\"\n							}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>\n");
            out.write("							<td>");
            out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${operation[4]}", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
            out.write("</td>					\n");
            out.write("						</tr>\n");
            out.write("					");
            int evalDoAfterBody = _jspx_th_c_005fforEach_005f0.doAfterBody();
            if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fforEach_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return true;
        }
      } catch (java.lang.Throwable _jspx_exception) {
        while (_jspx_push_body_count_c_005fforEach_005f0[0]-- > 0)
          out = _jspx_page_context.popBody();
        _jspx_th_c_005fforEach_005f0.doCatch(_jspx_exception);
      } finally {
        _jspx_th_c_005fforEach_005f0.doFinally();
      }
      _005fjspx_005ftagPool_005fc_005fforEach_0026_005fvar_005fitems.reuse(_jspx_th_c_005fforEach_005f0);
      _jspx_th_c_005fforEach_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fforEach_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fforEach_005f0_reused);
    }
    return false;
  }
}
