var element = document.getElementById("timeLabel")
var dateOfCity = document.getElementById("timeLabel").innerHTML
var dateOfCheck = new Date(Date.parse(dateOfCity))

var getdateToCheckHr = dateOfCheck.getHours()

displayCityTime(dateOfCheck)

if (getdateToCheckHr >= 21 || getdateToCheckHr < 9){
	element.style.backgroundColor = 'red';
}
else{
	element.style.backgroundColor = 'green';
}
