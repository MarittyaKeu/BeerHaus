import React, {useState, Fragment} from 'react';
import Form from './Form';
import axios from 'axios';


function CreateProduct(){
    
    const [formData, setFormData] = useState({
        name: '',
        type: '---',
        volume: '',
        date: '',
        description: '',
        media: ''
    })

    const onChange = (e) => setFormData({...formData, [e.target.name] : e.target.value});

    const onSubmit = (e) => {
        e.preventDefault();
        console.log(formData);
    }

    const fileUpload = () => {
        const config ={
            headers: {
                'content-type':'multipart/form-data'
            }
        }
        if (formData.type == 'wine'){
            const url = '/wines/addWine';
          
            axios.post(url,JSON.stringify(formData), config);
        }else{
            const url = '/beers/addBeer';
            axios.post(url,JSON.stringify(formData), config);

        }
    }


    return(
        <Fragment>
            <Form onSubmit={onSubmit} onChange={onChange} value={formData}></Form>
        </Fragment>        
    )

}

export default CreateProduct;