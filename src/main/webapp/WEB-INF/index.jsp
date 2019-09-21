<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!DOCTYPE html>
<head>
<title>Time API</title>
</head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
<body>

	<!-- <h1>Our time API</h1> -->
	<h2>Your current time is</h2>
	<h3 id="showTime"></h3>

	<div class="btn-group">
		<button type="button" class="btn btn-primary btn-lg">12 Hour</button>
		<button type="button" class="btn btn-secondary btn-lg">24
			Hour</button>
	</div>

	<br>
	<br>

	<form:form action="processCity" modelAttribute="student">

		<label> Select city and country </label>

		<select>
			<option value="chicago">America/Chicago</option>
			<option value="kolkata">Asia/Kolkata</option>
			<option value="adelaide">Australia/Adelaide</option>
			<option value="zurich">Europe/Zurich</option>
		</select>

		<input type="submit"></input>

		<script type="text/javascript" src="/resources/js/app.js"></script>

	</form:form>


</body>
</html>