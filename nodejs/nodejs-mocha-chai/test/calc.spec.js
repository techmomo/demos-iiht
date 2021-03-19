const calc = require('../app/calc');

// Test Suites
// Test Specs - Specifications

const { expect } = require("chai");

// This is our test suite for calc
describe('Calculator Service ',()=>{

    // Validate deep assertions on array
    describe('Array can be deep asserted ',()=>{

        it('Array assertion is deep checking ',()=>{
            const arr = calc.arr();
            expect([100,20]).to.deep.equal(arr);
            expect({ id: 1, name : 'Usr'}).to.not.equal({id: 1, name: 'Usr '});

        });
    });

    // Validate addition operations
    describe('Calculator Addition ',()=>{
        //

        it('Hello Assertion ',()=>{
            expect("Hello").to.equal('Hello'); // this is a sample assertion
        });
        // to write test cases we can make use of specs
        it('Sum of 2 & 3 is 5 ',()=>{
            // write ur test case implementation here
            // use assertions to validate the data
            const result = calc.add(2,3);
            expect(result).to.equal(5);
        });

        it('Sum of 2 & 3 is greater than 3 ',()=>{
            // write ur test case implementation here
            // use assertions to validate the data
            const result = calc.add(2,3);
            expect(result).to.greaterThan(3);
        });
        
        it('Sum of 2 & 3 is not 0 ',()=>{
            // write ur test case implementation here
            // use assertions to validate the data
            const result = calc.add(2,3);
            expect(result).not.equal(0);
        });
    });
});