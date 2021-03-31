import React from 'react';

const STATUS = {
    NORMAL : 'normal',
    HOVER : 'hover'
}
export default class Activity extends React.Component{
    constructor(props){
        super(props);

        this.state= {
            cssClass : STATUS.NORMAL
        }
    }
    onMouseEnter(){
        this.setState({ cssClass : STATUS.HOVER });
    }
    onMouseLeave(){
        this.setState({ cssClass: STATUS.NORMAL });
    }

    // render the component
    render(){
        return(
            <a className={this.state.cssClass}
                href={this.props.url || '#'}
                onMouseEnter={this.onMouseEnter.bind(this)}
                onMouseLeave={this.onMouseLeave.bind(this)}
                >
                {this.props.children}
            </a>
        );
    }
}