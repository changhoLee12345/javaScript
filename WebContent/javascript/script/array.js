class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}

let persons = [];
persons.push(new Person('Hong', 20));
persons.push(new Person('Hwang', 21));
persons.push(new Person('Choi', 22));
persons.push(new Person('Park', 23));

let newPersons = persons.filter(function (a, b, c) {
    return a.age >= 21;
}).map(function (a, b, c) {
    let member = {};
    member.name = a.name;
    member.grade = a.age % 2 == 0 ? 'even' : 'odd';
    return member;
});

newPersons = persons.map(function (a, b, c) {
    let member = {};
    member.name = a.name;
    member.grade = a.age % 2 == 0 ? 'even' : 'odd';
    return member;
}).filter(function (a, b, c) {
    return a.grade == 'even';
});

console.log(newPersons);

///////////////////////////////////////////

var numbers1 = [45, 4, 9, 16, 25];
var result = numbers1.reduce(function (a, b, c, d) {
    console.log(a, b, c, d);
    return a < b ? a : b;
});

console.log('result: ' + result);

function Member(name, age) {
    this.name = name;
    this.age = age;
}
var members = [];
members.push(new Member('Hong', 21));
members.push(new Member('Hwang', 22));
members.push(new Member('Park', 23));
members.push(new Member('Choi', 24));
let result1 = members.reduce(function (a, b, c, d) {
    return a.age > b.age ? a : b;
});
console.log(result1);

//////////////////////////////////////////////

function Member(name, age) {
    this.name = name;
    this.age = age;
}
var members = [];
members.push(new Member('Hong', 21));
members.push(new Member('Hwang', 22));
members.push(new Member('Park', 23));
members.push(new Member('Choi', 24));

var result = members.every(function (a, b, c) {
    return a.age > 21;
});

result = members.some(function (a, b, c) {
    return a.age > 21;
});

result = members.indexOf(new Member('Hong', 21));
console.log(result);


var numbers1 = [45, 4, 9, 16, 25];
var numbers2 = numbers1.map(function () {

});

document.getElementById("demo").innerHTML = numbers2;

function myFunction(value, index, array) {
    return value * 2;
}


let names = ['Hong', 'Hwang', 'Park', 'Choi'];
names.map(function (item, idx, ary) {
    console.log(item);
})

names.reduce(function () {

})