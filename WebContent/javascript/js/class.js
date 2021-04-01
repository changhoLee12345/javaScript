class Student {
    constructor(sno, name) {
        this.sno = sno;
        this.name = name;
    }
    get showInfo() {
        return this.sno + ' - ' + this.name;
        j
    }
}

let student = new Student('001', 'Hong')
console.log(student.showInfo);


class HighStudent extends Student {
    constructor(sno, name, school) {
        super(sno, name);
        this._school = school;
    }
    get showInfo() {
        return this.sno + ' - ' + this.name + ' - ' + this._school;
    }
    set school(value) {
        this._school = value;
    }
}

let highStud = new HighStudent('002', 'Hwang', 'Yedam');
highStud.sno = '003';
console.log(highStud.showInfo);