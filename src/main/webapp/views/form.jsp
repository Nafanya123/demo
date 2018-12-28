<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8" />
        <title>User Info</title>
    </head>
    <body>
    <tr>

    <form action="#" th:action="@{/form}" th:object="${form}" method="post">
        <p>Id: <input type="text" th:field="*{id}" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form>
        </tr>
    </body>
</html>