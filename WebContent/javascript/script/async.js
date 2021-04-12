function myDisplayer(some) {
    document.getElementById("show").innerHTML = some;
}

let myPromise = new Promise(function (myResolve, myReject) {
    let req = new XMLHttpRequest();
    req.open('GET', "form.html");
    req.onload = function () {
        if (req.status == 200) {
            myResolve(req.response);
        } else {
            myReject("File not Found");
        }
    };
    req.send();
});

myPromise.then(
    function (value) {
        myDisplayer('ok => ' + value);
    },
    function (error) {
        myDisplayer('fail => ' + error);
    }
);