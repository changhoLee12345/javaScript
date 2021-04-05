// js03_control1.js 
// if, if else, for, while, do while

let curHour = new Date().getHours();
console.log(getResult(curHour));

function getResult(time) {
    if (time < 12) {
        return 'Good Morning!!';
    } else if (time < 18) {
        return 'Good Afternoon!!';
    } else if (time < 21) {
        return 'Good Evening!!';
    } else {
        return 'Good Night!!';
    }

}

let today = new Date();
let day;
today = today.getDay();

console.log(today);
switch (today) {
    case 0:
        day = '일요일';
        break;
    case 1:
        day = '월요일';
        break;
    case 2:
        day = '화요일';
        break;
    case 3:
        day = '수요일';
        break;
    case 4:
        day = '목요일';
        break;
    case 5:
        day = '금요일';
        break;
    case 6:
        day = '토요일';
        break;
}
console.log('오늘은 ' + day);