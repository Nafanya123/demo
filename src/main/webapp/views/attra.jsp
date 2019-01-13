
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
  <head>
   <!-- Required meta tags -->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">

   <!-- jQuery first, then Tether, then Bootstrap JS. -->
   <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
    </head>
    <body>
        <div class="container">
            <div class="card">
            <div class="myForm">
                <form>
                <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
                  <div class="modal-dialog" role="document">
                    <div class="modal-content">
                      <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">New message</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                        </button>
                      </div>
                      <div class="modal-body">
                          <div class="form-group">
                              <label for="attractionsName" class="col-form-label">Name:</label>
                              <input type="text" class="form-control" id="attractionsName" name="attractionsName" value="" />
                            </div>
                          <div class="form-group">
                              <label for="attractionsProperties" class="col-form-label">Test:</label>
                              <input type="text" class="form-control" id="attractionsProperties" name="attractionsProperties" value="" />
                            </div>
                      </div>
                      <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <form action="/attra" method="post">
                             <input type="hidden" name="id" value="${attractions.id}">
                             <input class="btn btn-primary" type="submit" name="submit" value="save">
                        </form>
                      </div>
                    </div>
                  </div>

                </div>
            <div class="card-bloc">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                        </tr>
                    </thead>
                    <tbody>
                    </form>
                    <c:forEach var="attractions" items="${attra}">
                        <tr>
                                <td>${attractions.id}</td>
                                <td>${attractions.attractionsName}</td>

                                <td> <a href="" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">Edit</a></td>
                                <td><form:form action="/attra" method="delete">
                                     <input type="hidden" name="id" value="${attractions.id}">
                                     <input class="btn btn-danger" type="submit" value="Delete">
                                     </form:form></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>

        </div>
  </body>
</html>