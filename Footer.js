import React from 'react'

export const Footer = ({designer,email}) => {
    const {mail,text} = email;
  return (
    <div>
        <hr/>
        <p> Designed By {designer} </p>
      
        <p> <a href ={'mailTo:' +mail}> {text}</a></p>
    </div>
  )
}
