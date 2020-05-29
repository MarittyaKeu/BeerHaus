import React from 'react';
import axios from 'axios';
import Product from './components/product';
import {BrowserRouter as Router, Route, Switch} from 'react-router-dom';
import './style/style.css';
import Beer from '../src/components/product';





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
        <Route exact path='/beer/:id' component={Product}/>
        <Route exact path='/beer/:id' component={Product}/>
      </Switch>
    </Router>
  );
}

export default App;
