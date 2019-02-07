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
    <link href="/css/home.css" rel="stylesheet" type="text/css"/></link>
   <!-- jQuery first, then Tether, then Bootstrap JS. -->
   <script src="https://code.jquery.com/jquery-3.1.1.slim.min.js" integrity="sha384-A7FZj7v+d/sdmMqp/nOQwliLvUsJfDHW+k9Omg/a/EheAdgtzNs3hpfag6Ed950n" crossorigin="anonymous"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/tether/1.4.0/js/tether.min.js" integrity="sha384-DztdAPBWPRXSA/3eYEEUWrWCy7G5KFbe8fFjk5JAIxUYHKkDx6Qin1DkWx51bBrb" crossorigin="anonymous"></script>
   <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-alpha.6/js/bootstrap.min.js" integrity="sha384-vBWWzlZJ8ea9aCX4pEW3rVHjgjt7zpkNpZk+02D9phzyeVkE+jo0ieGizqPLForn" crossorigin="anonymous"></script>
   </head>

   <body>
    <div class="container">
        <nav class="navbar navbar-light bg-light" style="background-color: #5e5444; border-radius: 10px;">
            <form action="/cities" method="post" class="form-inline">
                <a class="navbar-brand" style="color:#ffffff" href="/cities">Main</a>
                <input class="form-control mr-sm-2" type="text" id="cityId" name="cityName" value="" placeholder="City" aria-label="Search">
                <button class="btn btn-primary" type="submit">Search</button>
            </form>
        </nav>
        <br>
    </div>
    <br>
    <div class="container">
        <div class="card">
            <div class="card-bloc">
                <table class="table table-hover">
                    <thead>
                        <tr>
                            <th>City</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="city" items="${cities}">
                            <tr>
                                <td>${city.cityName}</td>
                                <td><div class="btn-group dropright">
                                    <button type="button" class="btn btn-primary dropdown-toggle" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                                      Information
                                    </button>
                                    <div class="dropdown-menu" x-placement="right-start" style="position: absolute; will-change: transform; top: 0px; left: 0px; transform: translate3d(130px, 0px, 0px);">
                                        <a class="dropdown-item" href="/cities/${city.cityId}">Attractions</a>
                                        <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Hotels</a>
                                        <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Restaurants</a>
                                        <div class="dropdown-divider"></div>
                                            <a class="dropdown-item" href="#">Cinemas</a>
                                        </div>
                                    </div>
                                  </div>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
  </body>
</html>