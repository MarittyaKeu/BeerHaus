import React from 'react';
import axios from 'axios';
import Product from './components/Wine';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import './style/style.css';
import Beer from './components/Beer';
import Main from './components/Main';
import Wine from './components/Wine'
import Create from './components/CreateProduct';



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
    <Router>
      <Switch>
        <Route exact path='/' component={Main}/>
        <Route exact path='/beers/:id' component={Beer}/>
        <Route exact path='/wines/:id' component={Wine}/>
        <Route exact path='/create' component={Create}/>
      </Switch>
    </Router>
  );
}

export default App;
