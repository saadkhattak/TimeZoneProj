<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<head>
	<title>Time API</title>
	<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
	<script	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>

	<!-- <h1>Our time API</h1> -->
	<h2>Current time: </h2>
	<h3 id="showTime"></h3>

	<div class="btn-group">
		<button type="button" class="btn btn-primary btn-lg">12 Hour</button>
		<button type="button" class="btn btn-secondary btn-lg">24
			Hour</button>
	</div>

	<br> <br>
	City = ${city.cityName}
	<br>
	Time = ${city.cityTime}
	
	<br>
	<br>

	<form:form action="processCity" modelAttribute="city">

		<label> Select city and country </label>

		<form:select path="cityName">
			<option value="America/Chicago">Chicago</option>
			<option value="Asia/Kolkata">Kolkata</option>
			<option value="Australia/Adelaide">Adelaide</option>
			<option value="Europe/Zurich">Zurich</option>
		</form:select>

		<input type="submit"></input>
		<script type="text/javascript" src="/resources/js/app.js"></script>

	</form:form>

</body>
</html>