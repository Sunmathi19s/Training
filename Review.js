import React from 'react'

export const Review = (props) => {
  return (
    <div>
        <p>We provide One Way and Round trip outstation taxi service at an very low fare.  </p> 
       
        <p> <button onClick={props.handleClick} className='btn btn-info'>+</button> </p>
        <p> Likes :{props.count}</p>

        <p> <button onClick={props.handleClick1} className='btn btn-danger'>-</button> </p>
        <p> Dis Likes :{props.Dcount}</p>
    </div>
  )
}
