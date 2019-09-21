console.log("Hello world")

let displayTime = function(){

    let now = new Date();
    let hr = now.getHours()
    let min = now.getMinutes()
    let sec = now.getSeconds()

    hr = (hr < 10) ? `0${hr}` : hr
    min = (min < 10) ? `0${min}` : min
    sec = (sec < 10) ? `0${sec}` : sec

    let currTime = `${hr}:${min}:${sec}`
    document.getElementById("showTime").innerHTML = currTime;
    setTimeout(displayTime, 1000)
}

displayTime()