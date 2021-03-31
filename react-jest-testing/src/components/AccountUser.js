import React from "react";

export default class AccountUser extends React.Component{
    constructor(props){
        super(props);
        this.state = {
            checked : true
        }
    }
    onCheckChange(){
        this.setState({
            checked : !this.state.checked
        })
    }
    render(){
        return(
            <div>
                <input type="checkbox" 
                onChange={this.onCheckChange.bind(this)}
                checked={this.state.checked}/>
                {this.state.checked ? this.props.accountUser: this.props.user}
            </div>
        );
    }
}