import React from 'react';
import Activity from './Activity';
import renderer from 'react-test-renderer'

// snapshot testing
it('Href changes the style on hover',()=>{
    const component = renderer.create(<Activity></Activity>);

    let _elements = component.toJSON();
    expect(_elements).toMatchSnapshot();

    // trigger events 
    _elements.props.onMouseEnter();
    // re-rendering
    _elements = component.toJSON();
    expect(_elements).toMatchSnapshot();
});

it('should have href value and css class as hover',()=>{
    const component = renderer.create(<Activity url="http://localhost"></Activity>);

    let _elements = component.toJSON();
    expect(_elements).toMatchSnapshot();

    // trigger events 
    _elements.props.onMouseEnter();
    // re-rendering
    _elements = component.toJSON();
    expect(_elements).toMatchSnapshot();

    // trigger event
    _elements.props.onMouseLeave();
    // re-rendering
    _elements = component.toJSON();
    expect(_elements).toMatchSnapshot(); 
});