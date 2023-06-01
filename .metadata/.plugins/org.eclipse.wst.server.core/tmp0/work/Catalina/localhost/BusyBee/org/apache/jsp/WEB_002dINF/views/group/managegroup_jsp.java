/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-03-17 15:42:24 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views.group;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import mul.cam.a.dto.UserDto;

public final class managegroup_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("mul.cam.a.dto.UserDto");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


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
      out.write("    \n");

	UserDto login = (UserDto) session.getAttribute("login");
	String id = login.getId();
	
	String group_code = (String) request.getAttribute("group_code");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta charset=\"UTF-8\">\n");
      out.write("<title>Insert title here</title>\n");
      out.write("<!-- AJAX -->\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div>\n");
      out.write("<h3>그룹 정보 관리</h3>\n");
      out.write("<table>\n");
      out.write("	<thead>\n");
      out.write("	<tr>\n");
      out.write("		<th>그룹코드</th>\n");
      out.write("		<th>그룹생성일</th>\n");
      out.write("		<th>그룹이름</th>\n");
      out.write("		<th>그룹정보</th>\n");
      out.write("	</tr>\n");
      out.write("	</thead>\n");
      out.write("	<tbody id=\"tBody1\">\n");
      out.write("	</tbody>\n");
      out.write("</table>\n");
      out.write("<br><br>\n");
      out.write("<hr>\n");
      out.write("\n");
      out.write("<h3>그룹 구성원 관리</h3>\n");
      out.write("<h5>기존 구성원 관리</h5>\n");
      out.write("<table>\n");
      out.write("	<thead>\n");
      out.write("	<tr>\n");
      out.write("		<th>번호</th>\n");
      out.write("		<th>이름(ID)</th>\n");
      out.write("		<th>email</th>\n");
      out.write("		<th>핸드폰번호</th>\n");
      out.write("		<th>가입일</th>\n");
      out.write("	</tr>\n");
      out.write("	</thead>\n");
      out.write("	<tbody id=\"tBody2\">\n");
      out.write("	</tbody>\n");
      out.write("</table>\n");
      out.write("<br><br>\n");
      out.write("\n");
      out.write("<h5>새 구성원 추가</h5>\n");
      out.write("초대 ID : <input type=\"text\" id=\"wantId\" maxlength=\"12\">\n");
      out.write("<h6>아이디는 공백 없이, 영문 대소문자 및 숫자를 포함하여 12자 이내입니다.</h6>\n");
      out.write("초대 메세지 : <input type=\"text\" id=\"wantTo_Msg\">\n");
      out.write("<input type=\"button\" value=\"그룹초대\" onclick=\"go_checkDupl()\">\n");
      out.write("<table border=\"1\">\n");
      out.write("	<thead>\n");
      out.write("	<tr>\n");
      out.write("		<th>이름(ID)</th>\n");
      out.write("		<th>email</th>\n");
      out.write("		<th>핸드폰번호</th>\n");
      out.write("		<th>BusyBee 가입일</th>\n");
      out.write("	</tr>\n");
      out.write("	</thead>\n");
      out.write("	<tbody id=\"tBody3\">\n");
      out.write("	</tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("$(document).ready(function(){\n");
      out.write("	\n");
      out.write("	// 그룹 정보\n");
      out.write(" 	$.ajax({\n");
      out.write("		url:\"singleGroup.do\",\n");
      out.write("		type:\"get\",\n");
      out.write("		data:{\"group_code\":'");
      out.print(group_code);
      out.write("'},\n");
      out.write("		success:function(data){\n");
      out.write("			if(data!=null && data!=\"\") {\n");
      out.write("				var tableTd = \"\";\n");
      out.write("				$(\"#tBody1\").html('');\n");
      out.write("				tableTd += '<tr>'\n");
      out.write("							+ \"<td><input type='text' readonly='readonly' value=\" + data.group_code + \"></td>\"\n");
      out.write("							+ \"<td><input type='text' readonly='readonly' value=\" + data.regidate.substr(0,10) + \"></td>\"\n");
      out.write("							+ \"<td><input type='text' id='group_name' value='\" + data.group_name + \"'></td>\"\n");
      out.write("							+ \"<td><input type='text' id='group_info' value='\" + data.group_info + \"'></td>\"\n");
      out.write("							+ \"<td><button type='button' onclick='go_groupUpd()'>수정</button>\"\n");
      out.write("						+ '</tr>';\n");
      out.write("				$(\"#tBody1\").append(tableTd);\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error:function(){\n");
      out.write("			alert('Aj1 error');\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write(" 	\n");
      out.write("	// 기존 그룹원\n");
      out.write(" 	$.ajax({\n");
      out.write("		url:\"allGroupMem.do\",\n");
      out.write("		type:\"get\",\n");
      out.write("		data:{\"group_code\":'");
      out.print(group_code);
      out.write("'},\n");
      out.write("		success:function(data){\n");
      out.write("			if(data!=null && data!=\"\") {\n");
      out.write("				var tableTd = \"\";\n");
      out.write("				var count = 1;\n");
      out.write("				for(var i=0; i<data.length; i++){\n");
      out.write("					$(\"#tBody2\").html('');\n");
      out.write("					tableTd += '<tr>'\n");
      out.write("								+ '<td>' + count + '</td>'\n");
      out.write("								+ '<td>' + data[i].name +'(' + data[i].id + ')' + '</td>'\n");
      out.write("								+ '<td>' + data[i].email + '</td>';\n");
      out.write("					if(data[i].phone_public==null) {\n");
      out.write("						tableTd += '<td>비공개</td>';\n");
      out.write("					} else {\n");
      out.write("						tableTd += '<td>' + data[i].phone + '</td>';\n");
      out.write("					}\n");
      out.write("						tableTd += '<td>' + data[i].regidate.substr(0,10) + '</td>'\n");
      out.write("								+ \"<td><button type='button' onclick=\"+ \"location.href='outGroupMem.do?group_code=\"\n");
      out.write("									+ data[i].group_code + \"&id=\" + data[i].id + \"'>\"\n");
      out.write("									+ \"추방</button>\"\n");
      out.write("								+ \"</td>\"\n");
      out.write("								+ \"<td><button type='button' onclick=\"+ \"location.href='changeleader.do?group_code=\"\n");
      out.write("									+ data[i].group_code + \"&id=\" + data[i].id + \"&name=\" + data[i].name + \n");
      out.write("									\"&leader_id=\" +'");
      out.print(id);
      out.write("' + \"'>\"\n");
      out.write("									+ \"리더 위임</button>\"\n");
      out.write("							+ \"</td>\"\n");
      out.write("							+ '</tr>';\n");
      out.write("					count++;\n");
      out.write("				}\n");
      out.write("				$(\"#tBody2\").append(tableTd);\n");
      out.write("			} else if(data==null || data==\"\") {\n");
      out.write("				$(\"#tBody2\").html('');\n");
      out.write("				var tableTdNone = '<tr><td>그룹원이 없습니다.</td></tr>';\n");
      out.write("				$(\"#tBody2\").append(tableTdNone);\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error:function(){\n");
      out.write("			alert('Aj2 error');\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("});\n");
      out.write("\n");
      out.write("$(\"#wantId\").keyup(function(e){\n");
      out.write("	\n");
      out.write("	let key = e.key || e.keyCode;\n");
      out.write("	\n");
      out.write("	// ID 유효성 검사\n");
      out.write("	var idValid = /^[a-zA-z0-9]{0,12}$/;\n");
      out.write("	\n");
      out.write("	if($(\"#wantId\").val()==\"\") {\n");
      out.write("		$(\"#tBody3\").html('');\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	if(key==\" \" || key==32) {\n");
      out.write("		$(\"#wantId\").val('');\n");
      out.write("		$(\"#tBody3\").html('');\n");
      out.write("		var tableTdNone = '<tr><td>아이디에는 공백이 들어갈 수 없습니다.</td></tr>';\n");
      out.write("		$(\"#tBody3\").append(tableTdNone);\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	if(!idValid.test($(\"#wantId\").val())) {\n");
      out.write("		$(\"#wantId\").val('');\n");
      out.write("		$(\"#tBody3\").html('');\n");
      out.write("		var tableTdNone = '<tr><td>아이디에는 영문 대소문자, 숫자만 들어갈 수 있습니다.</td></tr>';\n");
      out.write("		$(\"#tBody3\").append(tableTdNone);\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("		\n");
      out.write("	$.ajax({\n");
      out.write("		url:\"selectUser.do\",\n");
      out.write("		type:\"get\",\n");
      out.write("		data:{\"id\":$(\"#wantId\").val()},\n");
      out.write("		\n");
      out.write("		success:function(data){\n");
      out.write("			if(data!=null && data!=\"\") {\n");
      out.write("				var tableTd = \"\";\n");
      out.write("				$(\"#tBody3\").html('');\n");
      out.write("				tableTd += '<tr>'\n");
      out.write("							+ '<td>' + data.name +'(' + data.id + ')' + '</td>'\n");
      out.write("							+ '<td>' + data.email + '</td>';\n");
      out.write("				if(data.phone_public==null) {\n");
      out.write("						tableTd += '<td>비공개</td>';\n");
      out.write("				} else {\n");
      out.write("						tableTd += '<td>' + data.phone + '</td>';\n");
      out.write("							}							\n");
      out.write("				tableTd +=	'<td>' + data.regidate.substr(0,10) + '</td>'\n");
      out.write("							+ '</tr>';\n");
      out.write("				$(\"#tBody3\").append(tableTd);\n");
      out.write("			} else if(data==null || data==\"\") {\n");
      out.write("				$(\"#tBody3\").html('');\n");
      out.write("				var tableTdNone = '<tr><td>정확한 ID를 입력해주세요.</td></tr>';\n");
      out.write("				$(\"#tBody3\").append(tableTdNone);\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error:function(){\n");
      out.write("			alert('error');\n");
      out.write("		}\n");
      out.write("		\n");
      out.write("	});\n");
      out.write("	\n");
      out.write("});\n");
      out.write("\n");
      out.write("function go_groupUpd() {\n");
      out.write("	location.href=\"updGroup.do?group_code=\" + '");
      out.print(group_code);
      out.write("' + \"&group_name=\" + $(\"#group_name\").val()\n");
      out.write("			+ \"&group_info=\" + $(\"#group_info\").val();\n");
      out.write("}\n");
      out.write("\n");
      out.write("function go_checkDupl(){\n");
      out.write("	\n");
      out.write("	if($.trim($(\"#wantId\").val())==\"\") {\n");
      out.write("		alert('초대 ID를 입력해주세요.');\n");
      out.write("		return;\n");
      out.write("	}\n");
      out.write("	\n");
      out.write("	$.ajax({\n");
      out.write("		url:\"inv_checkDupl.do\",\n");
      out.write("		type:\"get\",\n");
      out.write("		data:{\"id\":$(\"#wantId\").val(), \"group_code\":'");
      out.print(group_code);
      out.write("'},\n");
      out.write("		success:function(msg){\n");
      out.write("			if(msg!=null && msg!=\"\") {\n");
      out.write("				if(msg==\"Already\"){\n");
      out.write("					alert('이미 가입된 멤버입니다.');\n");
      out.write("					$(\"#wantId\").val('');\n");
      out.write("					$(\"#wantTo_Msg\").val('');\n");
      out.write("					$(\"#tBody3\").html('');\n");
      out.write("				} else if(msg==\"WAIT\") {\n");
      out.write("					alert('승인 대기중인 멤버입니다.');\n");
      out.write("					$(\"#wantId\").val('');\n");
      out.write("					$(\"#wantTo_Msg\").val('');\n");
      out.write("					$(\"#tBody3\").html('');\n");
      out.write("				} else {\n");
      out.write("					location.href=\"inv_addNoti.do?to_id=\"+$(\"#wantId\").val()+\"&from_id=\"+'");
      out.print(id);
      out.write("'\n");
      out.write("							+\"&group_code=\"+'");
      out.print(group_code);
      out.write("'+\"&regimsg=\" + $(\"#wantTo_Msg\").val();\n");
      out.write("				}\n");
      out.write("			} else {\n");
      out.write("				alert('초대ID를 다시 확인해주세요.');\n");
      out.write("				$(\"#wantId\").val('');\n");
      out.write("			}\n");
      out.write("		},\n");
      out.write("		error:function(){\n");
      out.write("			alert('error');\n");
      out.write("		}\n");
      out.write("	});\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
}