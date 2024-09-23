const defaultValue = 0;
let value = 0;

// function reset() {}
document.getElementById("btnReset").onclick = function reset() {
        let temp = document.getElementById("counter").textContent;
        temp = Number(temp);
        // console.log(temp);
        document.getElementById("counter").textContent = 0;
    
}


// function increase() {}
document.getElementById("btnIncrease").onclick = function increase() {
    let temp = document.getElementById("counter").textContent;
    temp = Number(temp);
    temp++;
    // console.log(temp);
    document.getElementById("counter").textContent = temp;
}


// function decrease() {}
document.getElementById("btnDecrease").onclick = function decrease() {
    let temp = document.getElementById("counter").textContent;
    temp = Number(temp);
    temp--;
    // console.log(temp);
    document.getElementById("counter").textContent = temp;

}

