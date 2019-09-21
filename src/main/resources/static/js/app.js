console.log("Hello world")

let time12;
let time24;

let displayTime24 = function(){
    clearTimeout(time12);
    let now = new Date();
    let hr = now.getHours()
    let min = now.getMinutes()
    let sec = now.getSeconds()

    hr = (hr < 10) ? `0${hr}` : hr
    min = (min < 10) ? `0${min}` : min
    sec = (sec < 10) ? `0${sec}` : sec

    let currTime = `${hr}:${min}:${sec}`
    document.getElementById("showTime").innerHTML = currTime;
    time24 = setTimeout(displayTime24, 1000)
}

let displayTime12 = function(){
    clearTimeout(time24);
    let now = new Date();
    let hr = now.getHours()
    let min = now.getMinutes()
    let sec = now.getSeconds()

    let suffix = hr >= 12 ? "PM":"AM"; 
    hr = ((hr + 11) % 12 + 1);

    hr = (hr < 10) ? `0${hr}` : hr
    min = (min < 10) ? `0${min}` : min
    sec = (sec < 10) ? `0${sec}` : sec

    let currTime = `${hr}:${min}:${sec} ${suffix}`
    document.getElementById("showTime").innerHTML = currTime;
    time12 = setTimeout(displayTime12, 1000)
}

let displayCityTime = function(time){
    console.log(typeof time)
	let hr = time.getHours()
    let min = time.getMinutes()
    let sec = time.getSeconds()
	
    let suffix = hr >= 12 ? "PM":"AM"; 
    hr = ((hr + 11) % 12 + 1);

    hr = (hr < 10) ? `0${hr}` : hr
    min = (min < 10) ? `0${min}` : min
    sec = (sec < 10) ? `0${sec}` : sec

    let currTime = `${hr}:${min}:${sec} ${suffix}`
    document.getElementById("timeLabel").innerHTML = currTime;
    time12 = setTimeout(displayCityTime, 1000)
}

displayTime24()