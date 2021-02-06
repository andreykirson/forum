<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>
<form  action="<c:url value='/save'/>" method='POST'>
    <table>
        <tr>
            <td>Title of topic:</td>
            <td><input type='text' name='name'></td>
        </tr>
        <tr>
            <td>Description:</td>
            <td><input type='text' name='desc'></td>
        </tr>
        <tr>
            <td><input name="submit" type="submit" value="Save" /></td>
        </tr>
    </table>
</form>
</body>
</html>
