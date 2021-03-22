const express = require('express');
const server = express();
const userApis = require('./apis/user.api').apis;
const authorize = require('./security/security').authorize;

//server.use(parser.json());
server.use(express.json())
server.get('/status',(rq,rs)=>{
    rs.send("Server is running fine...");
});


server.get('/unauthorize',(rq,rs)=>{
    rs.status(401).send({
        status: 'ERROR',
        message: 'Please specify valid credentials'
    });
});

// apply security
// server.use('/users',(rq,rs,next)=>{
//     authorize(rq,rs,next);
// });
// add user routes
server.use('/users',userApis);

server.listen(8771,()=>{
    console.log('Server started ');
});


// localhost:8771/users/