// callback

function showResult(result) {
    console.log('showResult() => ' + result);
}

function firstFunc(resolve) {

    setTimeout((result) => {
        secondFunc(result);
    }, 1000);

}

function secondFunc() {

    setTimeout((result) => {
        lastFunc(result);
    }, 2000);

}

function lastFunc() {

    setTimeout((result) => {
        showResult(result);
    }, 3000);

}