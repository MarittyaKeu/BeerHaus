import React , {Fragment, useState, useEffect} from 'react';
import axios from 'axios';
import Moment from 'react-moment';
import moment from 'moment';

const Beer = () => {
    const [prod, setProd] = useState({
        picture: 'corona.jpg',
        name: '',
        type: '',
        volume: '',
        description: '',
        date: '',
        length: 0
    });


    
    const getProd = () => {
        
        axios.get("/beers/getAllBeers").then(
            (res) => {
                
                let data = res.data;
                let index = prod.length;
                console.log(index);
                setProd({
                    picture :  data[index].picture,
                    name: data[index].name,
                    type: data[index].beerType,
                    volume: data[index].alcoholByVolume,
                    description : data[index].description,
                    date: data[index].date,
                    length: (prod.length + 1 === data.length) ? 0 : prod.length + 1
                })

                console.log(prod.picture)
            }
        ).catch( err =>
            console.error(err)
        )
    }

    useEffect( getProd, []);
 


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
                        <div className="right">
                            
                            <Moment format="MM/DD/YYYY">{moment.utc(prod.date)}</Moment>

                        </div>
                    </div>

                    <div className="item">
                        <div className="left ">description: </div>
                        <div className="right description">{prod.description}</div>
                    </div>
                    
                    {/* <div className="btn"> */}
                        <div className="btnNext">
                            {/* <input type="button" value="Next" /> */}
                            <button onClick={getProd}>
                                Next
                            </button>
                        </div>
                        
                    {/* </div> */}

                </div>
            
                

                      {/* <form onSubmit={e=> onSubmit(e)}>
            <input type="submit" value="start"/>
          </form> */}
            </div>
        </Fragment>
        
    )
}

export default Beer;
