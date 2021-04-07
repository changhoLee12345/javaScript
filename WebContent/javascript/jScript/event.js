// js13_event.js

// 이벤트에 대한 간략한 설명.

// 버튼클릭, 마우스오버 이벤트 설명.

let addClick = function () {
    let i = 0;

    function addCnt() {
        i++;
        return i;
    }
    return addCnt;
}

let firstClick = addClick();

let colors2 = ['red', 'green', 'blue'];
let iCnt = 0;

document.write('<button class="btn" id="btn">Click</button><p />');
document.write('<div id="rect"></div>');
let btn = document.getElementById('btn');
let rect = document.getElementById('rect');

btn.onclick = function () {
    rect.setAttribute('style', 'background-color: ' + colors2[iCnt++ % 3] + '');
}
btn.onmouseover = function () {
    btn.style.backgroundColor = 'yellow';
    btn.style.color = 'red';
}
btn.onmouseout = function () {
    btn.style.backgroundColor = '';
    btn.style.color = '';
}