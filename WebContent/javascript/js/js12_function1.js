var person = {
    fullName: function (city, country) {
        return this.firstName + " " + this.lastName + " " + city + " " + country;
    }
}
var person1 = {
    firstName: "Kildong",
    lastName: "Hong"
}
var person2 = {
    firstName: "Hee",
    lastName: "Hwang",
    city: 'Seoul',
    country: 'Korea'
}
var x = person.fullName.call(person1, 'Seoul', 'Korea');
x = person.fullName.call(person2);
console.log(x);