var person = {
    firstName: "scott",
    lastName: "tiger",
    age: 35,
    phone: "010-1234-1234"
}
var person2 = {
    firstName: "scott2",
    lastName: "tiger2",
    age: 35,
    phone: "010-1234-1234"
}
var person3 = {
    firstName: "scott3",
    lastName: "tiger3",
    age: 35,
    phone: "010-1234-1234"
}
var persons = [person, person2, person3];

console.log("======object field=====")
for (obj in person) {
    console.log(obj);
}
for (person of persons) {
    let values = Object.values(person);
    values = JSON.stringify(person);
    console.log(values);
}

console.log("============[배열object]=================")
for (person of persons) {
    for (f in person) {
        console.log(person[f]) // person['firstName'], person['lastName']
    }
}