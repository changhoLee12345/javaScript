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