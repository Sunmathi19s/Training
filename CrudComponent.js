import React from 'react'
import { FetchData } from './FetchData'
import { AddDriver } from './AddDriver'

export const CrudComponent = () => {
    // const[driverList,setDriverList]=useState('');

   
    // const handleChange = (event) =>{
    //     setDriverList(driverList => [...event.target.value])

  return (
    <div>
         
         {/* <input type='text' name='driverList' onChange={handleChange}/> */}


        {/* <FetchData event={this.state.driverList}  handleChange={this.state.setDriverList} >
        </FetchData> */}
        <FetchData></FetchData>
        <AddDriver></AddDriver>
    </div>
  )
}
