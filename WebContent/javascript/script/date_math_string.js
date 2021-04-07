let str = 'Please locate where "locate" occurs!';

let result = str.indexOf('locate', 10);
console.log(result);

console.log(Math.floor(3.3));


let lunchTime = new Date();
lunchTime.setHours(12);
lunchTime.setMinutes(50);
lunchTime.setSeconds(0);

let now = new Date();
let gap = lunchTime.getTime() - now.getTime();
console.log(gap);

let hour = 60 * 60 * 1000;
let min = 60 * 1000;
let sec = 1 * 1000;

console.log(gap.toLocaleString());
console.log(new Date(gap));
console.log(lunchTime.getHours(), lunchTime.getMinutes(), lunchTime.getSeconds())