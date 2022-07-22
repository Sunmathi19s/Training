import React,{useState} from 'react'

export const ContentAsFunction = () => {
    const [count,setCount] = useState(1);

    const [message,setMessage] = useState('');

    const handleClick  = () => {
        console.log('handle click called');
        setCount(count => count+1);
    }

    const handleChange = (event) =>{
        setMessage(message => [...event.target.value])
        // console.log(event.target.value);
        // setMessage( current => current+event.target.value);
    }

  return (
    <div>Count{count}
    <p><button onClick={handleClick} className='btn btn-info'> + </button></p>
    <p>
        {/* <input type='number' name='message' onChange={handleChange}/> */}
        <input type='text' name='message' onChange={handleChange}/>
        </p>  
        <p>Message:{message}</p>
    
    </div>
  )
}
