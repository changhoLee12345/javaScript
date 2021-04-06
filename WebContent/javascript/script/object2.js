let person = {
    firstName: 'Hong',
    lastName: 'Kildong',
    language: '',
    set lang(lang) {
        this.language = lang.toUpperCase();
    },
    get lang() {
        return this.language.toUpperCase();
    }
};

person.lang = 'en';
person.language = 'kr';
console.log(person.lang);

let obj = {
    counter: 0
}
Object.defineProperty(obj, 'name', {
    value: 'Hong'
})

Object.defineProperty(obj, 'reset', {
    get: function () {
        this.counter = 0;
    }
})

Object.defineProperty(obj, 'increment', {
    get: function () {
        this.counter++;
    }
})

Object.defineProperty(obj, 'show', {
    get: function () {
        return this.counter;
    }
})

Object.defineProperty(obj, 'add', {
    set: function (value) {
        this.counter += value;
    }
})

Object.defineProperty(obj, 'subtract', {
    set: function (value) {
        this.counter -= value;
    }
})

obj.reset;
obj.increment;
obj.increment;
obj.increment;
obj.add = 5;
obj.reset;
obj.subtract = 4;
console.log(obj.name);

class Person {
    constructor(name, age) {
        this.name = name;
        this.age = age;
    }
}