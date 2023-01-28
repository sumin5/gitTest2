<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="decorator" uri="http://www.opensymphony.com/sitemesh/decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>
<html>
    <head>
        <title><decorator:title default="테크리포트" /></title>
        <decorator:head />
      
    </head>
    <body>
    
    <page:applyDecorator name ="top"/>
    
    <hr/>
    
    <decorator:body />
    
    <hr/>
    <page:applyDecorator name ="bottom"/>
    </body>
</html>