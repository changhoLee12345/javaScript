// js04_control2.js

// for, while, do while
let names = ['Hong', 'Hwang', 'Park', 'Choi'];
for (let i = 0; i < names.length; i++) {
    if (i == 0) {
        document.write('<h1>List</h1><ul>');
    }
    document.write('<li>' + names[i] + '</li>');
    if (i == names.length - 1) {
        document.write('</ul>');
    }
}

// 달력...그리기
let today = new Date();
let thisYear = today.getFullYear();
let thisMonth = today.getMonth();
let thisDay = today.getDate();

let lastDateOfThisMonth = new Date(thisYear, thisMonth + 1, 0).getDate();
console.log(lastDateOfThisMonth);
let firstDayOfThisMonth = new Date(thisYear, thisMonth).getDay();
console.log(getNameOfDay(firstDayOfThisMonth));

// for ()

function getNameOfDay(day) {
    let days = ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'];
    return days[day];
}