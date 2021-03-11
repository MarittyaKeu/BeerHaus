import React from 'react';


function Form(props){
    const {name, type, volume, date, description} = props.value;

    return(
        // public\media\Budweiser.jpg
        <div className="container">
            <div className="picture">
                {/* <img src={require('../../public/media/Budweiser.jpg')} alt="" srcSet=""/> */}
            </div>
        


            <div className="desc">
                <form action="" className="form" onSubmit={e => props.onSubmit(e)} encType="multipart/form-data">  
                    <div className="item">
                        <div className="left">Name: </div>
                        <div className="right">
                            <input type="text" name="name" id="name" value={name} onChange={e => props.onChange(e)} required/>
                        </div>
                    </div>

                    <div className="item">
                        <div className="left">type: </div>
                        <div className="right">
                            <select name="type" id="type" value={type} onChange={e => props.onChange(e)} required>
                                <option value="">Please Select</option>
                                <option value="beer">Beer</option>
                                <option value="wine">Wine</option>
                            </select>
                        </div>
                    </div>

                    <div className="item">
                        <div className="left">volume: </div>
                        <div className="right">
                            <input type="text" type="number" name="volume" id="volume" value={volume} onChange={e => props.onChange(e)} required/>
                        </div>
                    </div>

                    <div className="item">
                        <div className="left">Founded date: </div>
                        <div className="right">
                            <input type="date" name="date" id="date" value={date} onChange={e => props.onChange(e)} required/>
                        </div>
                    </div>

                    <div className="item">
                        <div className="left ">description: </div>
                        <div className="right description">
                            <textarea name="description" id="description" cols="30" rows="10" onChange={e => props.onChange(e)} value={description} placeholder="256 characters remaining" required>
                                
                            </textarea>
                        </div>
                    </div>

                    
                <div className="custom-file item">
                    <div className="left ">Upload Image: </div>
                    <div className="right">
                        <input type="file" className="custom-file-input" name="media" id="customFile" onChange={e=> props.onChange(e)} accept=".jpg, .jpeg, .png*"/>
                    </div>
                </div>
                {/* <input hidden="spendId" value={spendingId} name="spendId" readOnly/> */}
                    
                    <div className="btnNext">
                       <input type="submit" className="btn" value="Create"/>
                    </div>
                </form>
            </div>
        </div>
    )
}

export default Form;