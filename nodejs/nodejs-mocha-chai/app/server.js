const express = require('express');
const server = express();
const calc = require('./calc');

const PORT = 6701;

const statusAPI = (request,response)=>{
    res.status(200).json({ message : 'Server is up'});
}

// get api
server.get('/status',statusAPI(request,response));

// perform addition using calc
server.get('/calc/add/:num1/:num2',(req,res)=>{
    // call add method
    const first = parseInt(req.params.num1);
    const second = parseInt(req.params.num2);
    const _sum = calc.add(first,second);
    res.json({
        result : _sum
    });

});
// 
server.listen(PORT,()=>{
    console.log(`Server Started at ${PORT}`);
});