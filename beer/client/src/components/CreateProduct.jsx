import React, {useState, Fragment} from 'react';
import Form from './Form';



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
        const url = '/wines/getAllWines';
        
    }


    return(
        <Fragment>
            <Form onSubmit={onSubmit} onChange={onChange} value={formData}></Form>
        </Fragment>        
    )

}

export default CreateProduct;