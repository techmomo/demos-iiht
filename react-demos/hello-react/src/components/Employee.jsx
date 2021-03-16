import React from 'react';


export default class Employee extends React.Component{
    
    render(){
        return(
            <div>Employee...
                <button onClick={this.props.handleUpdateMessage}>Update User State</button>
            </div>
        );
    }
}