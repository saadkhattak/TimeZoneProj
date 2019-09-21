console.log("called this file")

document.getElementById("12Hr").addEventListener("click", function(){
    console.log("Hello world 12!")
    displayTime12();
    
});

document.getElementById("24Hr").addEventListener("click", function(){
    console.log("Hello world 24")
    displayTime24();
});