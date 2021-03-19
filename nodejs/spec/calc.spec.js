const calc = require('../calc');

// test suite
describe('Test Calculator Functionality ',()=>{

    // test cases
    // test case is alternately represented as spec in jasmine

    it('Sum of 2 & 3 is 5',()=>{
        const expected = calc.add(2,3);
        // perform assertion
        const actual = 5;
        expect(expected).toBe(actual);
    });
});