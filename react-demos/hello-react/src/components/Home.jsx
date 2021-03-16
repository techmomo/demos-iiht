import { useEffect, useState } from "react";

const Home = () => { // functional components

    // this will not work without the react hooks or within a constructor
    // this.setState({
    //     message: 'Hello'
    // })
    useEffect(()=>{
        // this.setState({
        //     message: 'Hello'
        // });
    })

    const [counter, setCounter ]= useState(1);
    const [user] = useState( {id: 1, name : 'techmomo'});

    return(
        <div>
            <div>

            </div>
            <div>

            </div>
            <h2>Home Component....
                {
                    JSON.stringify(user)
                }
                <button onClick={()=> setCounter(counter+1)}> Update </button>
                <h3>Counter : {counter}</h3>
            </h2>
           
        </div>
    );
}

export default Home;