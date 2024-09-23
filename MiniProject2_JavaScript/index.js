let min, max;

let R, U;

document.getElementById("generateBtn").onclick = function() {
    min = Number(document.getElementById("min").value);
    max = Number(document.getElementById("max").value);    

    R = Math.floor(Math.random() * (max - min)) + min;    
    window.alert("Number Generated");
}

document.getElementById("submitBtn").onclick = function() {

    U = Number(document.getElementById("userInput").value);
    
    if (R == U) {
        window.alert("Congratulations!!");
    } else {
        if (R > U) 
            window.alert("Higher");
        else
            window.alert("Lower");
    }
}