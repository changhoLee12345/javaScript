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
function drawCalendar() {

    let days = ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'];
    let today = new Date();
    let thisYear = today.getFullYear();
    let thisMonth = today.getMonth();
    let thisDay = today.getDate();

    let lastDateOfThisMonth = new Date(thisYear, thisMonth + 1, 0).getDate();
    console.log(lastDateOfThisMonth);
    let firstDayOfThisMonth = new Date(thisYear, thisMonth).getDay();
    console.log(firstDayOfThisMonth);

    document.write('<h2>Calendar</h2>');
    document.write('<table border="1"><caption style="background-color: rgb(109, 233, 140); color: red;">' + thisYear + '년' + thisMonth + '월</caption><tr>');

    for (let i = 0; i < days.length; i++) {
        document.write('<th>' + days[i] + '</th>');
    }
    document.write('</tr>');
    let r = 0;
    for (let i = 0; i < firstDayOfThisMonth; i++) {
        document.write('<td></td>');
        r = i;
    }
    for (let i = 1; i <= lastDateOfThisMonth; i++) {
        if ((r + i) % 7 == 6) {
            document.write('<td style="background-color: aqua;">' + i + '</td></tr><tr>');
        } else if ((r + i) % 7 == 0) {
            document.write('<td style="background-color: red;">' + i + '</td>');
        } else if (i == thisDay) {
            document.write('<td style="background-color: yellow;">' + i + '</td>');
        } else {
            document.write('<td>' + i + '</td>');
        }
    }
    document.write('</tr></table>');

    function getNameOfDay(day) {
        let days = ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'];
        return days[day];
    }
}

function drawCalendar(year, month) {
    //  while 문으로 달력만들기.
    let days = ['일요일', '월요일', '화요일', '수요일', '목요일', '금요일', '토요일'];
    let today = new Date();
    let thisYear = today.getFullYear();
    let thisMonth = today.getMonth();
    let thisDay = today.getDate();

    let lastDateOfThisMonth = new Date(thisYear, thisMonth + 1, 0).getDate();
    console.log(lastDateOfThisMonth);
    let firstDayOfThisMonth = new Date(thisYear, thisMonth).getDay();
    console.log(firstDayOfThisMonth);
    document.write('<h2>Calendar</h2>');
    document.write('<table border="1"><caption style="background-color: rgb(109, 233, 140); color: red;">' + thisYear + '년' + thisMonth + '월</caption><tr>');

    let i = 0;
    while (true) {
        document.write('<th>' + days[i++] + '</th>');
        if (i == days.length) {
            document.write('</tr><tr>');
            break;
        }
    }
    i = 0;
    while (i < firstDayOfThisMonth) {
        document.write('<td></td>');
        i++;
    }

}
// drawCalendar(2021, 3);