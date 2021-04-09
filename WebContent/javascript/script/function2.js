// variables...
let result;

// 1.
function outside() {
    let x = 5;

    function inside(x) {
        return x * 2;
    }
    return inside;
}
result = outside()(10);
console.log(result);

// 2. closure
var pet = function (name) {
    var getName = function () {
        return name;
    }
    return getName;
}
var myPet = pet('Vivie');
result = myPet();
console.log(result);

var createPet = function (name) {
    return {
        setName: function (newName) {
            name = newName;
        },
        getName: function () {
            return name;
        },
        getSex: function () {
            return sex;
        },
        setSet: function (newSex) {
            if (typeof newSex === 'string' && (newSex.toLowerCase() === 'male' || newSex.toLowerCase() === 'female')) {
                sex = newSex;
            }
        }
    }
}
pet = createPet('Vivie');
pet.getName();
pet.setName('Oliver');
pet.setSet('male');
pet.getSex();
pet.getName();

var getCode = (function () {
    var apiCode = '0]Eal(eh&2'; // A code we do not want outsiders to be able to modify...

    return function () {
        return apiCode;
    };
})();
result = getCode(); // Returns the apiCode
console.log(result);

// 9999. apply, call...
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
console.log(x);
x = person.fullName.apply(person2, ['Seoul', 'Korea']);
console.log(x);