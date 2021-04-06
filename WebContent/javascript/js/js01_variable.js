// js01_variable.js
// number, string, boolean, array, object, undefined, null
// 변수의 선언, 데이터의 타입. 변수의 종류....

var num11 = 10;
var str1 = 'hello';
var bool1 = true;
var obj = null;
obj = {
    name: 'Hong',
    age: 20,
    getAge: function () {
        return this.age;
    }
}

console.log(obj.getAge());

var ary;
console.log(typeof ary);

ary = null;
ary = [1, 2, 3, 4];
console.log(typeof ary);

// object 선언
str1 = new String('hello');

obj = new Object();
obj.name = 'Hong';
obj.age = 20;
obj.getAge = function () {
    return this.age;
}
bool = new Boolean();
console.log(bool);

// global, local, block scope variable
// 동일의 변수 이름 선언이 가능.
var name = 'Hwang';
var age = 20;
console.log('name1: ', name, ',age: ', age);

// 동일한 변수 이름 불가.
{
    let name = 'Hong'; // (X)
    let age = 30; // (X)
    console.log('name2: ', name, ',age: ', age);
}

{
    const PI = 3.14;
    // PI = 3.1415;
}
const PI = 3.141592;
console.log(PI);

function myFunction() {
    console.log('func')
}
console.log(typeof myFunction)