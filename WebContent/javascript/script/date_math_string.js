let str = 'Please locate where "locate" occurs!';

let result = str.indexOf('locate', 10);
console.log(result);

console.log(Math.floor(3.3));

let colorChange = true;
let colors = ['aqua', 'green', 'lightblue', 'red'];
let i = 0;
setStyle();

function remainTime() {

    let lunchTime = new Date(); // 기준시간을 설정하면 된다.
    lunchTime.setHours(17);
    lunchTime.setMinutes(50);
    lunchTime.setSeconds(0);

    let now = new Date();
    let gap = lunchTime.getTime() - now.getTime();
    // console.log(gap);

    // 총시간에서 시 제외 후 분 제외 후 초 계산.
    let hour = 60 * 60 * 1000;
    let min = 60 * 1000;
    let sec = 1 * 1000;

    let calHours = Math.floor(gap / hour);
    gap = gap - calHours * hour;
    let calMin = Math.floor(gap / min);
    gap = gap - calMin * min;
    let calSec = Math.floor(gap / sec);

    // console.log(lpad(calHours) + ':' + lpad(calMin) + ':' + lpad(calSec));
    let show = document.getElementsByClassName('flex-container')[0];
    let cls = document.getElementsByClassName('blank');
    // show.innerHTML = (lpad(calHours) + ':' + lpad(calMin) + ':' + lpad(calSec));
    let h1t = document.getElementById('h1');
    h1t.innerHTML = lpad(calHours).substring(0, 1);
    let h2t = document.getElementById('h2');
    h2t.innerHTML = lpad(calHours).substring(1, 2);

    let m1t = document.getElementById('m1');
    m1t.innerHTML = lpad(calMin).substring(0, 1);
    let m2t = document.getElementById('m2');
    m2t.innerHTML = lpad(calMin).substring(1, 2);

    let s1t = document.getElementById('s1');
    s1t.innerHTML = lpad(calSec).substring(0, 1);
    let s2t = document.getElementById('s2');
    s2t.innerHTML = lpad(calSec).substring(1, 2);

    if (lunchTime.getTime() - now.getTime() < blickTime(2)) { // 깜빡거리는 시간을 몇분이하로 지정할지 ...
        show.style.fontSize = (60 - calSec) + 'px';
        show.style.backgroundColor = colors[i % 4];
        for (let j = 0; j < cls.length; j++) {
            cls[j].style.backgroundColor = colors[i % 4];
        }
        colorChange = !colorChange;
    } else {
        show.style.fontSize = (60 - calSec) + 'px';
        show.style.backgroundColor = 'aqua';
    }
    i++;
}

function lpad(time) {
    if (time < 10) {
        return '0' + time;
    }
    return '' + time;
}

function blickTime(mm) {
    return mm * 60 * 1000;
}

function setStyle() {
    let hTag = document.getElementsByTagName('head');
    let scpt = document.createElement('link');
    scpt.setAttribute('rel', 'stylesheet');
    scpt.setAttribute('href', 'script/date.css');
    hTag[0].appendChild(scpt);

}

// remainTime();
setInterval(function () {
    remainTime();
}, 333);