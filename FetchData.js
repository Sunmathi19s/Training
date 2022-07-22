import axios from 'axios';
import React,{useState,useEffect} from 'react'
import { ShowData } from './ShowData';

export const FetchData = () => {
 
    const[driverList,setDriverList] = useState([]);

    useEffect(() => {

        axios.get("http://localhost:6060/api/v1/drivers").then( result => setDriverList(result.data))
        
    },[])

    return ( 

    <div>
     <ShowData data={driverList}></ShowData>
    </div>
  )
}
