<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<html>
    <head>
    	<!-- 데코레이터를 적용할 페이지의 헤더 -->
        <decorator:head />
      
    </head>
    <body>
    
    <!-- decorators.xml의 등록된 네임 admin_top을 불러옴 -->
    <page:applyDecorator name ="admin_top"/>
    
    <hr/>
    
    <!-- 데코레이터를 적용할 페이지의 내용을 담을곳 -->
    <decorator:body />
    
    <hr/>
    <!-- decorators.xml의 등록된 네임 admin_bottom을 불러옴 -->
    <page:applyDecorator name ="admin_bottom"/>
    </body>
</html>