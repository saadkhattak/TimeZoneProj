<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<head>
	<title>Time API</title>
</head>
<body>

	<!-- <h1>Our time API</h1> -->
	<h2>Current time: </h2>
	<h3 id="showTime"></h3>

	<div>
		<button id = "12Hr">12 Hour</button>
		<button id = "24Hr">24 Hour</button>
	</div>

	<br> <br>
	<div>
		City: <label id = "cityLabel">${city.cityName}</label>
		<br>
		Time: <label id = "timeLabel">${city.cityTime}</label>
	</div>
	
	<br>

	<form:form action="processCity" modelAttribute="city">

		<label> Select city </label>

		<form:select path="cityName">
			<option value="America/Chicago">Chicago</option>
			<option value="Asia/Kolkata">Kolkata</option>
			<option value="Australia/Adelaide">Adelaide</option>
			<option value="Europe/Zurich">Zurich</option>
			<option value="America/Vancouver">Vancouver</option>
		</form:select>

		<input type="submit"></input>
	</form:form>
	
	<script type="text/javascript" src = "/resources/js/app.js"></script>
	<script type="text/javascript" src = "/resources/js/convertTime.js"></script>
	<script type="text/javascript" src = "/resources/js/checkTimeToCall.js"></script>
</body>
</html>