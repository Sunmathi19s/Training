import React from 'react'

export const NavBar = (props) => {
   
    let {data}=props;
    const list =data.filter(data => data.text.length>6)
  return (
    <div>
     {  
            list.map(
                (element,idx) =>{return <a key={idx} href={element.link} style={{margin:"15px"}}>{element.text}</a>

                }
            ) 
            // props.data.map(
            //  (element,idx) => {
                     
            //      return <a key={idx} href={element.link} style={{margin:"15px"}}>{element.text}</a>
            //       console.log(element.text)
            //  }
            // )

        
     } 
    </div>
  )
}