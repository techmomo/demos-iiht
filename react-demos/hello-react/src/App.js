import './App.css';
import Home from './components/Home';
import User from './components/User';

function App() {
  return (
    <div className="App">
      <h2>Hello React</h2>
      <Home/>
      <User message="I am App Component"/>
    </div>
  );
}

export default App;
