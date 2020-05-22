import React from 'react';
import logo from './logo.svg';
import './App.css';
import axios from 'axios';
import Product from './components/product';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';

function App() {

  // const onSubmit = (e) => {
  //   e.preventDefault();
  //   axios.get("/wines/getAllWines")
  //   .then(
  //     res => console.log(res)
  //   )
  //   .catch( err =>
  //     console.error(err)
  //   )
  // }



  return (
    <div className="App">
      <Product type="wine"/>
      <Route exact path='/' component={Product}/>
{/* 
      <form onSubmit={e=> onSubmit(e)}>
        <input type="submit" value="start"/>
       </form>
       */}
    </div>
  );
}

export default App;
