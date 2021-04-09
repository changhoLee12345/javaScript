// js12_function.js

// 정의문.
function square(num) {
    return num * num;
}
let result = square(3);
console.log(result);

// 또다른 function을 호출할 수 있따.
function customFunc(year, month) {
    // drawCalendar(year, month);
}
customFunc(2020, 3);


// 정의문을 변수에 할당해서 실행할 수 있따.
const getSquare = function (num) {
    // document.getElementById('show').innerHTML = 'Hello World!';
    return num * num;
}
// window.onload = () => {
getSquare(5);
// }

const mySum = function (a, b) {
    if (a == null || b == null)
        return 0;
    else if (a == isNaN() || b == isNaN())
        return 0;
    else
        return a + b;
}

result = mySum(3, 5);
console.log(result);

// 3.
function otherFunc(obj) {
    obj.make = 'Hyundai';
}
let mycar = {
    make: 'Kia',
    model: 'K5',
    year: 2010
}
let x, y;
x = mycar.make;
console.log(x);

otherFunc(mycar);
y = mycar.make;
console.log(y);

// 4.
const factorial = function fac(n) {
    return n < 2 ? 1 : n * fac(n - 1);
}
console.log(factorial(3));

// 5.
function map(func, ary) {
    let result = [];
    for (let i = 0; i < ary.length; i++) {
        result[i] = func(ary[i]);
    }
    return result;
}

function func1(n) {
    return n * n;
}
let numbers = [0, 1, 2, 3, 4, 5];

result = map(func1, numbers);

let func2 = function (n) {
    return n * n;
}
result = map(func2, numbers);
console.log(result);

// 6.
let num1 = 20,
    num2 = 3,
    user = 'Hong';

function multiply() {
    return num1 * num2;
}
multiply();

function getScore() {
    let num1 = 2,
        num2 = 3;

    function add() {
        return user + ' scored ' + (num1 + num2);
    }
    return add();
}
result = getScore();
console.log(result);

// 7.
function loop(x) {
    console.log(x);
    if (x >= 10) {
        return;
    }
    loop(x + 1);
}
loop(0);

function walkTree(node) {
    console.log('node=>', node)
    if (node == null)
        return;
    for (let i = 0; i < node.childNodes.length; i++) {
        walkTree(node.childNodes[i]);
    }
}

// walkTree(window.document);

// 8.
function foo(i) {
    if (i < 0)
        return;
    console.log('begin: ' + i);
    foo(i - 1);
    console.log('end: ' + i);
}
foo(3);

// 9.
function addSquares(a, b) {
    function square(x) {
        return x * x;
    }
    return square(a) + square(b);
}

result = addSquares(2, 3);
console.log(result);
result = addSquares(3, 4);
console.log(result);
result = addSquares(4, 5);
console.log(result);


function outside(x) {
    function inside(y) {
        return x + y;
    }
    return inside;
}
let fn_inside = outside(3);
console.log(fn_inside)

result = fn_inside(5);
console.log(result);

result = outside(3)(5);
console.log(result);


// 10. multiple nested.
function aFunc(x) {
    function bFunc(y) {
        function cFunc(z) {
            console.log(x + y + z);
        }
        cFunc('c');
    }
    bFunc('b');
}
aFunc('a');