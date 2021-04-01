var score = 10;
function myFunc() {
    var score = 20;
    // console.log("local: " + score);
}
myFunc();
// console.log("global: " + score);

function newFunc() {
    // console.log("global function");
}

function outerFunc() {
    function newFunc() {
        // console.log("local function");
    }
    newFunc();
}

newFunc();
outerFunc();

(function() {
    // console.log("return Fnc");
})();


