const adminUser = require('./auth').adminUser;

const authorize = (rq,rs,next)=>{
    //console.log('authorize method');
    // Check for Auth Header
    if(!rq.headers.authorization){
        return rs.status(401).json({
            error: 'Missing Auth Header'
        });
    }
    // parse the base 64 token
    console.log(rq.headers.authorization);
    const base64Str = rq.headers.authorization.split(' ')[1];
    const str = Buffer.from(base64Str,'base64').toString();
    console.log(str);
    const [_user,_pass] = str.split(':');
    console.log(`USER : ${_user} && PASS : ${_pass}`);

    if(_user == adminUser.username && _pass == adminUser.password){
        // if valid credentials
        // allow the default flow
        next()
    }else{
        // redirect
        rs.redirect('/unauthorize');
    }
}

module.exports={
    authorize
}


/// Basic Auth
// username:password
// Basic cyywbjyakjkasjkjas