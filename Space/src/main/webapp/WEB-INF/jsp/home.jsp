i am on home page....






<%@page import="com.Space.model.Collection"%>
<%@page import="java.util.List"%>
<%
out.println(request.getAttribute("collection"));

%>
<%
List<Collection> list = (List<Collection>) request.getAttribute("collection");
%>
	
<table>
  <tr>
    <th>id</th>
    <th>name</th>
    <th>blood</th>
  </tr>
  
  <%
  for (Collection cc :list){
  %>
  <tr>
    <td><% out.print(cc.getId()); %></td>
    <td><% out.print(cc.getName()); %></td>
    <td><% out.print(cc.getBlood()); %></td>
  </tr>
 <%
 }
 %>
</table>