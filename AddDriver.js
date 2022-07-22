
import React,{useState,useEffect} from 'react'
import axios from 'axios';



export const AddDriver = () => {
    const[driver,setDriver] = useState({})

    const handleSubmit = (event) =>{
        event.preventDefault();
        console.log(driver);
         axios.post("http://localhost:6060/api/v1/drivers",driver)
                   .then(response => console.log(response.status))
    
    }
    const handlechange = (event) =>{
        let name=event.target.name;
        let value=event.target.value;
        setDriver(obj => ({...obj,[name] :value}))
    }
    

    
  return (
    <div>
        <form onSubmit={handleSubmit}>
        <div className='form-group'><label htmlFor="">Driver Id</label>
        <input type="text" name="driverId" onChange={handlechange} className='form-control' /></div>
        <div className='form-group'></div>

           <div className='form-group'><label htmlFor="">Driver Name</label> 
           <input type="text" name="driverName" onChange={handlechange} className='form-control'/></div>
           <div className='form-group'></div>


           <div><label htmlFor="">Date Of Birth</label>
           <input type="date" name="dateOfBrith" onChange={handlechange} className='form-control'/></div>
           <div className='form-group'></div>

           <div><label htmlFor="">Mobile Number</label>
           <input type="text"name="mobileNumber" onChange={handlechange} className='form-control' /></div>
           <div className='form-group'></div>
           <div><label htmlFor="">Rating</label>
           <input type="text" name="rating" onChange={handlechange} className='form-control'/></div>
           <div className='form-group'></div>
           <div><label htmlFor="">Location</label>
           <input type="text"name="location" onChange={handlechange} className='form-control' /></div>
           <input type='submit' value="Add"></input>
        </form>
    </div>
  )
}
