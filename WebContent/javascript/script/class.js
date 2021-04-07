class Person {
    constructor(name, year) {
        this.name = name;
        this.year = year;
    }
    age() {
        let today = new Date();
        return today.getFullYear() - this.year;
    }
    getName() {
        return this.name;
    }
    getYear() {
        return this.year;
    }
    setYear(year) {
        this.year = year;
    }
    setName(name) {
        this.name = name;
    }
}

const person1 = new Person('Hong', 2010);
person1.setYear(2000);
person1.setName('Hwang');
console.log(person1.getName(), person1.getYear(), person1.age());
person1.setName('Park');
console.log(person1.getName(), person1.getYear(), person1.age());

class Student {
    constructor(sno, name) {
        this.sno = sno;
        this.name = name;
    }
    set setName(name) {
        this.name = name;
    }
    get getName() {
        return this.name;
    }
    get showInfo() {
        return this.sno + ' - ' + this.name;
        j
    }
    showName() {
        return this.name;
    }
}

let student = new Student('001', 'Hong');
student.setName = 'Hwnag';
console.log(student.getName);
console.log(student.showName());
// console.log(student.showInfo);


class HighStudent extends Student {
    constructor(sno, name, school) {
        super(sno, name);
        this.school = school;
    }
    get showInfo() {
        return this.sno + ' - ' + this.name + ' - ' + this.school;
    }
    set setSchool(value) {
        this.school = value;
    }
}

let highStud = new HighStudent('002', 'Hwang', 'Yedam');
highStud.sno = '003';
highStud.setSchool = 'HighSchool';
console.log(highStud.showInfo);