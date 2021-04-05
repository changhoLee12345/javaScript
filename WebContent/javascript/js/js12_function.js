// js12_function.js

// 정의문.
function sumFunc(num1, num2) {
    return num1 + num2;
}
let result = sumFunc(3, 5);
console.log(result);

// 또다른 function을 호출할 수 있따.
function customFunc(year, month) {
    drawCalendar(year, month);
}
customFunc(2020, 3);


// 정의문을 변수에 할당해서 실행할 수 있따.
let myFunc = function () {
    // document.getElementById('show').innerHTML = 'Hello World!';
    console.log('Hello, World');
}
// window.onload = () => {
myFunc();
// }

myFunc = function (a, b) {
    if (a == null || b == null)
        return 0;
    else if (a == isNaN() || b == isNaN())
        return a + b;
}

result = myFunc();
console.log(result);