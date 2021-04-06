// js05_control3.js

let colors = ['red', 'green', 'blue'];
let lastCnt = 10;
let cnt = 0;
let tag = '<ul>';

do {
    let line = cnt % 3;
    tag += '<li style="background-color: ' + colors[line] + ';">' + colors[line] + '</li>';
    if (lastCnt == cnt++) {
        break;
    }
} while (true);

tag += '</ul>';
document.write(tag);

// 버튼클릭, 마우스오버 이벤트 설명.
document.write('<button id="btn">Click</button>');
let btn = document.getElementById('btn');
btn.onclick = clickFunc;
btn.onmouseover = function () {
    this.style.backgroundColor = 'yellow';
    this.style.color = 'red';
}
btn.onmouseout = function () {
    this.style.backgroundColor = '';
    this.style.color = '';
}

function clickFunc() {
    console.log('hhh')
}