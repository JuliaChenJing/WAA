<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <title>Registration</title>
    </head>
    <body>

        <form:form   method="POST" modelAttribute="student">
            <fieldset>
                <legend>Registration Form</legend>
                <p>
                    <form:errors path="*" cssStyle="color : red;" /> 
                </p>

                <div>
                    <label>First name:</label>
                    <form:input path="firstName" />
                    <div>
                        <form:errors path="firstName" cssStyle="color:red">
                        </form:errors>
                    </div>
                </div>
                <div>
                    <label>Last name:</label>
                    <form:input path="lastName" type="text" />             
                    <div>
                        <form:errors path="lastName" cssStyle="color:red">
                        </form:errors>
                    </div>
                </div>
                <div>
                    <label>Email:</label>
                    <form:input path="email" />
                    <div><form:errors path="email" cssStyle="color:red"></form:errors></div>
                    </div>
                    <div>
                        <label>Gender:</label>
                    <form:radiobutton path="gender" value="M"/>Male
                    <form:radiobutton path="gender" value="F"/>Female
                    <div><form:errors path="gender" cssStyle="color:red"></form:errors></div>
                    </div>
                    <div>
                        <label>Birthday:</label>
                    <form:input path="birthday" type="text" placeholder="mm/dd/yyyy"/>
                    <div><form:errors path="birthday" cssStyle="color:red"></form:errors></div>
                    </div>
                    <div>
                        <label>Phone:</label><br>
                    <form:input path="phone.area" />-
                    <form:input path="phone.prefix" />-
                    <form:input path="phone.number" />
                    <div><form:errors path="phone.area" cssStyle="color:red"></form:errors></div>

                        <div><form:errors path="phone.prefix" cssStyle="color:red"></form:errors></div>

                        <div><form:errors path="phone.area" cssStyle="color:red"></form:errors></div>
                    </div>
                    <p>

                    <form:button type="submit">Register</form:button>
                    </p>

                </fieldset>
        </form:form>
    </body>
</html>