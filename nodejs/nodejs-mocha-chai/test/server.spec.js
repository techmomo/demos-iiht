const { expect } = require("chai");
const request = require("request");

describe('Calculator API ',()=>{
    describe('Addition of two numbers ',()=>{
        let baseUrl='';
        // setup & teardown methods
        before(()=>{
            console.log('Before ');
            baseUrl = 'http://localhost:6701';
        });

        // afterEach(()=>{
        //     console.log('After Each');
        // })
        it('should return status code of 200 ',(done)=>{
            request(baseUrl+'/status',(err,response, body)=>{
                // perform assertion
                expect(response.statusCode).to.equal(200);
                done();
            });
        });

        it('should return message  ',(done)=>{
            request(baseUrl+'/status',(err,response, body)=>{
                // perform assertion
                expect(body).to.equal(JSON.stringify({message : "Server is up"}));
                done();
            });
        });

        it('should return status code of 200 for calc endpoint ',(done)=>{
            request(baseUrl+'/calc/add/2/3',(err,response, body)=>{
                // perform assertion
                expect(response.statusCode).to.equal(200);
                done();
            });
        });
        it('should return the sum of 2 & 3 as 5 ',(done)=>{
            request(baseUrl+'/calc/add/2/3',(err,response, body)=>{
                // perform assertion
                expect(body).to.equal(JSON.stringify({result : 5 }));
                done();
            });
        });
    });
});