import React , {Fragment, useState, useEffect} from 'react';
import axios from 'axios';



const Product = (props) => {
    const [prod, setProd] = useState({
        picture: 'corona.jpeg',
        name: 'corona lime',
        type: 'alcho',
        volume: '900',
        description: 'Corona Extra wery Cervecería Modelo Extra wery Cervecería Modelo Extra wery Cervecería Modelo Extra wery Cervecería Modelo and owned by Belgian company AB InBev. It is commonly served with a wedge of lime or lemon in the neck of the bottle to add tartness and flavour',
        date: new Date().getDate(),
        length: 1
    });

    const getProd = () => {
        setProd({
            picture: propps[1].picture,
            name: propps[1].name,
            type: propps[1].type,
            volume: propps[1].volume,
            description: propps[1].description,
            date: propps[1].date,
            length: 1
        })
    }

 


    return(
        <Fragment>
            <div className="container">
                <div className="picture">
                    <img src={require(`../../public/media/${prod.picture}`)} alt="" srcSet=""/>
                </div>

                <div className="desc">
                    <div className="item">
                        <div className="left">Name: </div>
                        <div className="right">{prod.name}</div>
                    </div>

                    <div className="item">
                        <div className="left">type: </div>
                        <div className="right">{prod.type}</div>
                    </div>

                    <div className="item">
                        <div className="left">volume: </div>
                        <div className="right">{prod.volume}</div>
                    </div>

                    <div className="item">
                        <div className="left">Founded date: </div>
                        <div className="right">{prod.date}</div>
                    </div>

                    <div className="item">
                        <div className="left ">description: </div>
                        <div className="right description">{prod.description}</div>
                    </div>

                    <div className="btn">
                        <button className="next" onClick={getProd()} >Next</button>

                    </div>

                      

                </div>
                
            </div>
        </Fragment>
        
    )
}

export default Product;
