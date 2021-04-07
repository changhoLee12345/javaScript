// js11_object.js
// property, method 로 구분.

let car = {
    name: 'Sonata',
    model: 'Hybrid',
    weight: 930,
    color: 'yellow',
    start: function () {
        console.log('출발합니다.');
    },
    stop: function () {
        console.log('정지합니다.');
    },
    fullName: function () {
        return this.name + ' - ' + this.model;
    }
}

let carName = car.name;
let carModel = car.model;
let carWeight = car['weight'];
let carColor = car['color'];

car.start();
car.stop();
let carFullName = car.fullName();

console.log(carFullName);

let person = {
    name: 'Hong',
    age: 20,
    city: 'Hanyang'
}

let perAry = Object.values(person);
console.log(perAry);

perAry.forEach((val, idx, c) => {
    console.log(val, idx);
});

let json = JSON.stringify(person);
let obj = JSON.parse(json);
console.log(obj);
