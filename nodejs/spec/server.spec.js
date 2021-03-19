const request = require('request');

describe('Test Server ',()=>{
    // test individual /apis in multiple aspects
    describe('GET / ',()=>{
        it('response status code is 200 ',(done)=>{
            request.get('http://localhost:3201/status',(err,response,body)=>{
                // call back function
                expect(response.statusCode).toBe(400);
                done();
            })
        });
    });
});
