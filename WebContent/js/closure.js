var counter = function () {
    var privateCounter = 0;

    function changeBy(val) {
        privateCounter += val;
    }
    return {
        increment: function () {
            changeBy(1);
        },
        decrement: function () {
            changeBy(-1);
        },
        value: function () {
            return privateCounter;
        }
    };
};

var counter1 = counter();
var counter2 = counter();

counter1.increment();
counter1.increment();
counter1.increment();

console.log('counter1: ' + counter1.value());

counter2.increment();
counter2.increment();
console.log('counter2: ' + counter2.value());