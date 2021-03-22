// const users = [
//     {
//         id: 1,
//         name: 'User1'
//     },
//     {
//         id: 2,
//         name: 'User2'
//     }
// ]
const MongoClient = require('mongodb').MongoClient;
const _url = 'mongodb://localhost:27017';
const db = 'ibm';

const getUsers = (callback)=>{
    // Step 1: connect to mongo server
    MongoClient.connect(_url,(err,conn)=>{
        console.log('Connected');
        // 2: connect with db 
        conn.db(db).collection('users').find().toArray((err,result)=>{
            // final call back
            callback(err,result);
        });
        // 3: close the connection
        conn.close();
    })
}
const getUserbyId =  (_id,callback)=>{
    // Step 1: connect to mongo server
    MongoClient.connect(_url,(err,conn)=>{
        console.log('Connected');
        // 2: connect with db 
        conn.db(db).collection('users').find({_id: _id}).toArray((err,result)=>{
            // final call back
            callback(err,result);
        });
        // 3: close the connection
        conn.close();
    })
}
const saveUser =  (_user)=>{
    // Step 1: connect to mongo server
    MongoClient.connect(_url,(err,conn)=>{
        console.log('Connected');
        // 2: connect with db 
        conn.db(db).collection('users').insertOne(_user,(err,result)=>{
            // do something
        });
        // 3: close the connection
        conn.close();
    })
}

module.exports = {
    getUsers,
    getUserbyId,
    saveUser
}