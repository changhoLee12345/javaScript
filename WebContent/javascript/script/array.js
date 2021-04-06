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

console.log(numbers2);

function myFunction(value, index, array) {
    return value * 2;
}


let names = ['Hong', 'Hwang', 'Park', 'Choi'];
names.map(function (item, idx, ary) {
    console.log(item);
})

names.reduce(function () {

})