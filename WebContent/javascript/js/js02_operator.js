// operator.js
let num1 = num2 = 120;

let result = num1 + num2;

function sum(num1, num2) {
    return num1 + num2;
}
result = sum(num1, num2);

function minus(num1, num2) {
    return num1 - num2;
}
result = minus(num1, num2);

function accumulate(result, val) {
    return result + val;
}
resul = 0;
for (let i = 1; i <= 10; i++) {
    result = accumulate(result, i);
}
console.log("결과값: " + result);

window.onload = function () {
    result = getElementById('show');
    result.setAttribute('class', 'blue');
    result.innerHTML = 'Hello';
    console.log(result);
}

function getElementById(element) {
    return document.getElementById(element);
}