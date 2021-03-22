const express = require('express');
const apis = express.Router();
// access services
const UserService = require('../services/user.service');
const service = new UserService();
const repo = require('../repos/user.repo');

apis.get('/',(rq,rs)=>{
    repo.getUsers((err,result)=>{
        if(err){
            rs.status(500).send({
                error: 'Unable to respond your request'
            });
        }else{
            rs.status(200).send({
                users: result
            });
        }
    });
});

// save a user
apis.post('/save',(rq,rs)=>{
    const user = rq.body;
    console.log(user);
    // rs.json({
    //     user: user 
    // });
    repo.saveUser(user);
    rs.json({
        message: 'User has been saved'
    })
});

apis.get('/:id',(rq,rs)=>{
    let userId = rq.params.id;
    // rs.json(service.getUserbyId(parseInt(userId)));
    repo.getUserbyId(parseInt(userId),(err,result)=>{
        if(err){
            rs.status(500).send({
                error: 'Unable to respond your request'
            });
        }else{
            rs.status(200).send({
                result
            });
        }
    })
})

module.exports={
    apis
}