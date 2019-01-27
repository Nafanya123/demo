
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="ru">
  <head>
   <!-- Required meta tags -->
   <meta charset="utf-8">
   <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

   <!-- Bootstrap CSS -->
   <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/css/bootstrap.min.css" integrity="sha384-rwoIResjU2yc3z8GV/NPeZWAv56rSmLldC3R/AZzGRnGxQQKnKkoFVhFQhNUwEyJ" crossorigin="anonymous">

   <!-- jQuery first, then Tether, then Bootstrap JS. -->
      <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
      <script src="https://code.jquery.com/jquery-3.3.1.js" crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
      <script src="/javascript/attra.js" rel="stylesheet" type="text/javascript"></script>
  </head>
      <form:form action="/attra" method="post">
          <div class="modal fade" id="modalEdit" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
              <div class="modal-dialog" role="document">
                  <div class="modal-content">
                      <div class="modal-header">
                          <h5 class="modal-title" id="exampleModalLabel">Change sight</h5>
                          <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                          <span aria-hidden="true">&times;</span>
                          </button>
                      </div>
                      <div class="modal-body">
                          <div class="form-group name">
                              <label for="attName" class="col-form-label">Name:</label>
                              <input type="text" class="form-control" id="attName" name="attractionsName" value=""/>
                          </div>
                          <div class="form-group properties">
                              <label for="attProperties" class="col-form-label">Properties:</label>
                              <input type="text" class="form-control" id="attProperties" name="attractionsProperties" value=""/>
                          </div>
                      </div>
                      <div class="modal-footer">
                          <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                          <input type="hidden" class="form-control" id="ids" name="id" value=""/>
                          <input class="btn btn-primary" type="submit" value="Save">
                      </div>
                  </div>
              </div>
          </div>
      </form:form>


        <div class="modal fade" id="modalNew" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <h5 class="modal-title" id="exampleModalLabel">Add sight</h5>
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                        <span aria-hidden="true">&times;</span>
                        </button>
                    </div>
                    <div class="modal-body">
                        <div class="form-group name">
                            <label for="attractionsName" class="col-form-label">Name:</label>
                            <input type="text" class="form-control" id="attractionsName" name="attractionsName" value=""/>
                        </div>
                        <div class="form-group properties">
                            <label for="attractionsProperties" class="col-form-label">Properties:</label>
                            <input type="text" class="form-control" id="attractionsProperties" name="attractionsProperties" value=""/>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" class="btn btn-secondary" data-dismiss="modal">Close</button>
                        <button type="button" class="btn btn-primary" data-dismiss="modal" data-toggle="modal"
                                                                     data-target="#modalSave" id="attractionsName">Confirm</button>
                    </div>
                </div>
            </div>
        </div>


    <form:form action="/resultatt" method="post">
      <div class="modal fade" id="modalSave" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
        <div class="modal-dialog" role="document">
          <div class="modal-content">
            <div class="modal-header">
              <h5 class="modal-title" id="exampleModalLabel">Modal title</h5>
              <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">&times;</span>
              </button>
            </div>
            <div class="modal-body">
              <div class="form-group name1">
                  <label for="attractionsName" class="col-form-label"><p><u>Attraction Name:</u></p></label>
                  <input type="hidden" class="form-control" id="attractionsName" name="attractionsName" value=""/>
                  <p><output id="attractionsName">null</output></p>
                  <hr>
              </div>
              <div class="form-group properties1">
                  <label for="attractionsProperties" class="col-form-label"><p><u>Attraction Properties:</u></p></label>
                  <input type="hidden" class="form-control" id="attractionsProperties" name="attractionsProperties" value=""/>
                  <p><output id="attractionsProperties">null</output></p>
              </div>
            </div>
            <div class="modal-footer">
              <button type="button" class="btn btn-secondary" data-dismiss="modal" data-toggle="modal" data-target="#modalNew">Back</button>
              <input class="btn btn-primary" type="submit" value="Save">
            </div>
          </div>
        </div>
      </div>
    </form:form>

    <body>
        <div class="container">
            <div class="card">
                <div class="card-bloc">
                    <table class="table table-hover">
                        <thead>
                            <tr>
                                <th>Attractions</th>
                                <th>Properties</th>
                            </tr>
                        </thead>
                        <tbody>
                            <c:forEach var="attractions" items="${attra}">
                                <tr id="attractions-${attractions.id}">
                                    <td>${attractions.attractionsName}</td>
                                    <td>${attractions.attractionsProperties}</td>
                                    <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalEdit" data-id="${attractions.id}">Edit</button></td>
                                        <form:form action="/delete/attra" method="post">
                                            <input type="hidden" name="id" value="${attractions.id}">
                                            <td><input class="btn btn-danger" type="submit" value="Delete">
                                        </form:form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </body>
    <td><button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalNew">New</button></td>
</html>