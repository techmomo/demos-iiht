const express = require('express');
const server = express();

server.get('/',(req,res)=>{
    res.send("Server is up & running");
});

server.listen(3201,()=>{
    console.log('Server Started');
})