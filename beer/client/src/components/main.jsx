import React from 'react';
import '../style/main.css';
import Product from './Wine';

function Main(){
    return(
        <div className="main">
            {/* <Product props={[]}/> */}
            <a href="/beers/getAllBeers" className="alcohol">Beers</a>
            <a href="/wines/getAllwines" className="alcohol">Wines</a>

        </div>
    )
}

export default Main;