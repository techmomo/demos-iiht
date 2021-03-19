const add = (_first, _next)=>{
    return _first + _next;
}
const diff = (_first, _next)=>{
    return _first - _next;
}
const arr = ()=>{
    return [
        100,
        20
    ]
}

const calc = (_first,_next,actionType) => {
    switch (actionType) {
        case 'ADD':
            return ()=>{ // this is a closure
                return _first + _next;
            };
        case 'DIFF':
            return ()=>{
                return _first - _next;
            };
        default:
            return ()=>{
                return _first + _next;
            };
    }
}

const operation = calc(10,2,'ADD');
console.log(operation());

//


const _callbackCalc = (_first,_next,callback) => {
   callback(_first,_next);
}

const callAdd = (num1,num2)=>{
    console.log(num1 + num2);
}

_callbackCalc(15,2,callAdd);


// use anonymous callback

const _callbackCalcAnony = ((num1,num2)=>{
    console.log(num1 + num2);
});

_callbackCalcAnony(8,3);

module.exports = {
    add,
    arr
}