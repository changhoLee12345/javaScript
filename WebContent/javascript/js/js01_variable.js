// js01_variable.js
var num1 = 10;
var str1 = 'hello';
var obj = null;
obj = {
    name: 'Hong',
    age: 20,
    getAge: function () {
        return this.age;
    }
}

console.log(obj.getAge());