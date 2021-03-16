import React from 'react';
import Employee from "./Employee";

export default class User extends React.Component{

    constructor(){
        super();
        
        // bind state manually
        this.handleUpdateMessage = this.handleUpdateMessage.bind(this);
    
        this.state={
            users: [],
            message: 'Not Clicked'
        }
        // this.state ={
        //     nums: [
        //         12, 30
        //     ],
        //     users:[
        //         {
        //             id: 1,
        //             name: 'User1'
        //         },
        //         {
        //             id: 2,
        //             name: 'User2'
        //         }
        //     ]
        // }

    }
    componentDidMount(){
        
        const userPromise = this.fetchUsers();
        userPromise.then(res=>{
            this.setState({
                users: res.data
            })
        })
    }
    render(){
        return(
            <div>User
                {
                    this.props.message
                }
                {
                    this.state.message
                }
                {/* <ul>
                    {
                        this.state.nums.map(i=>(<li>{i}</li>))
                    }
                </ul> */}
                <table>
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>NAME</th>
                        </tr>
                    </thead>
                    <tbody>
                        {
                            this.state.users.map(user=> (<tr>
                                                            <td>{user.id}</td><td>{user.first_name}</td>
                                                        </tr>))
                        }
                    </tbody>
                </table>
                <span>
                    <button onClick={this.handleClickMe.bind(this)}>Click Me!</button>
                </span>
                <Employee handleUpdateMessage={this.handleUpdateMessage}/>
            </div>
        );
    }
    fetchUsers(){
        const _url = 'https://reqres.in/api/users?page=1';
        return fetch(_url)
        .then(res=>res.json())
    }
    //
    handleClickMe(){
        console.log('Clicked me!');
        this.setState({
            message: 'Clicked'
        })
    }
    handleUpdateMessage(){
        this.setState({
            message: 'Message was updated by Employee'
        })
    }
}